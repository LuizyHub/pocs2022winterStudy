import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Beak10798 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<StringBuilder> in = new ArrayList<>(5);
        for(int i = 0; i < 5; i++){
            in.add(new StringBuilder(br.readLine()));
        }
        StringBuilder ans = new StringBuilder(75);
        for(int i = 0; i < 15; i++){
            for (int j = 0; j < 5; j++) {
                if(i < in.get(j).length()){
                    ans.append(in.get(j).charAt(i));
                }
            }
        }
        System.out.printf(ans.toString());
    }
}
