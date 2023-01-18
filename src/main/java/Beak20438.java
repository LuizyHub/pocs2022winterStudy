import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beak20438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numN = Integer.parseInt(st.nextToken());
        int numK = Integer.parseInt(st.nextToken());
        int numQ = Integer.parseInt(st.nextToken());
        int numM = Integer.parseInt(st.nextToken());
        int[] n = new int[numN+3];

        st =new StringTokenizer(br.readLine());
        int[] k = new int[numK];
        for (int i = 0; i < numK; i++) {
            n[Integer.parseInt(st.nextToken())] = -1;
        }

        st = new StringTokenizer(br.readLine());
        int[] q = new int[numQ];
        for (int i = 0; i < numQ; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            if (n[tmp]==-1)
                continue;
            for (int j = tmp; j < numN+3; j+=tmp) {
                if(n[j]!=-1)
                    n[j] = 1;
            }
        }

        int[] sum = new int[numN+3];
        for (int i = 1; i < numN+3; i++) {
            if (n[i]!=1)
                sum[i] = sum[i-1] +1;
            else
                sum[i] = sum[i-1];
        }

        for (int i = 0; i < numM; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            System.out.println(sum[e]-sum[s-1]);
        }
    }
}
