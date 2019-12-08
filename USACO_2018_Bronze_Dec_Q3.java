import java.util.*;
import java.io.*;
public class USACO_2018_Bronze_Dec_Q3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("backforth.in"));
        String bucket1 = br.readLine();
        StringTokenizer tok = new StringTokenizer(bucket1);
        ArrayList<Integer> MonBucket1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            MonBucket1.add(Integer.parseInt(tok.nextToken()));
        }
        MonBucket1.add(0,0);
        String bucket2 = br.readLine();
        StringTokenizer tok2 = new StringTokenizer(bucket2);
        ArrayList<Integer> MonBucket2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            MonBucket2.add(Integer.parseInt(tok2.nextToken()));
        }
        MonBucket2.add(0,0);
        br.close();
        HashSet<Integer> possibility = new HashSet<>();
        int money = 0;
        for (int i = 1; i < MonBucket1.size(); i++) {
            ArrayList<Integer> TueBucket2 = new ArrayList<>(MonBucket2);
            ArrayList<Integer> TueBucket1 = new ArrayList<>(MonBucket1);
            TueBucket2.add(TueBucket1.get(i));
            money =TueBucket1.get(i);
            TueBucket1.remove(i);

            for (int j = 1; j < TueBucket2.size(); j++) {
                int ogMon3 = money;
                ArrayList<Integer> WedBucket1 = new ArrayList<>(TueBucket1);
                ArrayList<Integer> WedBucket2 = new ArrayList<>(TueBucket2);
                WedBucket1.add(WedBucket2.get(j));

                money-=WedBucket2.get(j);
                WedBucket2.remove(j);


                for (int k = 1; k < WedBucket1.size(); k++) {
                    int ogMon2 = money;
                    ArrayList<Integer> ThuBucket1 = new ArrayList<>(WedBucket1);
                    ArrayList<Integer> ThuBucket2 = new ArrayList<>(WedBucket2);
                    ThuBucket2.add(ThuBucket1.get(k));

                    money+=ThuBucket1.get(k);
                    ThuBucket1.remove(k);


                    for (int l = 1; l < ThuBucket2.size(); l++) {
                        int ogMon = money;
                        ArrayList<Integer> FriBucket2 = new ArrayList<>(ThuBucket2);

                        money-=FriBucket2.get(l);
                        possibility.add(money);
                        money = ogMon;

                    }
                    money = ogMon2;

                }
                money = ogMon3;
            }
        }
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("backforth.out")));
        out.print(possibility.size());

        out.close();

    }

}
