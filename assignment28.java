class assignment28{
    public boolean middleXYZ(String s)
    {   if(s.length()%2==0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public static void main(String[] args) {
        assignment28 ob=new assignment28();
        boolean result=ob.middleXYZ("ABXYZAB");
        System.out.println(result);
        boolean result1=ob.middleXYZ("ABXYZAB");
        System.out.println(result1);
        boolean result2=ob.middleXYZ("BXYZABB");
        System.out.println(result2);

    }
}