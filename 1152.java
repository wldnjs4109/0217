import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String S=sc.nextLine().trim();
		int count=1;
 
		if(S.isEmpty()) {
			count=0;
		}
 
		for(int i=0;i<S.length();i++) {
			if(S.charAt(i)==32) {
				count++;
			}
		}
		System.out.println(count);
	}
}
