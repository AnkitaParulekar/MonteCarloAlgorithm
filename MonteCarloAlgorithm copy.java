import java.util.*;
public class MonteCarloAlgorithm {
	public static void main(String a[])
	{
		int n;
		int count=0;
		double u,v;
		double ratio=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of N");
		n=sc.nextInt();
		for(int k=1;k<n;k++)
		{
			u= Math.random();
			v=Math.random();
			
			if(((u*u)+(v*v))<= 1)
			{
				count=count+1;
			}
		}
		ratio=(double)count/(double)n;
		System.out.println("Ratio :"+ratio);
	}
}
