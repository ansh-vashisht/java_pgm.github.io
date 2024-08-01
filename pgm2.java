package lab1;
import java.util.*;
public class pgm2 {
	public static void main(String [] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a=obj.nextInt();
		int b=obj.nextInt();
		if(a%b==0)
			System.out.println(a+" is multiple of "+b);
		else
			System.out.println(a+" is not the multiple of "+b);
	}

}
