public class Abstract 
{

    public static void main(String[] args) 
    {
        Abstract2 a2 = new Abstract2();
        a2.FullTimeEmplyee("Nandees", 100000);
        System.out.println("Full Time Employee Details");
        a2.displayEmployee();
        System.out.println();
        
        Abstract3 a3 = new Abstract3();
        a3.PartTimeEmployee("Nandees",20,20);
        System.out.println("Part Time Employee Details");
        a3.displayEmployee();

        
    }
}
