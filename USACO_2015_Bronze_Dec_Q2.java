import java.util.*;
import java.io.*;
public class USACO_2015_Bronze_Dec_Q2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("speeding.in"));
        ArrayList<Integer> speedLimit = new ArrayList<>();
        ArrayList<Integer> speed = new ArrayList<>();
        String numOfLines = br.readLine();
        StringTokenizer tok = new StringTokenizer(numOfLines);
        int N = Integer.parseInt(tok.nextToken());
        int M = Integer.parseInt(tok.nextToken());
        for (int i = 0; i < N; i++) {
            String a = br.readLine();
            StringTokenizer tokA = new StringTokenizer(a);
            int index = Integer.parseInt(tokA.nextToken());
            int value = Integer.parseInt(tokA.nextToken());
            for (int j = 0; j < index; j++) {
                speedLimit.add(value);
            }
        }
        for (int i = 0; i < M; i++) {
            String a = br.readLine();
            StringTokenizer tokA = new StringTokenizer(a);
            int index = Integer.parseInt(tokA.nextToken());
            int value = Integer.parseInt(tokA.nextToken());
            for (int j = 0; j < index; j++) {
                speed.add(value);
            }
        }
        br.close();
        int maxDifference = 0;
        for (int i = 0; i < speed.size(); i++) {
            maxDifference = Math.max(maxDifference, speed.get(i) - speedLimit.get(i));
        }
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("speeding.out")));
        out.println(maxDifference);
        out.close();

    }
}
