package managementsystem;
import java.util.ArrayList;

public class ReportGenerator {

    public static String generateReport(Student student, ArrayList<Grade> grades, Attendance attendance) {
        
        if (student == null) {
            return "ERROR: Please Add Student first!";
        }
        if (grades == null || grades.isEmpty()) {
            return "ERROR: Please Add at least 1 Grade first!";
        }
        if (attendance == null) {
            return "ERROR: Please Add Attendance first!";
        }

        // Calculate weighted GPA
        double totalWeightedMarks = 0;
        double totalWeights = 0;
        
        for (Grade g : grades) {
            totalWeightedMarks += g.getMark() * g.getWeight();
            totalWeights += g.getWeight();
        }
        
        double finalMark = 0;
        if (totalWeights != 0) {
            finalMark = totalWeightedMarks / totalWeights;
        }

        // Build report
        StringBuilder report = new StringBuilder();
        report.append("=== STUDENT REPORT ===\n");
        report.append("Student No: ").append(student.getStudentNumber()).append("\n");
        report.append("Name: ").append(student.getName()).append("\n\n");
        report.append("Grades:\n");
        Gradingscalee gs = new Gradingscalee();
        for (Grade g : grades) {
         String letter = gs.getLetter(g.getMark());
         report.append(g.getCode()).append(" - ").append(g.getSubject()).append(": ").append(g.getMark()).append("(").append(letter).append(") (Weight: ").append(g.getWeight()).append(")\n");
}
        report.append("\nfinalMark: ").append(String.format("%.2f", finalMark)).append(" weighted\n");
        report.append("Attendance: ").append(attendance.getAttended()).append("/").append(attendance.getTotal());
        report.append(" (").append(String.format("%.2f", attendance.getPercentage())).append("%)\n");

        return report.toString();
    }
}