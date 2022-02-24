import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		int[] c=new int[s.length()];
		int time=0;
 
		for(int i=0;i<s.length();i++) {
			switch(s.charAt(i)) {
				case 65: case 66: case 67:
					c[i]=2;
					break;
				case 68: case 69: case 70:
					c[i]=3;
					break;
				case 71: case 72: case 73:
					c[i]=4;
					break;	
				case 74: case 75: case 76:
					c[i]=5;
					break;	
				case 77: case 78: case 79:
					c[i]=6;
					break;	
				case 80: case 81: case 82: case 83:
					c[i]=7;
					break;	
				case 84: case 85: case 86:
					c[i]=8;
					break;	
				case 87: case 88: case 89: case 90:
					c[i]=9;
					break;
			}
		}//전화번호
		for(int i=0;i<c.length;i++) {
			for(int j=2;j<=9;j++) {
				if(c[i]==j) {
					time+=(j+1);
				}
			}
		}
		System.out.println(time);
	}
}
