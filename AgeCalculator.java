
/**
 * Write a description of class AgeCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AgeCalculator
{
    // instance variables - replace the example below with your own
    private int currentYear = 2025;
    
    public  int getDriverAge( int birthYear){
        int age = currentYear - birthYear;
        if(age>=16){
            System.out.println("the user can drive");
        } else {
            System.out.println("not able to drive" +(16-age) +"years left");
        }
        return age;
    }


}
