package Miniproject;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ReadCSV r=new ReadCSV();
		System.out.println("press 1 if you want to display complaints by year");
		System.out.println("press 2 if you want to display complaints by bank name");
		System.out.println("press 3 if you want to display complaints by complaint ID");
		System.out.println("press 4 if you want to calculate the days between two dates");
		System.out.println("press 5 if you want to display complaints closed/closed with explanation");

		System.out.println("Press 6 if you want to store new complaints");
		
		
		Scanner s=new Scanner(System.in);
		int c=s.nextInt();
		switch (c) {
		case 1:
			System.out.println("enter the year");
			String year=s.next();
			System.out.println(r.compbyyear(year));
			break;
		case 2:
			System.out.println("enter the bank name");
			String bank=s.next();
			System.out.println(r.compbybank(bank));
			break;
		case 3:
			System.out.println("Enter Company ID");
			String id = s.next();
			System.out.println(r.compbyid(id));
			break;
		case 4 :
			System.out.println("Enter date received");
			String date_received=s.next();
			System.out.println("Enter date sent");
			String date_sent=s.next();
			System.out.println(r.daystookbybank(date_received,date_sent));
			break;
		case 5:
			System.out.println("Enter Close or Closed with Explanation");
			String str = s.next();
			System.out.println(r.compbyExp(str));
			break;
		case 6: 
			System.out.println("Enter date received");
			String dt_received=s.next();
			System.out.println("Enter Product");
			String product=s.next();
			System.out.println("Enter Sub-Product");
			String sub_prod=s.next();
			System.out.println("Enter Issue");
			String enter_issue=s.next();
			System.out.println("Enter Sub-Issue");
			String sub_issue=s.next();
			System.out.println("Enter Company");
			String company=s.next();
			System.out.println("Enter State Initials");
			String state=s.next();
			System.out.println("Enter Zip Code");
			String zip=s.next();
			System.out.println("Enter Submitted Via");
			String sv=s.next();
			System.out.println("Enter Company response to consumer");
			String crtc=s.next();
			System.out.println("Enter Timely Respons");
			String tr=s.next();
			System.out.println("Enter Date Sent to company");
			String dstc=s.next();
			System.out.println("Enter Consumer disputed");
			String cons_disputed=s.next();
			System.out.println("Enter Complaint ID");
			String c_id=s.next();
			//System.out.println(r.com);
		default:
			System.out.println("Worng Choice Entered");
		}
		s.close();	
		
		

	}

}
