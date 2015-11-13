package afroz.snhu.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Afroz
 */
public class AttendanceDAO
{
    private static final String statement_sql = "select * from students";

    private class Database
    {
        private static final String connectionUrl = "jdbc:sqlserver://AFROZ-PC\\mssqlserver;database=JAVA_PROJECT;user=sa;password=snhuedu";
        Connection connection;
        Database() throws ClassNotFoundException, SQLException
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(connectionUrl);
        }
    }

    public List<Student> list() throws SQLException, ClassNotFoundException
    {
        List<Student> _class = new ArrayList<Student>();
        Database db = new Database();
        PreparedStatement statement = db.connection.prepareStatement(AttendanceDAO.statement_sql);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next())
        {
            Student category = new Student();
            category.setId(resultSet.getLong("id"));
            category.setName(resultSet.getString("usr_name"));
            category.setPass(resultSet.getString("user_pwd"));
            _class.add(category);
        }
        return _class;
    }
}
