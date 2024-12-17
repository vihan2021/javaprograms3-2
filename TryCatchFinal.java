package exphandling;

import java.util.Scanner;

public class Trycatchfinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner se=new Scanner(System.in);
		System.out.println("enter the numerator:");
		int num=se.nextInt();
		System.out.println("enter the denamenator:");
		int den=se.nextInt();
		int  res=num/den;
		System.out.println("the res is:"+res);
		}
		catch(Exception e)
		{
			System.out.println("Exception handled");
			
			
		}
		
		finally {
			System.out.println("inside finally block");
		}
		
		
	}

}
//output
enter the numerator:
10
enter the denamenator:
20
the res is:0
inside finally block
