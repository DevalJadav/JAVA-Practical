importjava.util.*;
class ifElseifDemo
{
	public static void main(String args[])
	{
		intsub1,sub2,sub3;
		int total=0,per;
		Scanner sc=new Scanner(System.in);
		sub1=sc.nextint();

		System.out.println("Enter sub2mark");
		sub2=sc.next();

		System.out.println("Enter sub3mark");
		sub3=sc.nextint();
		per=total/3;
		System.out.println("total=+total+"per="+per);
		if(per>=90)
			System.out.println("Gread A");
		elseif(per>=70&&per<90)
			system.out.println("Gread B");
		else if(per>=50 && per<70)
			System.out.println("Gread  C");
		else if(per>=40 && per<50)
			System.out.println("Gread  D");
		else
			System.out.println("Fail");
	}	
}