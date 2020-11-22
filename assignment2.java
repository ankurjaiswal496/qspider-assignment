//Check whether give num is palindrome or not

class Program5 
{
	public static void main(String[] args) 
	{
		int num = 435;

		int rev = reverseNum(num);

		boolean res = isPalindrome(num, rev);

		if(res == true)
		{
			System.out.println(num+" is palindrome");
		}
		else
		{
			System.out.println(num+" is not a palindrome");
		}
	}

	public static int reverseNum(int num)
	{		
		int rev = 0, rem;
		//write reverse logic
        while(num>0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        

		return rev;
	}

	public static boolean isPalindrome(int org, int rev)
	{
		if(org == rev)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}