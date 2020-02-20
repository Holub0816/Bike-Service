package sample;



import javax.sql.rowset.*;

import java.sql.*;


/**
 *Klasa implementujaca metody umozliwiajace na polaczenie sie z baza oraz wylaczenia polaczenia.
 * @author Maciej Holub, holubmaciek@gmail.com
 */

public class DBOperations {


    private static Connection connection = null;

    private static final String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=SerwisRowerowyAplikacja;user=Maciej;password=Maciej";


    /**
     * Metoda umozliwiajaca polaczenie sie z baza danych i tym samym dostep do danych w niej zawartych.
     */
    public static void dbConnect() {


        try {
            connection = DriverManager.getConnection(connectionUrl);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Metoda pozwalająca na rozłączenie się z bazą danych.
     */

    public static void dbDisconnect() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Metoda umozliwiajaca wykonanie zapytania do bazy danych.
     * @param queryStatement Parametr typu String bedacy trescia zapytania.
     * @return Instancja obiektu ResulSet przechowana w obiekcie typu CachedRowSet. Klasa ta zapobiega utracie danych w wyniku
     * niespodziewanego rozlaczeniu z baza w trakcie wykonywania operacji.
     * @throws SQLException
     */

    public static ResultSet dbExecuteQuerry(String queryStatement) throws SQLException {
        Statement statement = null;
        ResultSet resultSet = null;
        CachedRowSet cachedRowSet = RowSetProvider.newFactory().createCachedRowSet();  // Używam tej kasy aby zapobiec java.sql.SQLRecoverableException,
        // czyli zamknięciu połączenia z bazą w czasie uzyskiwania danych

        try {
            dbConnect();
            statement = connection.createStatement();

            resultSet = statement.executeQuery(queryStatement);

            cachedRowSet.populate(resultSet);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            dbDisconnect();

        }
        return cachedRowSet;
    }

    /**
     * Metoda umozliwiajaca wprowadzeniu, usunieciu, albo zaktualizowanie danych w bazie.
     * @param sqlStatement Parametr typu String bedacy trescia zapytania.
     * @throws SQLException
     */
    public static void dbExecuteUpdate(String sqlStatement) throws SQLException {

        Statement statement = null;
        try {
            dbConnect();
            statement = connection.createStatement();
            statement.executeUpdate(sqlStatement);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (statement != null) {
                statement.close();
            }

            dbDisconnect();
        }
    }

}
