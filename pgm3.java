package lab1;
import java.util.*;
public class pgm3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s=obj.next();
		String s1=s.toLowerCase();
		String s2=s.toUpperCase();
		String result=s1.concat(s2);
		System.out.print("Result is "+result);
	}

}
