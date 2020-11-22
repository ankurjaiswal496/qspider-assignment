public class assignment26 {
    public void addSeperator(String s,String s1,int n)
    {String newString="";
        for(int i=0;i<n;i++)
        {   if(i<n-1)
            {
                newString+=s+s1.toUpperCase();
            }
            else
            {newString+=s;

            }
           

        }
        System.out.print(newString);
    }
    public static void main(String[] args) {
    assignment26 ob=new assignment26();
    ob.addSeperator("word","x",3);    
    }
    
}
