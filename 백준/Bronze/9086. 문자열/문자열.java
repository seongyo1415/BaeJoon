import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        String S;
        for(int i=0; i<T; i++){
            S=br.readLine();
            sb.append(S.charAt(0)).append(S.charAt(S.length()-1)).append("\n");
        }
        
        System.out.print(sb);
    }
}