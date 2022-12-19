
package superdeliverysystem;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ExceptionChecker {

    String password;

    public ExceptionChecker() {
    }
    

     public static boolean isValidEmail(String s) {

        String emailPattern = "^[\\w!#$%&â€™*+/=?`{|}~^-]+(?:\\.[\\w!#$%&â€™*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        Pattern p = Pattern.compile(emailPattern);
        Matcher m = p.matcher(s);
        return m.matches();

    }

   

    public  boolean isValidPassword(String s) {

        String pattern;
        pattern = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(s);
        return m.matches();

    }
  

public boolean isDateValid(String date) 
{
      final String DATE_FORMAT = "yyyy-MM-dd";
        try {
            DateFormat df = new SimpleDateFormat(DATE_FORMAT);
            df.setLenient(false);
            df.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
}

    boolean isString(String s){
        return (s !=null);
    }
}

