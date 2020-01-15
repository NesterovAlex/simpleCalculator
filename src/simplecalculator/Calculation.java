
package simplecalculator;

public class Calculation {
    
     public static int stringCalculation(String math) throws Scanner.InputError{
      int result = 0;
        for(int i = 0; i < math.length();i++){  
          switch (math.charAt(i)) {
              case '+':
                  result = Integer.parseInt(math.substring(0, i)) + Integer.parseInt(math.substring(i+1, math.length()));
                  System.out.print(result);
                  break;
              case '-':
                  result = Integer.parseInt(math.substring(0, i)) - Integer.parseInt(math.substring(i+1, math.length()));
                  System.out.print(result);
                  break;
              case '*':
                  result = Integer.parseInt(math.substring(0, i)) * Integer.parseInt(math.substring(i+1, math.length()));
                  System.out.print(result);
                  break;
              case '/':
                  result = Integer.parseInt(math.substring(0, i)) / Integer.parseInt(math.substring(i+1, math.length()));
                  System.out.print(result);         
                  break;
              default:
                  break;
          }
        }  
        return result;
    } 
     
     Convertor convertor = new Convertor();
     
    public  int stringRomanCalculation(String math) throws Scanner.InputError{
      int result = 0;
        for(int i = 0; i < math.length();i++){  
          switch (math.charAt(i)) {
              case '+':
                  result = convertor.romanToDecimal(math.substring(0, i)) + convertor.romanToDecimal(math.substring(i+1, math.length()));
                  break;
              case '-':
                  result = convertor.romanToDecimal(math.substring(0, i)) - convertor.romanToDecimal(math.substring(i+1, math.length()));
                  break;
              case '*':
                  result = convertor.romanToDecimal(math.substring(0, i)) * convertor.romanToDecimal(math.substring(i+1, math.length()));
                  break;
              case '/':
                  result = convertor.romanToDecimal(math.substring(0, i)) / convertor.romanToDecimal(math.substring(i+1, math.length()));
                  break;
              default:
                  break;
          }
        }  
        return result;
    } 
}
