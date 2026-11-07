/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package managementsystem;

/**
 *
 * @author REITU
 */
public class Gradingscalee {

    public String getLetter(double mark){
        if(mark >= 80){
            return "A";
        } else if( mark >= 70){
            return "B";
        } else if(mark >= 60){
            return "C";
        } else if( mark >= 50){
            return "D";
        } else {
         return "F";  
        }
  
    }
    
}
