import java.util.*;
class Area
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();
        double s=(a+b+c)/2;
        double d=s*(s-a)*(s-b)*(s-c);
        double z=Math.sqrt(d);
        System.out.format("%.2f",z);
    }
}