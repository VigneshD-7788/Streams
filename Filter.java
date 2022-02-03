package Streams;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;

public class Filter {
    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("apple", "banana", "lemon");
        String value = "lemon";
        List<String> result = fruits.stream().filter(line ->!value.equals(line)).collect(Collectors.toList());
        for (String str : result) {
            System.out.println(str);
        }
    }

}
