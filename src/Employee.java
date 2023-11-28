public class Employee
{
   // variables
   private int id;
   private double salary;

   // constructor
   public Employee(double amountPaid, int identifier)
   {
      salary = amountPaid;
      id = identifier;
   }

   // getter methods
   public int getId()
   {
      return id;
   }
   public double getSalary()
   {
      return salary;
   }

   // setter methods
   public void setId(int idNum)
   {
      id = idNum;
   }
   public void setSalary(double sal)
   {
      salary = sal;
   }

   // creates a display to be called from the main driver
   public void employeeDisplay()
   {
      System.out.print("Salary: $" + salary + "\nID: " + id + "\n");
   }
}

