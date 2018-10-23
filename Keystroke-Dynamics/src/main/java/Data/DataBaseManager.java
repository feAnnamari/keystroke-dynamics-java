/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;

/**
 *
 * @author Annamari
 */
public class DataBaseManager {

    private static String dbURL = "jdbc:derby://localhost:1527/KeyStrokeDB";
    private static String typingTableName = "Typing";
    private static String usersTableName = "Users";
    // jdbc Connection
    private static Connection connection = null;
    private static Statement stmt = null;

    public void Start(ArrayList<Typing> typings)
    {
        //shutdown();
    }
    
    private static void createConnection()
    {
        try
        {            
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            //Get a connection
            connection = DriverManager.getConnection(dbURL, "feAnnamari", "keystroke"); 
            System.out.println("Létrejött a kapcsolat.");
        }
        catch (Exception except)
        {
            except.printStackTrace();
        }
    }
    
    public static void insertTypings(ArrayList<Typing> typings)
    {
        try
        {
            createConnection();
            stmt = connection.createStatement();
            //stmt.execute("insert into " + usersTableName + " values ('" + user.getName() + "')");
            System.out.println();
            for (Typing typing : typings) {
                if(typing.getDwellTimes().size() == Global.PASSWORD.length() && typing.getFlightTimesT1().size() == (Global.PASSWORD.length()-1))
                {                  
                    stmt.execute("insert into " + typingTableName + " (DWELLTIME1, DWELLTIME2, DWELLTIME3, DWELLTIME4, DWELLTIME5, DWELLTIME6, DWELLTIME7, DWELLTIME8, DWELLTIME9, DWELLTIME10, DWELLTIME11, FLIGHTTIME1, FLIGHTTIME2, FLIGHTTIME3, FLIGHTTIME4, FLIGHTTIME5, FLIGHTTIME6, FLIGHTTIME7, FLIGHTTIME8, FLIGHTTIME9, FLIGHTTIME10)" +
                        " values (" +
                        typing.getDwellTimes().get(0) + ","+ typing.getDwellTimes().get(1) + "," +
                        typing.getDwellTimes().get(2) + ","+ typing.getDwellTimes().get(3) + ","+
                        typing.getDwellTimes().get(4) + ","+ typing.getDwellTimes().get(5) + ","+
                        typing.getDwellTimes().get(6) + ","+ typing.getDwellTimes().get(7) + ","+ 
                        typing.getDwellTimes().get(8) + ","+ typing.getDwellTimes().get(9) + ","+ 
                        typing.getDwellTimes().get(10) + ","+
                        typing.getFlightTimesT1().get(0) + "," + typing.getFlightTimesT1().get(1) + ","+ 
                        typing.getFlightTimesT1().get(2) + "," + typing.getFlightTimesT1().get(3) + "," + 
                        typing.getFlightTimesT1().get(4) + "," + typing.getFlightTimesT1().get(5) + "," +
                        typing.getFlightTimesT1().get(6) + "," + typing.getFlightTimesT1().get(7) + "," +
                        typing.getFlightTimesT1().get(8) + "," + typing.getFlightTimesT1().get(9)+ ")"); 
                }
            }
            stmt.close();
        }
        catch (SQLException sqlExcept)
        {
            sqlExcept.printStackTrace();
        }
    }
    
    private static void shutdown()
    {
        try
        {
            if (stmt != null)
            {
                stmt.close();
            }
            if (connection != null)
            {
                DriverManager.getConnection(dbURL + ";shutdown=true");
                connection.close();
            }           
        }
        catch (SQLException sqlExcept)
        {
            
        }

    }    
}
