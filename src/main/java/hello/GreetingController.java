package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }

    @RequestMapping("/util/calculator/product")
    public ResponseEntity<CalculatorResult> multiply(@RequestParam(value="multiples")String csvMultiples){

        System.out.println("> multiply");
        return new ResponseEntity(getResult(Calculator.product(csvMultiples.split(","))),HttpStatus.OK);
    }

    private CalculatorResult getResult(Double product) {
        CalculatorResult r = new CalculatorResult(product);
        return r;
    }
}