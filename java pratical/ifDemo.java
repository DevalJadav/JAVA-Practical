import java.util.*;
class ifElseDemo
{
    public static void main(String[] args) 
    {
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Age:");
        age=sc.nextInt();
        
        if(age>=18)
        {
            System.out.println("You are Giving Vote");
        }
        else
        {
            System.out.println("Age is below 18 so...not eligible");
        }
    }
}