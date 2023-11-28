public class Waiter extends Employee{

    // variables
    private double tips;
    private int customers;

    // constructor
    public Waiter(double amountPaid, int identifier, double tipAmount, int customersServed)
    {
        super(amountPaid, identifier);
        tips = tipAmount;
        customers = customersServed;
    }

    // getter methods
    public double getTips(){
        return tips;
    }
    public int getCustomers(){
        return customers;
    }

    // setter methods
    public void setTips(double tipTotal)
    {
        tips = tipTotal;
    }
    public void setCustomers(int numberOfCustomers)
    {
        customers = numberOfCustomers;
    }

    // creates a display to be called from the main driver
    public void employeeDisplay()
    {
        System.out.println("Job: Waiter");
        super.employeeDisplay();
        System.out.println("Tips: $" + tips + "\nNumbers of customers served: " + customers);
    }
}
