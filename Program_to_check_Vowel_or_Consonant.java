import java.util.*;
class program
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        char a=input.nextLine().charAt(0);
        if(a=='a'||a=='A'||a=='e'||a=='E'||a=='i'||a=='I'||a=='O'||a=='o'||a=='U'||a=='u' )
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
    }
}