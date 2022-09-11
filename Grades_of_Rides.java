import java.util.*;
class Grade
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int h=input.nextInt();
        int s=input.nextInt();
        int sf=input.nextInt();
        if(h>50 && s>60 && sf>100)
        {
            System.out.println("10");
        }
        else if(h>50 && s>60)
        {
            System.out.println("9");
        }
        else if(s>60 && sf>100)
        {
            System.out.println("8");
        }
        else if(h>50 && sf>100)
        {
            System.out.println("7");
        }
        else if(h>50 || s>60 || sf>100)
        {
            System.out.println("6");
        }
        else
        {
            System.out.println("5");
        }
    }
}