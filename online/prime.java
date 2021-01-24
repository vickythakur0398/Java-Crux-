import java.util.*;

class myClass
{
    public static void main (String[] args)
    {
      Scanner scn = new Scanner(System.in);
      int a = scn.nextInt();
      int flag = 0;
      for(int i = 2; i <a; i++)
      {
        if(a %i ==0)
        {
            flag++;
            break;
        }
        
        
      }
      
      if(flag == 0)
        System.out.println("prime");
        
      else
        System.out.println(" NOT prime");

        
    }
        
    
}
