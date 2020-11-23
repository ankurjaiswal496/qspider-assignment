public class zerofront {
    public int[] zeroFront(int[] arr)
    {   int count=0;
        for(int i=0;i<arr.length;i++)
        {if(arr[i]==0)
            {
                arr[i]=arr[count];
                arr[count]=0;
                count++;
            }

        }
        return arr;
}
    public static void main(String[] args) {
        int[] arr={1,0,0,1};
        zerofront ob=new zerofront();
        int[] arr1=ob.zeroFront(arr);
        for(int i=0;i<arr1.length;i++)
        {
        System.out.println(arr1[i]);
    }}
    
}
