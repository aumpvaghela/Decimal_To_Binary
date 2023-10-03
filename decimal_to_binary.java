package BasicProgram;
import java.util.Scanner;
public class decimal_to_binary {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int d_num,q,i=0,j;
		int b_num[]=new int[100];
		System.out.println("Enter a decimal number : ");
		d_num=sc.nextInt();
		q=d_num;
		while(q>0)
		{
			b_num[i++]=q%2;
			q=q/2;
		}
		System.out.println("Binary num is : ");
		for(j=i-1;j>=0;j--)
		{
			System.out.println(b_num[j]);
		}	
	}
}
