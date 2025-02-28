
/**
 * Write a description of class Salary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Salary
{
    
    /*Question 14
     * worked hours = worked hours  
     * hourly wage = hourly wage
     * total salary = worked hours X hourly wage
     * taxes/deductions = 30% of total salary
     * net pay = total salary - taxes/deductions
     */
    public void getSalary ( double hourlyHours, double hourlyWage){
        double totalSalary = hourlyHours * hourlyWage;
        double taxDeductions = totalSalary * 0.3;
        double netPay = totalSalary - taxDeductions;
        
        System.out.println(netPay);
    }
}   

