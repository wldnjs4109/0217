import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int[] r=new int[2];
		int max=0;
		
		for(int i=0;i<2;i++) {
			int num=sc.nextInt();
			r[i]=(num/100)+((num%100)-(num%10))+((num%10)*100);
		}
		
		for(int i=0;i<2;i++) {
			if(r[i]>max) {
				max=r[i];
			}
		}
		System.out.println(max);
	}
}
