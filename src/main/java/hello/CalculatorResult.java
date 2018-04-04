package hello;

public class CalculatorResult {

    public Double getResult() {
        return result;
    }

    private Double result = 0.0;

    public CalculatorResult(Double result) {
        this.result = result;
    }


    @Override
    public String toString() {
        return "CalculatorResult{" +
                "result=" + result +
                '}';
    }
}
