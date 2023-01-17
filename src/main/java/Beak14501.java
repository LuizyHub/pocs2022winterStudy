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
            for (int j = 1; j <= Math.min(i,5); j++) {
                max[i] = Math.max(max[i],max[i-j]);
            }
            max[i+t[i]] = Math.max(max[i+t[i]], max[i] + p[i]);
        }
        int maxPay = Math.max(max[n],Math.max(max[n-1],Math.max(max[n-2],Math.max(max[n-3],max[n-4]))));
        System.out.println(maxPay);
    }
}
