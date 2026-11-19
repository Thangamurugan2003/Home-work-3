public class Abstract3 extends Abstract1
{
    int h;
    int pay;
    void PartTimeEmployee(String name,int hour,int payperhour)
    {
        this.name = name;
        this.h = hour;
        this.pay = payperhour;
    }

    @Override
    double claculateSalary() {
        return h*pay;
    }
   
}
