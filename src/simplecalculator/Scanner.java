
package simplecalculator;

public class Scanner {
    
    Calculation calculation = new Calculation();
    InputTest inputTest = new InputTest();
    
     public String expression()throws InputError{
        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.println("Input:");
        String str = in.nextLine();

        
        if(inputTest.checkWithRegExp(str) == true && inputTest.isRoman(str) == true){
            System.out.println("Output:");
            System.out.println(RomanNumber.toRoman(calculation.stringRomanCalculation(str)));
        }
        else{
        System.out.println("Output:");
        Calculation.stringCalculation(str);
        }
        in.close();
        return str;
    }
     
     
static class InputError extends Exception{

        public InputError() {
            super("Ошибка ввода");
        }
     }
}
