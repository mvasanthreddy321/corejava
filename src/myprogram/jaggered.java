package myprogram;

public class jaggered {
	public int[][] create2DArray()//returning 2D int array!
	{
		int[][] s=new int[4][];
		s[0]=new int[4];
		s[1]=new int[2];
		s[2]=new int[3];
		s[3]=new int[1];
		
		
		for(int i=0;i<s.length;i++)//4
		{
			for(int j=0;j<s[i].length;j++)
			{
				s[i][j]=j+1;
			}
		}
		return s;		
	}
	public void dispArray()
	{
		int[][] g=create2DArray();//method called
		for(int i=0;i<g.length;i++)
		{
			for(int j=0;j<g[i].length;j++)
			{
				System.out.print(g[i][j]+ " ");
			}
			System.out.println();//next row
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		new jaggered().dispArray();

	}

}
