package by.it.shcherbich.jd1.lesson24_JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

//
class ConnectionManager {
    static Connection getConnection() throws SQLException {
        ResourceBundle resource = ResourceBundle.getBundle("lesson24/db"); //загрузка пропети файла с настройками подключения к БД
        String url = resource.getString("url");
        String user = resource.getString("user");
        String pass = resource.getString("password");
        try {
            Class.forName(resource.getString("driver")); //загрузка класса драйвера базы данных
        } catch (ClassNotFoundException e) {
            throw new SQLException("Драйвер не загружен!");
        }
        return DriverManager.getConnection(url, user, pass); //установка соединения с БД
    }
}