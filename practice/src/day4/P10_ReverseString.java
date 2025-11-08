package day4;

public class P10_ReverseString 
{
	public static void main(String[] args) 
	{
		String s1 = "hello";
		String s2 = "";
		boolean flag = false;
		for(int i = s1.length() - 1; i >= 0; i-- )
		{
			s2 += s1.charAt(i);
		}
		System.out.println("orignal String : "+s1);
		System.out.println("Reversed String : "+s2);
		
		for(int i = 0; i < s1.length(); i++)
		{
			if(s1.charAt(i) != s2.charAt(i) ) 
			{
				flag = true;
				break;
			}
		}
		
		if(flag == false)	System.out.println("Palindrome");
		else 	System.out.println("Not Palindrome");
	}
}
