import java.io.*;
import java.util.*;

public class Substring {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        char[] string1 = s1.toCharArray();
        HashMap<Character, Integer> check = new HashMap<>();
        for (char c : string1){
            if (!check.containsKey(c)){
                check.put(c, null);
            }
        }
        boolean commonSubstring = false;
        char[] string2 = s2.toCharArray();
        for (char c : string2){
            if (check.containsKey(c)){
                commonSubstring = true;
                break;
            }
        }
        if (commonSubstring){
            return "YES";
        }
        else {
            return "NO";
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
