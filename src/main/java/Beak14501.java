import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beak14501 {
    public static int max(int a, int b) {
        return (a >= b) ? a : b;
    }
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
        for (int i = 0; i < Math.min(5,n); i++) {
            for (int j = 1; j <= i; j++) {
                if (t[i-j]>j)
                    max[i] = max(max[i],max[i-j]);
            }
            max[i+t[i]] = max(max[i+t[i]], max[i] + p[i]);
        }
        for (int i = 5; i < n; i++) {
            for (int j = 1; j <= 5; j++) {
                if (t[i-j]>j)
                    max[i] = max(max[i],max[i-j]);
            }
            max[i+t[i]] = max(max[i+t[i]], max[i] + p[i]);
        }
        for (int j = 1; j <= Math.min(5,n); j++) {
            if (t[n-j]>j)
                max[n] = max(max[n],max[n-j]);
        }
        System.out.println(max[n]);
    }
}
