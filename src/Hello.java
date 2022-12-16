import java.util.Arrays;
import java.util.List;

public class Hello {
    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(5, 23, 6, 0, 12, 123, 6, 5, 1, 99, 3, 4, 1, 2);
        Integer integerStream=list.stream().reduce(Integer::sum).get();
        System.out.println(integerStream);
        System.out.println(integerStream/list.size());


    }
}