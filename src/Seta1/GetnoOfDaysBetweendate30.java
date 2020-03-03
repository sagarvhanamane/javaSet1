package Seta1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class GetnoOfDaysBetweendate30 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter first date(dd/mm/yyyy):");
		String inputStr1=sc.nextLine();
		System.out.println("Enter second date(dd/mm/yyyy):");
		String inputStr2=sc.nextLine();
		
		DateTimeFormatter formate= DateTimeFormatter.ofPattern("d/M/yyyy");
		LocalDate date1=LocalDate.parse(inputStr1,formate);
		LocalDate date2=LocalDate.parse(inputStr2,formate);
			
		long diff=ChronoUnit.DAYS.between(date1, date2);
		System.out.println("Months between "+inputStr1+" and "+inputStr2+" :"+Math.abs(diff));
	}

}
