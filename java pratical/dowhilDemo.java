import java.util.*;
class dowhilDemo
{
	public static void main(String args[])
	{
		int sum=0,i;
		char ch;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("enter no");
			i=sc.nextint();
			sum=sum+i;
			
			System.out.println("enter Y for yes and no for N");
		}
		while(ch=='y'||ch=='Y');
		
		System.out.println("Sum of no==>"+sum);

		}
}