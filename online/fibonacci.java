import java.util.*;

class Myclass
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // 
        
       
        int a = 0;
        int b = 1;
        int sum = a+b; // 1 

        
        
       

        for(int i = 0; i< n; i++)
        {
            // sum = a + b; // 0 + 1 + 2
            System.out.println(a);
            

            a = b ;  // 1 
            b = sum ; // 1 
            sum = a+b;
            
                    System.out.println();

            
        }
        
        
    }
}
