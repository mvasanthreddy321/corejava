package Miniproject;


import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class ReadCSV {
	static List<Complaint> comp=new ArrayList<Complaint>();

	static{
		
		String fileName = "C:\\Users\\vasanth\\Downloads\\complaints.csv";
		try (Stream<String> lines = Files.lines(Paths.get(fileName))) {
			List<List<String>> values = lines.map(line -> Arrays.asList(line.split(","))).collect(Collectors.toList());
			for(int i=0;i<values.size();i++) {
				int j=0;
				String daterec=values.get(i).get(j++);
				String product=values.get(i).get(j++);
				String subproduct=values.get(i).get(j++);
				String issue=values.get(i).get(j++);
				String subissue=values.get(i).get(j++);
				String company=values.get(i).get(j++);
				String state=values.get(i).get(j++);
				String zip=values.get(i).get(j++);
				String submitted=values.get(i).get(j++);
				String datesent=values.get(i).get(j++);
				String companyrestocust=values.get(i).get(j++);
				String timelyresponse=values.get(i).get(j++);
				String custdisputed=values.get(i).get(j++);
				String compid=values.get(i).get(j++);
				comp.add(new Complaint(daterec,product,subproduct,issue,subissue,company,state,zip,submitted,datesent,companyrestocust,timelyresponse,custdisputed,compid));
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public List<String> compbyyear(String year)
	{
		List<String> res=new ArrayList<String>();
		for(int i=0;i<comp.size();i++)
		{
			String s=comp.get(i).getDaterec();
				if(year.equals(s.substring(6)))
				{
					res.add(comp.get(i).getIssue());
				}
		}
		return res;
	}
	public List<String> daystookbybank(String date_received,String date_sent)
	{
		List<String> res=new ArrayList<String>();
		for(int i=0;i<comp.size();i++)
		{
			try {
				LocalDate s = LocalDate.parse(comp.get(i).getDaterec());
				LocalDate v = LocalDate.parse(comp.get(i).getDatesent());
				long noOfDaysBetween = ChronoUnit.DAYS.between(s,v);
				System.out.println("No. of days Between: "+noOfDaysBetween);
			}
		 catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		return res;
	}
	
	public Set<String> compbyExp(String str){
		Set<String> res=new HashSet<String>();
		for(int i=0;i<comp.size();i++)
		{
			String s=comp.get(i).getCompanyrestocust();
			if(s.equalsIgnoreCase("closed")||s.equalsIgnoreCase("closed by explanation"))
			{
				res.add(comp.get(i).getIssue());
			}
		}
		return res;
	}
	
	/*public List<String> enterdetails(String dt_received,String product,String sub_prod,String enter_issue,String sub_issue)
	{
	
	}*/

	public Set<String> compbyid(String id){
		Set<String> res=new HashSet<String>();
		for(int i=0;i<comp.size();i++)
		{
			String s=comp.get(i).getCompid();
			if(id.equals(s))
			{
				res.add(comp.get(i).getIssue());
			}
		}
		return res;
	}
	
	public Set<String> compbybank(String bank){
		Set<String> res=new HashSet<String>();
		for(int i=0;i<comp.size();i++)
		{
			String s=comp.get(i).getCompany();
			if(bank.equals(s))
			{
				res.add(comp.get(i).getIssue());
			}
		}
		return res;
	}
}