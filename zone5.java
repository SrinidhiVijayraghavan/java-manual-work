import java.time.*;  
public class ZonedDateTimeExample5{  
  public static void main(String[] args) {  
    ZonedDateTime zone= ZonedDateTime.now();  
    ZonedDateTime p = zone.plus(Period.ofDays(126));  
    System.out.println(p);  
  }   
}  