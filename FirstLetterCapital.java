
class Test
{
		public static void main(String [] args)
		{
				String s = "hello java";

				char [] ch = s.toCharArray();
				boolean space = true;


				for(int i = 0; i<ch.length; i++)
				{
						if(Character.isLetter(ch[i]))
						{
							if(space)
							{
								ch[i] = Character.toUpperCase(ch[i]);
								space = false;
							}
						}
						else
						{
							space = true;
						}
				}
				s = String.valueOf(ch);
				System.out.println(s);
		}

}
