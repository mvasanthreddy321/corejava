package myprogram;

public class multiarray {

	public static void main(String[] args) {
		
		int[][] k= 
			{
				{1,2,4},
				{56,87,45,576,76767},
				{45,76,5656}				
			};

		int[][] k1= new int[][]
				{
			{1,2,4},
			{56,87,45,576,76767},
			{45,76,5656}				
				};
		/*		
		for(int i=0;i<k.length;i++)
		{
			for(int j=0;j<k[i].length;j++)
			{
				System.out.print(k[i][j]+" ");
			}
			System.out.println();
		}
*/
				for(int i[] :k)
				{
					for(int j:i)
					{
						System.out.print(j+" ");
					}
					System.out.println();
				}
	}

}
