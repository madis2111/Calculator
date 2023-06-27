import java.util.function.*;

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> divide = (x, y) -> x / y;

    BinaryOperator<Integer> divide_if = (x, y) -> {
        if (y != 0) {
            return x / y;
        } else {
            System.out.println("Ошибка! На 0 делить нельзя.");
            return Integer.MIN_VALUE;
//            throw new ArithmeticException("Ошибка! На 0 делить нельзя.");
        }
    };

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;
}
