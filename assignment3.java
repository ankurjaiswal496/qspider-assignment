class Program6 
{
	public static void main(String[] args) 
	{
		int n = 25;

		sumOfNNum(n);
	}

	public static void sumOfNNum(int n)
	{   int num=n;
		//write the logic here
         int sum=0,i;
         n=(n*(n+1))/2;
         System.out.println("using formula--"+ n);

        //using for loop
        
        for(i=0;i<=num;i++)
        {
            sum=sum+i;
        }
        System.out.println("using for loop--"+sum);
    }
}