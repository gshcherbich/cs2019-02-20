package by.it.shcherbich.jd1.lesson24_JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class JDBC {
    static PreparedStatement ps = null;
    static Connection conn = null;
    static ResultSet rs = null;

    private static ArrayList<Countries> editTableCountries(String query) throws SQLException {
        ArrayList<Countries> list = new ArrayList<>();
        int idcountries = 0;
        String country_name = null;
        double population = 0.0;
        int square = 0;
        rs = ps.executeQuery(query);
        while (rs.next()) {
            idcountries = rs.getInt("idcountries");
            country_name = rs.getString("country_name");
            population = rs.getDouble("population");
            square = rs.getInt("square");
            list.add(new Countries(idcountries, country_name, population, square));
        }
        return list;
    }

    private static void menu() throws SQLException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1 = прочитать записи из БД");
            System.out.println("2 = добавить новую запись в БД");
            System.out.println("3 = удалить запись из БД");
            System.out.println("4 = изменить запись в БД");
            System.out.println("any key = выход");
            int i = sc.nextInt();
            if (i == 1) {
                ArrayList<Countries> list = editTableCountries("select * from pvt.countries");
                for (Countries countries : list) {
                    System.out.println(countries);
                }
            } else if (i == 2) {
                System.out.println("Введите название страны");
                String country_name = sc.next();
                System.out.println("Введите количество населения");
                double population = sc.nextDouble();
                System.out.println("Введите площадь");
                int square = sc.nextInt();
                ps.executeUpdate("insert into pvt.countries(country_name,population,square)" +
                        " values (\"" + country_name + "\"," + population + "," + square + ");");
            } else if (i == 3) {
                System.out.println("Введите id страны, которую необходимо удалить из базы");
                int idcountries = sc.nextInt();
                ps.executeUpdate("delete from pvt.countries where idcountries=" + idcountries + ";");
            } else if (i == 4) {
                System.out.println("Введите название страны, которую необходимо переименовать");
                String country_name = sc.next();
                System.out.println("Введите новое название страны");
                String country_name2 = sc.next();
                ps.executeUpdate("update pvt.countries set country_name=\"" + country_name2 + "\" where country_name=\"" + country_name + "\";");
            }
            else return;
        }
    }

    public static void main(String[] args) {
        try {
            conn = ConnectionManager.getConnection();
            ps = conn.prepareStatement("?");
            ps.setString(1, "SELECT * FROM pvt.countries;");
            menu();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
