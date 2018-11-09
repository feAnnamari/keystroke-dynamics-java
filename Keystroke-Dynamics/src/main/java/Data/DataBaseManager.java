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
    private static Connection connection = null;
    private static Statement stmt = null;
    
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
        System.out.println();
        for (Typing typing : typings) {
            if(typing.getDwellTimes().size() == Global.PASSWORD.length() && typing.getFlightTimesT1().size() == (Global.PASSWORD.length()-1))
            {    
                String statement = "insert into " + typingTableName + " values (" ;
                for (int i = 0; i < typing.getDwellTimes().size(); i++)
                {
                    statement += (typing.getDwellTimes().get(i) + ",");
                }
                for (int i = 0; i < typing.getFlightTimesT1().size(); i++)
                {
                    if(i!=typing.getFlightTimesT1().size()-1)
                    {
                        statement+=(typing.getFlightTimesT1().get(i) + ",");
                    }
                    else{
                        statement+=(typing.getFlightTimesT1().get(i) + ")");
                    }
                }
                stmt.execute(statement);
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
