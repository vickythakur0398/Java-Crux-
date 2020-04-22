package e._1_two_d_array_2_d;

public class wave_display {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[][] arr = { 
				{1,2,3,4},
				{5,6,7,8,},
				{9,10,11,12},
				//{13,14,15,16},
		
				
		};
		/*for(int i =0; i<arr.length; i++)
			{	int start = 0;
				int end = arr.length-1;
				if(i%2==0) 
				{
					start = start;
					
					while(start <= arr.length-1)
					{
						System.out.println(arr[start][i]);
						start++;
					}
					
				}else
				{
					 end = arr.length-1;
					while(end <= 0)
					{
						System.out.println(arr[start][i]);
						end--;
					}
					
				}
				
				
					
					
			
			}*/
		
		for(int rowcolumn_fixed = 0; rowcolumn_fixed<= arr[0].length-1; rowcolumn_fixed++)
	{
			
			if(rowcolumn_fixed%2==0)
			{
				for(int row = 0; row<= arr.length-1; row++)
				{
					System.out.println(arr[row][rowcolumn_fixed]);
				}
			}else 
				{
				for(int col = arr.length-1; col>=0; col--)
					{
						System.out.println(arr[col][rowcolumn_fixed]);
					}
				
				}
		}
		
	 }

	}


