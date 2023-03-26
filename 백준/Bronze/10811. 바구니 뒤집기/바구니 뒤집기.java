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
        
        int i, j, temp, a;
        
        int[] box = new int[n];
        
        for(a=0; a<n; a++)
            box[a] = a+1;
        
        while(--m >= 0){
            st = new StringTokenizer(br.readLine(), " ");
            
            i = Integer.parseInt(st.nextToken())-1;
            j = Integer.parseInt(st.nextToken())-1;
            
            while(true){
                temp = box[i];
                box[i] = box[j];
                box[j] = temp;
            
                i++;
                if(i>=j)
                    break;
                j--;
            }
        }
        
        for(a=0; a<n; a++)
            System.out.print(box[a] + " ");           
    }
}