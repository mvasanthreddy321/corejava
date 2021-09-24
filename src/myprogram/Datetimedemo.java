package myprogram;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Datetimedemo {

	public static void main(String[] args) {

		LocalDateTime currenttime = LocalDateTime.now();
	      System.out.println("Current DateTime: " + currenttime);
	      
	      LocalDate date1 = currenttime.toLocalDate();
	      System.out.println("Date::: " + date1);
	      
	      LocalTime time1 = currenttime.toLocalTime();
	      System.out.println("Time::: " + time1);
			
	      Month month = currenttime.getMonth();
	      int day = currenttime.getDayOfMonth();
	      
	      System.out.println("Month: " + month  + " " + "Day: " + day);
	      
	      
	      Month m = date1.getMonth();  
	      int mv = m.getValue();  
	      System.out.println("Specific Month is:" + m);  
	      System.out.println("Specific Month in Numbers is:" + mv); 
	      
	      int minl = m.minLength();  
	      int maxl = m.maxLength();  
	      System.out.println("Minimum Days of Specific Month is:" + minl);  
	      System.out.println("Maximum Days of Specific Month is:" + maxl);  
	      
	      LocalDate yest = LocalDate.now().minusDays(1);  
	      LocalDate tomm = LocalDate.now().plusDays(1);  
	      System.out.println("Yesterday Day was :" + yest);  
	      System.out.println("Tomorrow will be :" + tomm);  
	      
	      LocalDate today = LocalDate.now();
	      System.out.println("Current date: " + today);
	      LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
	      System.out.println("Next week: " + nextWeek);
	      LocalDate nextMonth = today.plus(1, ChronoUnit.MONTHS);
	      System.out.println("Next month: " + nextMonth);
	      LocalDate nextYear = today.plus(2, ChronoUnit.YEARS);
	      System.out.println("Next year: " + nextYear);
	      
	      
	      LocalDate today1 = LocalDate.now();
	      System.out.println("Current date: " + today1);
	      LocalDate nextWeek1 = today1.minus(1, ChronoUnit.WEEKS);
	      System.out.println("Minus Next week: " + nextWeek1);
	      LocalDate nextMonth1 = today1.minus(1, ChronoUnit.MONTHS);
	      System.out.println("Minus Next month: " + nextMonth1);
	      LocalDate nextYear1 = today1.minus(2, ChronoUnit.YEARS);
	      System.out.println("Minus Next year: " + nextYear1);
	      
	      
	      
	      
	      LocalDate fd = LocalDate.of(2020, 12, 27);  
	      LocalDate sd = LocalDate.of(2021, 6, 8);  
	      Period p = Period.between(fd, sd);  
	      int d = p.getDays();  
	      int m11 = p.getMonths();  
	      int y = p.getYears();  
	      System.out.println("Difference in Days is:" + d);  
	      System.out.println("Difference in Months is:" + m11);  
	      System.out.println("Difference in Years is:" + y); 
	      
	      LocalDate d1=LocalDate.now();
	      System.out.println(d1);
		

	}

}
