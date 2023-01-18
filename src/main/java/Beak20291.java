import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Beak20291 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,Integer> ex = new HashMap<String,Integer>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i <n; i++) {
            String s = br.readLine();
            s = s.substring(s.indexOf(".")+1);
            System.out.println(s);
            if (ex.containsKey(s))
                ex.put(s,ex.get(s)+1);
            else
                ex.put(s,1);
        }
        System.out.println(ex);
    }
}
