
package managementsystem;
import java.sql.Connection;
import java.sql.DriverManager;

public class Student {
     private String studentNumber;
    private String name;
    
    public Student(String studentNumber, String name) {
        this.studentNumber = studentNumber;
        this.name = name;
        
    }
    public String getStudentNumber() {
        return studentNumber;
    }
    public String getName() {
        return name;
    }
    
    
    
    public void setName(String name) {
        this.name = name;
    }
    
    
    public void displayStudent() {
        System.out.println("Student Number: " + studentNumber);
        System.out.println("Name: " + name);   
       
    }
    public static Connection getConnection() throws Exception {
    Connection con = DriverManager.getConnection("jdbc:derby:schoolDB;create=true", "app", "app");

    // Create tables if they don't exist yet - ignore error if they already exist
    try {
        con.createStatement().executeUpdate("CREATE TABLE students (studentNo VARCHAR(20) PRIMARY KEY, name VARCHAR(100))");
    } catch (Exception e) {}
    try {
        con.createStatement().executeUpdate("CREATE TABLE grades (studentNo VARCHAR(20), subjectCode VARCHAR(20), subjectName VARCHAR(100), mark DOUBLE, weight DOUBLE)");
    } catch (Exception e) {}
    try {
        con.createStatement().executeUpdate("CREATE TABLE attendance (studentNo VARCHAR(20), attended DOUBLE, total DOUBLE)");
    } catch (Exception e) {}

    return con;
}
    
}
