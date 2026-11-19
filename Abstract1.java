abstract public class Abstract1
{
    String name;
     
    abstract double claculateSalary();
    
    void displayEmployee()
    {
        System.out.println("Name: "+name);
        System.out.println("Salary: "+claculateSalary());
    }
    
}
