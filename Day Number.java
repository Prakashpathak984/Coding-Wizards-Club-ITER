/*

Write a program that determines the day number (1 to 366) in a year for a
date that is provided as input data. As an example, January 1, 1994, is day 1.

December 31, 1993, is day 365. December 31, 1996, is day 366, since 1996 is
a leap year.
A year is a leap year if it is divisible by four, except that any year
divisible by 100 is a leap year only if it is divisible by 400.
Your program should accept the month, day, and year as integers. Include a function leap that returns 1
if called with a leap year, 0 otherwise.

*/

import java.util.*;
public class Main
{
  public static void main (String []args)
  {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a date : ");
        String date = sc.nextLine();
        sc.close();
        
        date=date.toLowerCase();
        date = date.trim();
        int dd = Integer.parseInt(date.substring(0,date.indexOf(" ")));
        
        String mm = date.substring(date.indexOf(" ")+1,date.lastIndexOf(" "));
        
        int yy = Integer.parseInt(date.substring(date.lastIndexOf(" ")+1));
        
        
        int feb=leap(yy);
        int tdays=dd;
        
            
        switch(mm)
        {
            case "january" :
                break;
            case "february":
                tdays = tdays+31;
                break;
            case "march":
                tdays = tdays+feb+31;
                break;
            case "april":
                tdays = tdays+feb+(31*2);
                break;
            case "may":
                tdays = tdays+feb+(31*2)+30;
                break;
            case "june":
                tdays = tdays+feb+(31*3)+30;
                break;
            case "july":
                tdays = tdays+feb+(31*3)+(30*2);
                break;            
            case "august":
                tdays = tdays+feb+(31*4)+(30*2);
                break;
            case "september":
                tdays = tdays+feb+(31*5)+(30*2);
                break;
            case "october":
                tdays = tdays+feb+(31*5)+(30*3);            
                break;            
            case "november":
                tdays = tdays+feb+(31*6)+(30*3);            
                break;                        
            case "december":
                tdays = tdays+feb+(31*6)+(30*4);            
                break;              
        }
        System.out.println(tdays);
  }
  
  public static int leap(int yy)
  {
        if ((yy% 4 == 0 && yy % 100 != 0 ) || (yy % 400 == 0))
            return 29;
        else
            return 28;
  }
}
