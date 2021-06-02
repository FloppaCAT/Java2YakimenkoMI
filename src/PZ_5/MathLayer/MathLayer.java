package PZ_5.MathLayer;

import PZ_5.MathProcessor.*;

public class MathLayer {

    public static void mathLayer (String firstString, String mathSymbol, String SecondString){
        int first = 0;
        int second = 0;
        int result = 0;

        first = Integer.parseInt(firstString);
        second = Integer.parseInt(SecondString);

        MathProcessor mathProcessor;
        if (mathSymbol.equals("+")){
            mathProcessor = new Addition();
            result = mathProcessor.invoke(first, second);
        } else if (mathSymbol.equals("-")) {
            mathProcessor = new Subtraction();
            result = mathProcessor.invoke(first, second);
        } else if (mathSymbol.equals("*")) {
            mathProcessor = new Multiplication();
            result = mathProcessor.invoke(first, second);
        } else if (mathSymbol.equals("/")) {
            mathProcessor = new Division();
            result = mathProcessor.invoke(first, second);
        } else System.out.println(result);

        System.out.println("Ответ: " + result);

    }
}
