import java.util.*;
class Code
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            double x1=sc.nextFloat();
            double x2=sc.nextFloat();
            double y1=sc.nextFloat();
            double y2=sc.nextFloat();
            double c=y1/x1;
            double d=y2/x2;
            if(c<d)
            {
                System.out.println("-1");
            }
            else if(c==d)
            {
                System.out.println("0");
            }
            else
            {
                System.out.println("1");
            }
        }
    }
}