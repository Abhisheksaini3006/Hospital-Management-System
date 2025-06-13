package src;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class HospitalManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Connection connection = DBConnection.getConnection();

        if (connection == null) {
            System.out.println("Database connection failed. Exiting...");
            return;
        }

        while (true) {
            System.out.println("\nHospital Management System");
            System.out.println("1. Add Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Add Doctor");
            System.out.println("4. View Doctors");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addPatient(connection, scanner);
                    break;
                case 2:
                    viewPatients(connection);
                    break;
                case 3:
                    addDoctor(connection, scanner);
                    break;
                case 4:
                    viewDoctors(connection);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    private static void addPatient(Connection connection, Scanner scanner) {
        try {
            System.out.print("Enter name: ");
            String name = scanner.next();
            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            System.out.print("Enter gender: ");
            String gender = scanner.next();
            System.out.print("Enter contact: ");
            String contact = scanner.next();
            System.out.print("Enter medical history: ");
            String medicalHistory = scanner.next();
            System.out.print("Enter admission date (YYYY-MM-DD): ");
            String admissionDate = scanner.next();
            System.out.print("Enter discharge date (YYYY-MM-DD): ");
            String dischargeDate = scanner.next();

            String query = "INSERT INTO patients (name, age, gender, contact, medical_history, admission_date, discharge_date) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, name);
            stmt.setInt(2, age);
            stmt.setString(3, gender);
            stmt.setString(4, contact);
            stmt.setString(5, medicalHistory);
            stmt.setString(6, admissionDate);
            stmt.setString(7, dischargeDate);
            stmt.executeUpdate();
            System.out.println("Patient added successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void viewPatients(Connection connection) {
        try {
            String query = "SELECT * FROM patients";
            PreparedStatement stmt = connection.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("patient_id") + ", Name: " + rs.getString("name") +
                                   ", Age: " + rs.getInt("age") + ", Gender: " + rs.getString("gender") +
                                   ", Contact: " + rs.getString("contact"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void addDoctor(Connection connection, Scanner scanner) {
        try {
            System.out.print("Enter name: ");
            String name = scanner.next();
            System.out.print("Enter specialization: ");
            String specialization = scanner.next();
            System.out.print("Enter experience (in years): ");
            int experience = scanner.nextInt();
            System.out.print("Enter shift timing: ");
            String shiftTiming = scanner.next();

            String query = "INSERT INTO doctors (name, specialization, experience, shift_timing) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, name);
            stmt.setString(2, specialization);
            stmt.setInt(3, experience);
            stmt.setString(4, shiftTiming);
            stmt.executeUpdate();
            System.out.println("Doctor added successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void viewDoctors(Connection connection) {
        try {
            String query = "SELECT * FROM doctors";
            PreparedStatement stmt = connection.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("doctor_id") + ", Name: " + rs.getString("name") +
                                   ", Specialization: " + rs.getString("specialization"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
