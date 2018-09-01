import java.time.*;  
public class MonthDayExample2 {  
  public static void main(String[] args) {  
    MonthDay month = MonthDay.now();  
    boolean b = month.isValidYear(2012);  
    System.out.println(b);  
  }  
}  