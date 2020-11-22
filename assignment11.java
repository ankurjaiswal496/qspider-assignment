public class assignment11 {
    public void middleWay(int[] arr1,int[] arr2)
    {
        int mid1=(arr1.length-1)/2;
        int mid2=(arr2.length-1)/2;

        int[] arr3={arr1[mid1],arr2[mid2]};   
        // System.out.println(arr3[0]+","+arr3[1]);
        for(int i=0;i<arr3.length;i++)
        {
        System.out.print(arr3[i]);
        if(i!=arr3.length-1)
        {
            System.out.print(", ");
        }
        
    }
    System.out.println("\n");
}
    public static void main(String[] args)
    {   int[] arr1={1,2,3};
        int[] arr2={4,5,6};
        int[] arr3={7,7,7};
        int[] arr4={3,8,0};
        int[] arr5={5,2,9};
        int[] arr6={1,4,5};
        assignment11 ob=new assignment11();
        ob.middleWay(arr1,arr2);
        ob.middleWay(arr3,arr4);
        ob.middleWay(arr5,arr6);
       
    }
}
