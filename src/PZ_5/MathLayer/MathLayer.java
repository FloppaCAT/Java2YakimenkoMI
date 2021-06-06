package PZ_5.MathLayer;

import PZ_5.MathProcessor.*;

import java.io.IOException;

public class MathLayer {

    public static void mathLayer (String firstString, String mathSymbol, String SecondString) throws IOException {
        int first;
        int second;
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
            try {
                mathProcessor = new Division();
                result = mathProcessor.invoke(first, second);
            } catch (Exception e1){
                System.out.println("На ноль делить нельзя: " + e1);
            }

        } else System.out.println(result);

        System.out.println("Ответ: " + result);

    }
}
