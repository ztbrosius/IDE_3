public class Treasurer extends Employee{

    // variables
    private double budget;
    private String debtKnowledge;

    // constructor
    public Treasurer(double amountPaid, int identifier, double amonuntToSpend, String knowledgeOfDebt)
    {
        super(amountPaid, identifier);
        budget = amonuntToSpend;
        debtKnowledge = knowledgeOfDebt;
    }

    // getter methods
    public double getBudget(){
        return budget;
    }
    public String getDebtKnowledge(){
        return debtKnowledge;
    }

    // setter methods
    public void setBudget(double finances)
    {
        budget = finances;
    }
    public void setDebtKnowledge(String debt)
    {
        debtKnowledge = debt;
    }

    // creates a display to be called from the main driver
    public void employeeDisplay()
    {
        System.out.println("Job: Treasurer");
        super.employeeDisplay();
        System.out.println("Budget: $" + budget + "\nIs the company in debt: " + debtKnowledge);
    }
}
