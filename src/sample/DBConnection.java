package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DBConnection
{
    public static Connection dbConnection()
    {
        Connection conn = null;
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver:advanced-java-db2.ckox2difxc4f.us-east-1.rds.amazonaws.com,8088;database=Exam2;" +
                    "user=shuvool;password=12345asdfg;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30";
            conn = DriverManager.getConnection(url);
        }
        catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE,null,ex);

        }
        return conn;
    }
}

