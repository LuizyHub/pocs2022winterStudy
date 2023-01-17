import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beak6550 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s,t;
        String input = "";
        while (true) {
            input = br.readLine();
            if(input == null || input.length() == 0)
                break;
            StringTokenizer st = new StringTokenizer(input);
            s = st.nextToken();
            t = st.nextToken();
            boolean isPartion = true;
            int tag = 0;
            for (int j = 0; j < s.length(); j++) {
                int tmp = t.indexOf(s.charAt(j), tag);
                if (tmp != -1)
                    tag = tmp;
                else {
                    isPartion = false;
                    break;
                }
            }
            if (isPartion)
                System.out.println("Yes");
            else
                System.out.println("No");

        }
    }
}
