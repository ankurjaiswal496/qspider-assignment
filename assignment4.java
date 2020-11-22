
class Program7 
{
	public static void main(String[] args) 
	{
		//write the logic
      //  isPrime(3);
        int n=3;
        boolean result=isPrime(n);
        if(result==true)
        {
              System.out.println(n+ " is prime ");

        }
        else
        {
              System.out.println(n+ " is not prime ");

        }
	}

	public static boolean isPrime(int num)
	{
		//write the logic
        boolean a=true;
        
        for(int i=2 ; i < num/2 ; i++) {
        if(num%i == 0) {
            a=false;
            break;
         }
        }
      
        return a;
    }
}