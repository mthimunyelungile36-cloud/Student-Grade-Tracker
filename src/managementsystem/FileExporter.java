/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package managementsystem;

/**
 *
 * @author modie
 */

import java.io.FileWriter; // Import FileWriter class to write to files

public class FileExporter {
    
    // Method to export student data to CSV
    // students = array containing all student objects
    // count = number of students actually stored in array
public void export(Student[] students, int count) {
    try {
            // Create/open the file report.csv (overwrites if exists)
FileWriter fw = new FileWriter("report.csv");
            
            // Write the header row
fw.write("Student number,Name\n");
            
            // Loop through the students array up to count
for(int i = 0; i < count; i++) {
                // Write each student's number and name separated by comma
fw.write(students[i].getStudentNumber() + "," + students[i].getName() + "\n");
            }
            
            // Close the file to save changes
fw.close();
            
            // Confirmation message
System.out.println("Exported to report.csv");
        } 
 catch(Exception e) {
            // Catches any error (file not writable, etc.) and prints it
 System.out.println("Error: " + e);
        }
}
 
public void exportReport(String fullReport) {
    try {
        FileWriter fw = new FileWriter("report.csv");
        fw.write(fullReport);
        fw.close();
        System.out.println("Exported full report to report.csv");
    } catch (Exception e) {
        System.out.println("Error: " + e);
    }
}
}