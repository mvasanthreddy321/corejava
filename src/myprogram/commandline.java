package myprogram;

public class commandline {

	public static void main(String[] args) {
		System.out.println("cmdline length"+args.length);
		if(args.length==0)
			System.out.println("No inputs are there");
		else
		{
		   for(int i=0;i<args.length;i++)
		   {
		       System.out.println(" args["+i+"]"+args[i]);
		   }
		}
		 System.out.println("add " +((Integer.parseInt(args[0])) +(Integer.parseInt(args[1]))));

	}

}
