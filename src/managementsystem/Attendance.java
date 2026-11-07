/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package managementsystem;

/**
 *
 * @author Game4u
 */
public class Attendance {
    //events recorded (both present and absent)
    int total = 0;
    int present = 0;
        

    public void markPresent() {
       total = total + 1;
       present = present + 1;
    }
   
    public void markAbsent() {
        total = total + 1; // Increment total attendance records
    }
    
    public double getPercent() {
        if(total == 0) {
            return 0;
        }
        
         // Note: We use 100.0 (a double) to ensure the result is a decimal, not an integer
        double percent = (present * 100.0) / total;
        
        // Return the calculated percentage
        return percent;
    }
    public double getPercentage() {
        return getPercent();
    }

    public String getStatus() {
        if(getPercent() >= 75) return "Good Standing";
        return "At Risk";
    }
    public void setAttended(int attended) {
        this.present = attended;
    }
    
    public void setTotal(int total) {
        this.total = total;
    }
    
    public int getAttended() {
        return present;
    }
    
    public int getTotal() {
        return total;
    }
}
     

