import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        int result = 0;

        BufferedReader br = new BufferedReader(new FileReader("src/input.txt"));
        List<String> lines = br.lines().toList();

        for (String line : lines) {
            String number = "";
            for (int i = 0; i < line.length(); i++) {
                if (Character.isDigit(line.charAt(i))) {
                    number+= line.charAt(i);
                    break;
                }
            }
            for (int i = line.length() - 1; i >= 0; i--) {
                if (Character.isDigit(line.charAt(i))) {
                    number += line.charAt(i);
                    break;
                }
            }
            result += Integer.parseInt(number);
        }
        System.out.println(result);
    }
}