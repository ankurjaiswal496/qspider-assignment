public class more14 {
    public void more(int[] arr)
    {int count1=0;int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1)
            {
                count++;
            }
            else{
                count1++;
            }
        }
        if(count>count1)
        {
            System.out.println("true");
        }
        else
        {  
            System.out.println("false");

        }
    }
    public static void main(String[] args) {
        more14 ob=new more14();
        int[] arr={1,4,1,4};
        ob.more(arr);
    }
    
}
