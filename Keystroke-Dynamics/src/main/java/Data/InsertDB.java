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

/**
 *
 * @author Annamari
 */
public class InsertDB {

    private static String dbURL = "jdbc:derby://localhost:1527/KeyStrokeDB";
    private static String typingTableName = "Typing";
    private static String usersTableName = "Users";
    // jdbc Connection
    private static Connection connection = null;
    private static Statement stmt = null;

    public void Start(User user)
    {
        createConnection();
        insertTypings(user);
        //shutdown();
    }
    
    private static void createConnection()
    {
        try
        {            
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            //Get a connection
            connection = DriverManager.getConnection(dbURL, "feAnnamari", "keystroke"); 
            System.out.print("Létrejött a kapcsolat.");
        }
        catch (Exception except)
        {
            except.printStackTrace();
        }
    }
    
    private static void insertTypings(User user)
    {
        try
        {
            
            stmt = connection.createStatement();
            stmt.execute("insert into " + usersTableName + " values ('" + user.getName() + "')");
            System.out.println();
            for (Typing typing : user.getTypings()) {
                if(typing.getDwellTimes().size() == Global.PASSWORD.length() && typing.getFlightTimesT1().size() == (Global.PASSWORD.length()-1))
                {
                    System.out.println(" values ((SELECT NAME FROM USERS WHERE USERS.NAME ='" + user.getName() + "'),'" +
                        typing.getDwellTimes().get(0) + "','"+ typing.getDwellTimes().get(1) + "','" +
                        typing.getDwellTimes().get(2) + "','"+ typing.getDwellTimes().get(3) + "','"+
                        typing.getDwellTimes().get(4) + "','"+ typing.getDwellTimes().get(5) + "','"+
                        typing.getDwellTimes().get(6) + "','"+ typing.getDwellTimes().get(7) + "','"+ 
                        typing.getDwellTimes().get(8) + "','"+ typing.getDwellTimes().get(9) + "','"+ 
                        typing.getDwellTimes().get(10) + "','"+
                        typing.getFlightTimesT1().get(0) + "','" + typing.getFlightTimesT1().get(1) + "','"+ 
                        typing.getFlightTimesT1().get(2) + "','" + typing.getFlightTimesT1().get(3) + "','" + 
                        typing.getFlightTimesT1().get(4) + "','" + typing.getFlightTimesT1().get(5) + "','" +
                        typing.getFlightTimesT1().get(6) + "','" + typing.getFlightTimesT1().get(7) + "','" +
                        typing.getFlightTimesT1().get(8) + "','" + typing.getFlightTimesT1().get(9)+ "')");
                    
                    
                    stmt.execute("insert into " + typingTableName + " (USERNAME, DWELLTIME1, DWELLTIME2, DWELLTIME3, DWELLTIME4, DWELLTIME5, DWELLTIME6, DWELLTIME7, DWELLTIME8, DWELLTIME9, DWELLTIME10, DWELLTIME11, FLIGHTTIME1, FLIGHTTIME2, FLIGHTTIME3, FLIGHTTIME4, FLIGHTTIME5, FLIGHTTIME6, FLIGHTTIME7, FLIGHTTIME8, FLIGHTTIME9, FLIGHTTIME10)" +
                        " values ((SELECT NAME FROM USERS WHERE USERS.NAME ='" + user.getName() + "')," +
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
    
  /*  private static void selectRestaurants()
    {
        try
        {
            stmt = conn.createStatement();
            ResultSet results = stmt.executeQuery("select * from " + typingTableName);
            ResultSetMetaData rsmd = results.getMetaData();
            int numberCols = rsmd.getColumnCount();
            for (int i=1; i<=numberCols; i++)
            {
                //print Column Names
                System.out.print(rsmd.getColumnLabel(i)+"\t\t");  
            }

            System.out.println("\n-------------------------------------------------");

            while(results.next())
            {
                int id = results.getInt(1);
                String restName = results.getString(2);
                String cityName = results.getString(3);
                System.out.println(id + "\t\t" + restName + "\t\t" + cityName);
            }
            results.close();
            stmt.close();
        }
        catch (SQLException sqlExcept)
        {
            sqlExcept.printStackTrace();
        }
    }*/
    
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
