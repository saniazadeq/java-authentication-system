package org.example.finalproject.model.repository;

import org.example.finalproject.model.entity.User;

import java.sql.*;

import static java.lang.Class.forName;

public class UserRepository implements GenericRepository<User,String>{
    @Override
    public void save(User user) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","Admin@123");
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO USER VALUES(?,?)");
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String findPasswordById(String s) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","Admin@123");
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT PASSWORD FROM USER WHERE USERNAME=?");
            preparedStatement.setString(1,s);
            ResultSet resultSet = preparedStatement.executeQuery();
            String password;
            if (resultSet.next()){
                password = resultSet.getString("password");
            }else
                return null;
            resultSet.close();
            connection.close();
            preparedStatement.close();
            return password;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public boolean existsByUsername(String username) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","Admin@123");
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT USERNAME FROM USER WHERE USERNAME = ?");
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();
            boolean exists = resultSet.next();
            resultSet.close();
            preparedStatement.close();
            connection.close();
            return exists;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
