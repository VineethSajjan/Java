import java.util.*;

//Using Recursion
class ReverseString {
	public static String helper(String s, int left, int right) {
		System.out.println(s);
		if (left >= right) ;

		char tmp = s.charAt(left);
		s.charAt(left++) = s.charAt(right);
		s.charAt(right--) = tmp;
		helper(s, left, right);
	}

	public static void main(String args[])
	{		
		System.out.println("Enter the string");	
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(helper(s, 0, s.length()-1));
		sc.close();
	}
}