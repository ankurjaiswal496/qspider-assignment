public class starOut {
    public void  StarOut(String a)
    {
        String b="";
        int count=0;
        for (int i=0;i<a.length();i++)
        {
            if(a.charAt(i)=='*')
            {
                count++;
            }
        }   
        for(int j=0;j<a.length();j++)
        {
            if(a.charAt(j)=='*')
            {
                b+=a.substring(0, j-1)+a.substring(j+count+1, a.length());
                
            }
        }
        System.out.println(b); 
    }
    public static void main(String[] args) {
        starOut ob=new starOut();
        ob.StarOut("ab*cd");
      
    }
    
}
