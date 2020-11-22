class Program8 
{
	public static void main(String[] args) 
	{
		String s = "Helloa@123";
		
		String alpha = extractAlpha(s);

		System.out.println("Extracted apha string = "+alpha);//o/p : Hello
	}

	public static String extractAlpha(String s)
	{
		String alpha="";
        int i;
		//write the logic here
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z')
            {
				// alpha=String.valueOf(s.charAt(i));
				// System.out.println(alpha);
				alpha=alpha+s.charAt(i);
            }
        }

		return alpha;
	}
}