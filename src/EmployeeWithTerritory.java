public class EmployeeWithTerritory extends Employee
{
   private int territory;
   public EmployeeWithTerritory(double amountPaid, int identifier, int employeeTerritory)
   {
      super(amountPaid, identifier);
      territory = employeeTerritory;
   }
   public int getTerritory()
   {
      return territory;
   }
   public void setTerritory(int terr)
   {
      territory = terr;
   }
}
