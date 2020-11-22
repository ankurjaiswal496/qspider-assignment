
public class assignment14 {
    public void reverse(int[] arr)
    {   //int[] arr=new int[10];


        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+",");
         }
       System.out.print("\n");
    }
    public static void main(String[] args) {
        assignment14 ob=new assignment14();ś                                                                                                                                                                                      
             
                                                                                                                                                                                                                                                                             
        int[] arr1={1,2,3};
        int[] arr2={5,11,9};
        int[] arr3={7,0,0};
        ob.reverse(arr1);
        ob.reverse(arr2);
        ob.reverse(arr3);

    }
    
}
