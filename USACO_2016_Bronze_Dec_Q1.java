import java.util.*;
import java.io.*;
public class USACO_2016_Bronze_Dec_Q1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("square.in"));
        ArrayList<Integer> allX = new ArrayList<>();
        ArrayList<Integer> allY = new ArrayList<>();
        String line1 = br.readLine();
        String line2 = br.readLine();

        StringTokenizer tok = new StringTokenizer(line1);
        StringTokenizer tok2 = new StringTokenizer(line2);

        br.close();
        allX.add(Integer.parseInt(tok.nextToken()));
        allY.add(Integer.parseInt(tok.nextToken()));
        allX.add(Integer.parseInt(tok.nextToken()));
        allY.add(Integer.parseInt(tok.nextToken()));
        allX.add(Integer.parseInt(tok2.nextToken()));
        allY.add(Integer.parseInt(tok2.nextToken()));
        allX.add(Integer.parseInt(tok2.nextToken()));
        allY.add(Integer.parseInt(tok2.nextToken()));

        int minX = Math.min(allX.get(0), allX.get(2));
        int maxX = Math.max(allX.get(1), allX.get(3));
        int changeX = maxX - minX;
        int minY = Math.min(allY.get(0), allY.get(2));
        int maxY = Math.max(allY.get(1), allY.get(3));
        int changeY = maxY - minY;

        int output = Math.max(changeX, changeY) * Math.max(changeX, changeY);

        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("square.out")));
        out.println(output);
        out.close();
    }
}
