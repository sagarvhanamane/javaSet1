import java.awt.List;
import java.sql.Date;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
class Test {
    public static void main(String[] args)  {

		
	Scanner sc = new Scanner(System.in);
	
	
	while(true){
		System.out.println("Enter IP Address:");
		String IPAddressStr = sc.nextLine();
		String ipStr[] = IPAddressStr.split("[.]");
		boolean ip=true;
		if(ipStr.length==4){
			for(String id:ipStr){
				if(!(Integer.parseInt(id)<=255 && Integer.parseInt(id)>=0)){
					ip=false;
					break;
				}
			}
			
			if(ip){
				 System.out.println("1(valid)");
		    }
			else{
		         System.out.println("2(Invalid)");
			}
		}
	      
	}}}

