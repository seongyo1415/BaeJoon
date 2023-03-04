import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int temp;
        int a, b;
        
        int[] box = new int[n];
        
        for(int i=0; i<n; i++)
            box[i] = i+1;
        
        for(int j=0; j<m; j++){
            st = new StringTokenizer(br.readLine(), " ");
            
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            
            temp = box[a-1];
            box[a-1] = box[b-1];
            box[b-1] = temp;
        }
        
        for(int i=0; i<n; i++)
            System.out.print(box[i]+ " ");
    }
}