public class fabonici {
    public static void main(String[] args) {
        System.out.println("1");
        int n1=0,n2=1,n3=0;
        for(int i=1;i<=5;i++)
        {n3=n1+n2;
         System.out.println(n3);
         n1=n2;
         n2=n3;   

        }
    }
}
