package myprogram;

public class Stringsdemo {

	public static void main(String[] args) {
		
		String name="Abi";//String pool
		String name1=new String("Abi");//Heap memory
		String name2="abi";
		String name3="Abi";
		
		//equals=>check the value only not the address
		System.out.println("Equals:::"+name.equals(name1));
		System.out.println("Equals:::"+name1.equals(name3));
		System.out.println("Equals:::"+name.equals(name3));
		System.out.println("Equals:::"+name.equals(name2));
		System.out.println("EqualsIgnoreCase:::"+name.equalsIgnoreCase(name2));
		
		//==:: Strict comparison operator
		//Check the value +address(type of memory)
		System.out.println("==:: "+(name==name1));//F
		System.out.println("==:: "+(name1==name3));//F
		System.out.println("==:: "+(name==name3));//T
		System.out.println("==:: "+(name==name2));//F
		
		String dept="Training Finance Insurance Hr";
		System.out.println("Contains:: "+dept.contains("Hr"));
		System.out.println("Contains:: "+dept.contains("Pitstop"));
		
		String a="Java";
		String b="JSP" +a + "PHP"+ "Python";//3 values in string pool
		String c=a+b;
		System.out.println("Concat:: "+c);
		
		System.out.println("Length:: "+a.length());
		System.out.println("CharAt:: "+a.charAt(2));//starts from 0
		System.out.println("Concat:: "+a.concat(b));

		String d="Good Morning";
		System.out.println("Substring:: "+d.substring(3,7));//start index,end index
		System.out.println("Substring:: "+d.substring(3));//start index,end index

		//convert any primitive to String
		String i=String.valueOf(65656.545f);
		String i1=String.valueOf(3343.6565d);
		System.out.println("ValueOf():: "+i + " "+i1);
		
		String lang="Java,Jsp,Servlets,Oracle,Mysql";
		System.out.println("Before Split():: "+lang.length());
		String[] list=lang.split(",");//
		for(String s:list)
		{
			System.out.println(s);
			System.out.println(s.length());
		}

		String dt = "01-23-2014";
		String dateParts[] = dt.split("-");
		String month  = dateParts[0];
		String day  = dateParts[1];
		String year = dateParts[2];
		System.out.println(month + " "+day + " "+year);
		
		System.out.println("StartsWith:: "+lang.startsWith("Java"));
		System.out.println("StartsWith:: "+lang.startsWith("Jsp"));
		System.out.println("EndsWith:: "+lang.endsWith("Java"));
		
		System.out.println("Indexof()::"+lang.indexOf("S"));
		System.out.println("Indexof()::"+lang.indexOf("a",5));//searching starts from 5th index

		System.out.println("LastIndexof:: "+lang.lastIndexOf("r"));
		System.out.println("LastIndexof()::"+lang.lastIndexOf("s",13));// searching backward starting at the specified index. 

		String addr="        Chennai         ";
		System.out.println("Length:: "+addr.length());
		System.out.println("Before Trim() :: "+addr);
		String addr1=addr.trim();//remove leading and trailing blank spaces!
		System.out.println("After Trim:: "+addr1);
		System.out.println("After Trim Length :: "+addr1.length());
		
		/*String is immutable (cannot be altered ) by default!
		 * 
		 */
		/*
		 * If your text is not going to change frequently then use a String class
		 * bcos String object is IMMUTABLE!!
		 */

		String str1="India";
		str1.toUpperCase();
		System.out.println("String(Immutable):: "+str1);
		System.out.println("String:: "+str1.toUpperCase());
		System.out.println("String(Immutable):: "+str1);
		String str2=str1.toUpperCase();
		System.out.println(str2 + " "+str1);
		

	}

}
