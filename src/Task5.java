import java.util.function.Function;
import java.util.function.Predicate;

public class Task5 {
    public static void main(String[] args) {
        Integer num = 5;
        Predicate<Object> condition = p -> num > 0;
        Function<Object, String> ifTrue = s -> "Введено положительное число";
        Function<Object, String> ifFalse = s -> "Введено отрицательное число";
        Function<Integer, String> safeStringLength = ternaryOperator(condition, ifTrue, ifFalse);
        System.out.println(safeStringLength.apply(num));
    }
    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {
        return t -> condition.test(t) ? ifTrue.apply(t) : ifFalse.apply(t);
    }
}
