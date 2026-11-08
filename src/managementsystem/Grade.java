package managementsystem;
public class Grade {
    private String subject;
    private double mark;
    private String code;
    private double weight;
    public Grade(String subject, String code , Double mark ) {
        this.subject = subject;
        setMark(mark); // Reusing setter to handle validation
        this.code = code;
        this.weight=1.0;
    }
    
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        if (mark < 0) {
            this.mark = 0;
        } else if (mark > 100) {
            this.mark = 100;
        } else {
            this.mark = mark;
        }
    }
    public String getCode() {
        return code;
    }
     public void setCode(String code) {
        this.code = code;
    }
     public double getWeight() {
        return weight;
    }
     public void setWeight(double weight) {
         this.weight = weight;
     }
     

    public boolean isPass() {
        return mark >= 50;
    }

    // Determines letter grade based on the mark
    public char getLetterGrade() {
        if (mark >= 80) {
            return 'A';
        } else if (mark >= 70) {
            return 'B';
        } else if (mark >= 60) {
            return 'C';
        } else if (mark >= 50) {
            return 'D';
        } else {
            return 'F';
        }
    }
    public double getGpaPoint() {
    if (mark >= 80) return 4.0;
    if (mark >= 70) return 3.0;
    if (mark >= 60) return 2.0;
    if (mark >= 50) return 1.0;
    return 0.0;
}

    // Returns a formatted string representation of the grade details
    @Override
    public String toString() {
        return subject + ": " + mark + "% (Grade: " + getLetterGrade() + ", Pass: " + isPass() + ")";
    }
}
