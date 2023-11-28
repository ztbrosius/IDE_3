// imports scanner
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // creates scanner object
        Scanner input = new Scanner(System.in);

        // tested with these to make sure the child classes were working
//        Employee employee1 = new Employee(1500.25, 1292);
//        //employee1.employeeDisplay();
//
//        Manager manager1 = new Manager(2000.75, 2451, 5, 7);
//        //manager1.employeeDisplay();
//
//        Treasurer treasurer1 = new Treasurer(1750.50, 1964, 20385.82, "yes");
//        //treasurer1.employeeDisplay();

//        Waiter waiter1 = new Waiter(775.00, 6124, 87.36, 17);
//        waiter1.employeeDisplay();


        // input statement to select a type of employee
        System.out.print("Types of employees: \n 1. Manager\n 2. Treasurer\n 3. Waiter\nSelect your employee: ");
        int selection = input.nextInt();


        // create if statement fill in the correct attributes from the selected employee
        if(selection == 1)
        {
            // manager
            System.out.print("Enter the salary: ");
            double salary = input.nextDouble();
            System.out.print("Enter the ID: ");
            int id = input.nextInt();
            System.out.print("Enter the years at the job: ");
            int years = input.nextInt();
            System.out.print("Enter the numbers of employees managed: ");
            int managed = input.nextInt();
//            System.out.println("\nManager\nSalary: $" + salary + "\nID: " + id + "\nYears at job: "    // originally made this which does the same thing as the lines below, but doesn't use the child class
//                    + years + "\nNumbers of employees managed: " + managed);
            System.out.println("\n");
            Manager newManager = new Manager(salary, id, years, managed);
            newManager.employeeDisplay();
        }
        else if(selection == 2)
        {
            // treasurer
            System.out.print("Enter the salary: ");
            double salary = input.nextDouble();
            System.out.print("Enter the ID: ");
            int id = input.nextInt();
            System.out.print("Enter the budget: ");
            double budget = input.nextDouble();
            System.out.print("Is the company in debt: ");
            String debt = input.next();
//            System.out.println("\nTreasurer\nSalary: $" + salary + "\nID: " + id +
//                    "\nBudget: $" + budget + "\nIs the company in debt: " + debt);
            System.out.println("\n");
            Treasurer newTreasurer = new Treasurer(salary, id, budget, debt);
            newTreasurer.employeeDisplay();
        }
        else if(selection == 3)
        {
            // waiter
            System.out.print("Enter the salary: ");
            double salary = input.nextDouble();
            System.out.print("Enter the ID: ");
            int id = input.nextInt();
            System.out.print("Enter the value of tips on the day: $");
            double tips = input.nextDouble();
            System.out.print("Enter the number of customers served: ");
            int customers = input.nextInt();
//            System.out.println("\nWaiter\nSalary: $" + salary + "\nID: " + id +
//                    "\nTips: $" + tips + "\nNumber of customers served: " + customers);
            System.out.println("\n");
            Waiter newWaiter = new Waiter(salary, id, tips, customers);
            newWaiter.employeeDisplay();
        }
        else
        {
            System.out.println("Not a valid employee");
        }
    }
}