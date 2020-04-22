package e._4and_5_april_aray_list_string;
import java.util.*;
public class intersection_of_array 
{

	public static void main(String[] args) 
	{
		int [] one = {10,20,20,30,40,40,90,90,100,}; 
		int [] two = {10,15,20,20,30,30,40,40,40,90,200,300};
		ArrayList<Integer> list ;
		list = new ArrayList<>();
		
		
	/*	for(int i = 0; i<= one.length-1; i++)
		{
			for(int j = 0; j<= two.length-1; j++)
			{
				if(one[i] == two[j]) {
					list.add(one[i]);
					break;
				}
				
				
			}
		}*/
		//System.out.println(list);
		int i =0;
		int j = 0;
		while(i< one.length&& j< two.length)
		{
			if(one[i] < two[j])
			{
				i++;
			}else if(one[i] > two[j])
			{
				j++;
			}else
			{
				list.add(one[i]);
				i++;
				j++;
			}
		}
		System.out.println(list);

	}

}
