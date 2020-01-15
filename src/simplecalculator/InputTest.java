
package simplecalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputTest {
     public  boolean checkWithRegExp(String userNameString)throws Scanner.InputError{  
        Pattern p = Pattern.compile("^([1-9]|(10))(\\+|-|\\*|/)(([1-9])|(10))$|^(I{1,3}|IV|V|VI|VII|VIII|IX|X)(\\+|-|\\*|/)(I{1,3}|IV|V|VI|VII|VIII|IX|X)$");  
        Matcher m = p.matcher(userNameString);
        
        if(m.matches() == false)throw new Scanner.InputError();
        return m.matches();  
    }
     
      public  boolean isRoman (String str){
        Pattern p = Pattern.compile("^(I{1,3}|IV|V|VI|VII|VIII|IX|X)(\\+|-|\\*|/)(I{1,3}|IV|V|VI|VII|VIII|IX|X)$");  
        Matcher m = p.matcher(str);
        return m.matches();  
      }
}
