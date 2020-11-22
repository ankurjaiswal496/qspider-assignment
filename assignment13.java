public class assignment13 {
    public void makeOutWord(String a,String b)
    {   
      String newString=new String();
       
        for(int i=0;i<a.length();i++)
        {
            newString += a.charAt(i); 
            if (i == 1) 
            { 
                newString += b; 
            } 
        }
        System.out.println(newString);

    }    
    public static void main(String[] args) {
        assignment13 ob=new assignment13();
        ob.makeOutWord("<<>>","yay");
        ob.makeOutWord("[[]]]", "WooHoo");
        ob.makeOutWord("<<>>", "word");
        
    }
}
