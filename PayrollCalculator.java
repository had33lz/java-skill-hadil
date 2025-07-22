public class PayrollCalculator {
    // Method to calculate weekly pay based on employee type and hours
    public static double calculateWeeklyPay(String employeeType, double
            hoursWorked, double hourlyRate) {
// Employee types: "FULL_TIME", "PART_TIME", "CONTRACTOR", "INTERN"
        switch (){
            // FULL_TIME: Regular pay for 40 hours, overtime (1.5x) for hours >
            case 1:
                if (hoursWorked <= 40 ){
                    double salary= hourlyRate * hoursWorked;
                }else{
                   double overtimeSal = (hourlyRate * 40)+ ((hoursWorked - 40)*hourlyRate);

                }
                break;

            case 2:
                // PART_TIME: Regular pay, no overtime, max 25 hours
                double salary= hourlyRate * Math.min(hoursWorked,25);
                break;

            case 3:
                // CONTRACTOR: Flat rate, no overtime rules
                salary = hourlyRate * hoursWorked;
                break;

            case 4:
                // INTERN: 20% discount from hourly rate, max 20 hours
                salary = Math.max(hoursWorked,20) * (hourlyRate-(20/100));
                break;
            default:
                System.out.println("Invalid input " );
                return 0;
        }

    }
    // Method to calculate tax deduction based on pay brackets
    public static double calculateTaxDeduction(double grossPay, boolean
            hasHealthInsurance) {
        double tax;
// Tax brackets using nested if-else:
        if (grossPay>0 && grossPay<=500){
            tax = grossPay*(10/100);
        }// $501-1000: 15% tax
else if (grossPay>500 && grossPay<=1000){
            tax = grossPay*(15/100);
        }// $1001-2000: 20% tax
        else if (grossPay>1000 && grossPay<=2000){
              tax = grossPay*(20/100);
        } else {
             tax = grossPay * 25/100;
        }
        if (hasHealthInsurance == true) {// If hasHealthInsurance is true, reduce tax by $50

            tax = (tax - 50);
        }
        return Math.max( tax, 0);

// Above $2000: 25% tax

// Return total tax amount
    }
    // Method to process multiple employees and find statistics
    public static void processPayroll(String[] employeeTypes, double[] hours,
                                      double[] rates, String[] names) {
// Calculate pay for each employee
// Find: highest paid employee, lowest paid employee, average pay

// Count how many employees worked overtime (>40 hours)
// Display results in a formatted table
// Handle arrays of different lengths gracefully
    }
    public static void main(String[] args) {
// Test data:
        String[] types = {"FULL_TIME", "PART_TIME", "CONTRACTOR", "INTERN",
                "FULL_TIME"};
        double[] hours = {45, 20, 35, 15, 50};
        double[] rates = {25.0, 18.0, 40.0, 12.0, 30.0};
        String[] names = {"Alice", "Bob", "Charlie", "Diana", "Eve"};
// Test individual calculations first
// Then process the entire payroll
// Show all results clearly

    }
}
