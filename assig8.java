public class assig8 {
    static void roundNumber(int a, int b)
    {   int c=10-a;
        int d=10-b;
      
        if( Math.abs(c)>Math.abs(d))
        {
            System.out.println(b +" is near to 10");
        
        }
        else if( Math.abs(c)<Math.abs(d))
        {
            System.out.println(a +" is near to 10");
        }
        else
        {
            System.out.println(a+","+b +"--0");
        }
      
    }
    public static void main(String[] args)
    {
        roundNumber(8, 13);
        roundNumber(13, 8);
        roundNumber(7, 13);
    }
}
