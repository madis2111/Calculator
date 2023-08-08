import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculatorTests {

    static Calculator calc;

    @BeforeAll
    public static void init(){
        calc = Calculator.instance.get();
    }

    @Test
    public void test_plus(){
        Assertions.assertEquals(3,calc.plus.apply(1, 2));
    }

    @Test
    public void test_minus(){
        Assertions.assertEquals(0, calc.minus.apply(1,1));
    }
    @Test
    public void test_divide_if(){
        Assertions.assertEquals(Integer.MIN_VALUE, calc.divide_if.apply(1, 0));
    }
}
