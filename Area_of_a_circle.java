import java.util.*;
class Area
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        double r=input.nextDouble();
        double pi=3.14;
        double area=pi*r*r;
        System.out.format("%.2f",area);
    }
}