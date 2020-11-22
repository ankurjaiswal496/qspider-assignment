
public class assig9 {
    public boolean fastLast6(int[] arr)
    {   boolean ans=false;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[0]==6 || arr[arr.length-1]==6 )
            {
                ans=true;
            }

        }
        return ans;
    }
    public static void main(String[] args)
    {   int[] arr={1,2,6};
        int[] arr1={6,1,2,3};
        int[] arr2={13,6,1,2,3};
        assig9 ob=new assig9();
        boolean a=ob.fastLast6(arr);
        boolean a1=ob.fastLast6(arr1);
        boolean a2=ob.fastLast6(arr2);
        System.out.println(a);
        System.out.println(a1);
        System.out.println(a2);
    }
	public boolean fastLast6(int[] arr, int[] arr1) {
		return false;
	}
}
