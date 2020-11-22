public class assignment17 {
    public boolean bobThere(String str) {
        
        int len = str.length();
        for (int i = 0; i < len - 2; i++) {
        if (str.charAt(i) == 'b' && str.charAt(i+2) == 'b')
         return true;
        }
        return false;
        }
        public static void main(String[] args)
        {
            assignment17 ob=new assignment17();
           boolean a= ob.bobThere("abcbob");
           boolean b= ob.bobThere("b9b");
           boolean c= ob.bobThere("bac");
           System.out.println(a);
           System.out.println(b);
           System.out.println(c);

        }
    
}
