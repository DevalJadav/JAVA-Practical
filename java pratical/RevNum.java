importjava.util.*;
class RevNum
{
	public static void main(String args[])
	{
		Scannersc=new Scanner(System.in);
		intnum,temp,rev=0,rem;
		System.out.println("Enter the no");
		num=sc.nextint();

		temp=num;
		while(temp>0)
	{
		rem=temp%10;
		rev=rev*10+rem;
		temp=temp/10;
}
}
}