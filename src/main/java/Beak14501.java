import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beak14501 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] t = new int[n];
        int[] p = new int[n];
        int[] max = new int[n+5]; //
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            t[i] = Integer.parseInt(st.nextToken());
            p[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < n; i++) {
            max[i+t[i]] = Math.max(max[i+t[i]], max[i] + p[i]);
            for (int j = 1; j <= Math.min(5,i+1); j++) {
                if (t[i-j+1]>j)
                    max[i+1] = Math.max(max[i+1],max[i-j+1]);
            }
        }
        System.out.println(max[n]);
    }
}
