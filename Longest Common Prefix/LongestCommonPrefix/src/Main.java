import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        String[] strings = {"Caterpillar", "Catwoman", "Capability"};
        System.out.printf("Array: %s | LCP: %s\n", Arrays.toString(strings), Solution.longestCommonPrefix(strings));
    }
}