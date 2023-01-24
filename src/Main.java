import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> predicate1 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer > 0) {
                    return true;
                } else
                    return false;
            }
        };
        System.out.println(predicate1.test(-3));

        Predicate<Integer> predicate2 = integer -> integer > 0;
        System.out.println(predicate2.test(9));


        System.out.println("--------------------------------------");


        Consumer<String> consumer1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Привет " + s);
            }
        };
        consumer1.accept("Иван");

        Consumer<String> consumer2 = name -> System.out.println("Привет " + name);
        consumer2.accept("Роман");


        System.out.println("--------------------------------------");


        Function<Double, Long> function1 = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return Math.round(aDouble);
            }
        };
        System.out.println(function1.apply(1568.32));

        Function<Double, Long> function2 = Math::round;
        System.out.println(function2.apply(48946.989));


        System.out.println("--------------------------------------");


        Supplier<Integer> supplier1 = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return (int)(Math.random()*101);
            }
        };
        System.out.println(supplier1.get());

        Supplier<Integer> supplier2 = () -> (int)(Math.random()*101);
        System.out.println(supplier2.get());
    }
}