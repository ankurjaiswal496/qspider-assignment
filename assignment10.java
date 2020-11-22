public class assignment10 {
    public boolean fastLast6(int[] arr,int[] arr1)
    {   boolean ans=false;
        for(int i=0;i<arr.length;i++)
        {for(int j=0;j<arr1.length;j++)
            {
                if(arr[0]==arr1[0] || arr[arr.length-1]==arr1[arr1.length-1])
                {
                    ans=true;
                }
            }
            

        }
        return ans;
    }
    public static void main(String[] args)
    {  
        int[] arr={1,2,3};
        int[] arr1={7,3};
        int[] arr2={1,2,3};
        int[] arr3={7,3,2};
        int[] arr4={1,2,3};
        int[] arr6={1,3};
        assignment10 ob=new assignment10();
        boolean a=ob.fastLast6(arr,arr1);
        boolean a1=ob.fastLast6(arr2,arr3);
        boolean a2=ob.fastLast6(arr4,arr6);
        System.out.println(a);
        System.out.println(a1);
        System.out.println(a2);
    }
}
