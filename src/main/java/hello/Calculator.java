package hello;

import java.util.Arrays;
import java.util.List;

public class Calculator {
    public static Double product(String... values) {
        Double product = 1.0;

        List<String> input = Arrays.asList(values);


        for (String value:input) {
            System.out.println("multiplying: "+value);
            try {
                product *= Double.parseDouble(value);
            }catch(NumberFormatException nfe)
            {
                System.out.println("Invalid input: "+ value);
                throw  new NumberFormatException("Invalid input, NaN");
            }
        }
        System.out.println("product: "+product);
        return product;
    }
}
