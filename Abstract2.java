package abstractpack.Abstractmain;

public class Abstract2 extends Abstract1
{

    double monthlysal;
    
   void FullTimeEmplyee(String name ,double sal)
   {
       this.name =name;
       this.monthlysal = sal;
   
   }

    @Override
    double claculateSalary() 
    {
        return monthlysal;
   
    }
     
}
