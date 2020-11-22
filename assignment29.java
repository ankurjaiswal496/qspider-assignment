public class assignment29 {
    public boolean has12(int[] arr)
    {
        boolean a1=false;
        boolean a2=false;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1)
            {
                a1= true;

            }
            if(arr[i]==2 && a1)
            {
                a2=true;
            }
            
        }
        return a2;
    }
    public static void main(String[] args) {
        int[] arr={1,3,2};
        assignment29 ob=new assignment29();
        boolean result=ob.has12(arr);
        System.out.println(result);

    }
}
