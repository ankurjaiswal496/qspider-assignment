public class assigtnment25 {
    public void repeatEnd(String s,int n)
    {   String s1="";
        
        int len=s.length();
        for(int i=0;i<n;i++)
        {   s1+=s.substring(len-n,len);
             
        }
        System.out.print(s1);
       
}
    
public static void main(String[] args) {
    assigtnment25 ob=new assigtnment25();
    ob.repeatEnd("hello", 3);

}
}
