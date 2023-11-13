package Week4;

import java.sql.*;
import java.util.Scanner;



    public class ProjectOne {
        public static void main(String[] args) throws SQLException {
            ProjectOne.createTable();
            ProjectOne.populateTable();
        }


        String url = "jdbc:mysql://127.0.0.1:3306/project_one";
        String username = "root";
        String password = "Block15@11";

        public static void createTable() {
            try (Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/project_one", "root", "Block15@11");
                 Statement statement = connection.createStatement()) {

                String create = "CREATE TABLE IF NOT EXISTS users(name Text, email Text, age Integer, password Text, location Text, designation text)";
                statement.execute(create);


                System.out.println("Table created successfully.");

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

        public static int populateTable() throws SQLException {
            int count = 0;

            try (Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/project_one", "root", "Block15@11");
                 PreparedStatement preparedStatement= connection.prepareStatement(
                         "INSERT INTO your_table_name (Name, Email, Age, Location, Designation) VALUES (?, ?, ?, ?, ?)")) {

                Scanner scanner = new Scanner(System.in);


                for (int i = 0; i < 10; i++) {
                    String name;
                    String email;
                    int age;
                    String location;
                    String designation;

                    System.out.println("Input your Name: ");
                    name = scanner.nextLine();
                    System.out.println();

                    System.out.println("Input your Email: ");
                    email = scanner.nextLine();
                    System.out.println();

                    System.out.println("Input your Age: ");
                    age = scanner.nextInt();
                    System.out.println();

                    System.out.println("Input your Location: ");
                    location = scanner.nextLine();
                    System.out.println();

                    System.out.println("Input your Designation: ");
                    designation = scanner.nextLine();
                    System.out.println();

                    // Set values for the prepared statement
                    preparedStatement.setString(1, name);
                    preparedStatement.setString(2, email);
                    preparedStatement.setInt(3, age);
                    preparedStatement.setString(4, location);
                    preparedStatement.setString(5, designation);
                    preparedStatement.execute();
                    count++;
                    System.out.println(count + " " + "successful");

                }

            } catch (SQLException se) {
                System.out.println(se.getMessage());
            }

            return count;
        }


    }

