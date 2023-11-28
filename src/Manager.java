public class Manager extends Employee{

    // variables
    private int years;
    private int inChargeOf;

    // constructor
    public Manager(double amountPaid, int identifier, int yearsAtJob, int numberInCharge)
    {
        super(amountPaid, identifier);
        years = yearsAtJob;
        inChargeOf = numberInCharge;
    }

    // getter methods
    public int getYears(){
        return years;
    }
    public int getWorkersManaged(){
        return inChargeOf;
    }

    // setter methods
    public void setYears(int yearsWorked)
    {
        years = yearsWorked;
    }
    public void setWorkersManaged(int amountManaged)
    {
        inChargeOf = amountManaged;
    }

    // creates a display to be called from the main driver
    public void employeeDisplay()
    {
        System.out.println("Job: Manager");
        super.employeeDisplay();
        System.out.print("Years at job: " + years + "\nAmount of people in charge of: " + inChargeOf);
    }

}
