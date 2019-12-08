import java.util.*;
import java.io.*;

public class USACO_2017_Bronze_Dec_Q2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new FileReader("shuffle.in"));
        int NumOfCow = Integer.parseInt(br.readLine());
        ArrayList<Integer> CowOrder = new ArrayList<>();
        ArrayList<Integer> CowShuffle = new ArrayList<>();

        String ShuffleLine = br.readLine();
        StringTokenizer tok = new StringTokenizer(ShuffleLine);

        for (int i = 0; i < NumOfCow; i++) {
            CowShuffle.add(Integer.parseInt(tok.nextToken()));
        }
        String ShuffleOrder = br.readLine();
        StringTokenizer tok1 = new StringTokenizer(ShuffleOrder);
        for (int i = 0; i < NumOfCow; i++) {
            CowOrder.add(Integer.parseInt(tok1.nextToken()));
        }
        br.close();

        for (int i = 0; i < 3; i++) {
            ArrayList  <Integer> newOrder = new ArrayList<>();
            for (int j = 0; j < CowOrder.size(); j++) {
                newOrder.add(0);
            }
            for (int j = 0; j < CowOrder.size(); j++) {
                int index = CowShuffle.get(j) -1;
                int value = CowOrder.get(index);
                newOrder.set(j,value);

            }
            CowOrder = newOrder;
        }

        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("shuffle.out")));
        for (int i = 0; i < CowOrder.size(); i++) {
            out.println(CowOrder.get(i));
        }
        out.close();
    }
}
