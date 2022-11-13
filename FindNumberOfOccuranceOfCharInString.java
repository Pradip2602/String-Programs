
class Test
{
	public static void main(String [] args)
	{
		// find out number of occurances of character

		String str1 = "Hello I am Pradip";
		
		// find out total length of string.
		int len = str1.length();

		// now replace the character with "" empty space.

		int afterRemoval =str1.replace("a","").length();

		int count = len - afterRemoval;

		System.out.println("Number of occurances of a are: "+count);
	}

	
}
