public class catdog {
    public void catDog(String a)
    {int count=0;int count1=0;
        for(int i=0;i<a.length()-2;i++)
        {String t=a.substring(i, i+3);
            if(t.compareTo("cat")==0)
            {
                count++;
            }
            if(t.compareTo("dog")==0)
            {
                count1++;
            }
        }
        System.out.println(count+" "+count1);
        if(count==count1)
        {System.out.println("true");}
        else{
            System.out.println("false");
        }
    }
    public static void main(String[] args) {
        catdog ob=new catdog();
        ob.catDog("catdog");
        ob.catDog("catcat");
ob.catDog("1cat1cadodog");
    }
    
}
