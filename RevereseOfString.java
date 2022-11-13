
class Test
{
	public static void main(String [] args)
	{
		// input string
		String str = "ABCD";
		
		// we will extract each charcter from string and store in rev. 
		String rev = "";
	
		// first find out the length of String.
		int len = str.length();

		// traversing the string from end		
		
		for(int i=len-1; i>=0; i--)
		{
			rev = rev+str.charAt(i);
	
		}

		System.out.println("The reverse of string is : "+rev);
	}
}
