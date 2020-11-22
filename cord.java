import java.util.*; 
  
class cord { 
  
static void block(long x) 
{ 
    ArrayList<Integer> v = new ArrayList<Integer>(); 
    double a=0; 
    long b=x;
    // Convert decimal number to 
    // its binary equivalent 
    System.out.print(x+ " : "); 
    while (x > 0)  
    { 
        v.add((int)x % 5); 
        x = x / 5; 
    
    } 
    for (int i = 0; i < v.size(); i++)  
     { 
        if (v.get(i) == 1)  
        { 
        a=a+Math.pow(5, i);
     } 
     
    } 
   
    //System.out.println(Math.round(a));
   
    if(b==Math.round(a))
    {
        System.out.println("PASSED");
    }
    else
    {
        System.out.println("FAILED");
    }

} 
  
// Driver Code 
public static void main(String args[]) 
{ 
    block(394376); 
    block(421875); 
    block(390625); 
    block(781250); 
    block(484377); 
} 
} 