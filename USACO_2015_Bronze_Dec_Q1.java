import java.util.*;
import java.io.*;
public class USACO_2015_Bronze_Dec_Q1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("paint.in"));
        String line1 = br.readLine();
        String line2 = br.readLine();

        StringTokenizer tok = new StringTokenizer(line1);
        StringTokenizer tok2 = new StringTokenizer(line2);
        br.close();
        int a =Integer.parseInt(tok.nextToken()),b =Integer.parseInt(tok.nextToken()),c =Integer.parseInt(tok2.nextToken()), d  =Integer.parseInt(tok2.nextToken());
        int e = Math.min(b-a+d-c,Math.max(b-c,d-a));
        int f = Math.max(b-a,d-c);
        e = Math.max(e,f);
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("paint.out")));
        out.println(e);
        out.close();
    }
}
