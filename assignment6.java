class Program9 
{
	public static void main(String[] args) 
	{
		int count = primeCount(1, 100);

		System.out.println("Total prime numbers between 1 to 100 = "+count);
	}

	public static int primeCount(int sp, int ep)
	{
		int count = 0;
        int i =0;
        int num =0;
       
		for( i = sp; i <= ep; i++)
		{
            int counter=0; 	  
            for(num =i; num>=1; num--)
        {
               if(i%num==0)
           {
           counter = counter + 1;
           }
        }
        if (counter==2)
        {
           count+=1;
        }	
			
		}

		return count;
	}
}