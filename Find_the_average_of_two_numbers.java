import java.util.*;
class Average
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=(a+b)/2;
        System.out.format("%.4f",c);
    }
}