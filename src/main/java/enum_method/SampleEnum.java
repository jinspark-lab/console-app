package enum_method;

import big_int.decimal.Model.BigInt;
import big_int.decimal.Service.BigIntCalculator;

import java.util.function.Function;

public enum SampleEnum {
    Type_A(value -> value),
    Type_B(value -> String.valueOf(Integer.parseInt(value) * 3)),
    Type_C(value -> BigIntCalculator.plus(new BigInt(value), new BigInt("15")).toString());

    private final Function<String, String> expression;

    SampleEnum(Function<String, String> expression) {
        this.expression = expression;
    }

    public String calculate(String value) {
        return expression.apply(value);
    }
}