package myprogram1;

public class sample8 {

	public static void main(String[] a) {
		
		
		int s=(Integer.parseInt(a[0]));
		
		int gross=(s)/(144);
		int dozen=(s)%(144);
		 int dozens=(dozen)/12;
		 int remain =(dozen)%12;
		
		 
		System.out.println(" Your number of eggs is "+ gross +" gross,"+dozens+" dozen,"+" and "+remain);


	}

}
/*
10. Consider user has N eggs. Then display the no of eggs in gross (144 eggs make one gross) and 
no of eggs in dozen (12 eggs make one dozen) and the no of eggs that is left out remaining. 
The total no of eggs can be got as input through command line. The program should display
how many gross, how many dozen, and how many left over eggs the user has.

Solution Guidance (if applicable): For example, if the input is 1342 eggs, then the program should respond with 
        Your number of eggs is 9 gross, 3 dozen, and 10
*/