 class pyramid
{					
	public static void main(String args[])       
	{              int n=5;                                                           
		for(int i=0;i<n;i++)//num of row
		{ 
		     for(int j=n-i;j>1;j--)
			{
			System.out.print(" ");
 			}
		    for(int j=0;j<=i;j++)//num of columns
		     {
			System.out.print("* ");
		     }
			System.out.println();
		} 
		
	}
}