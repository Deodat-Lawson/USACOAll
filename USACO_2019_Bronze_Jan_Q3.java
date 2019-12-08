import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class USACO_2019_Bronze_Jan_Q3 {
    public static void main(String[] args) throws IOException {
        HashSet<String> allWords = new HashSet<>();
        ArrayList<String> allAnimals = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("guess.in"));

        int numOfTimes = Integer.parseInt(br.readLine());

        for (int i = 0; i < numOfTimes; i++) {
            String line = br.readLine();
            StringTokenizer tok = new StringTokenizer(line);
            String sacrifice = tok.nextToken();
            int numOfTTimes = Integer.parseInt(tok.nextToken());
            String a = "";
            for (int j = 0; j < numOfTTimes; j++) {
                String b =tok.nextToken();
                allWords.add(b);
                a+= b+" ";
            }
            allAnimals.add(a);

        }

        br.close();
        int maxCount = 0;
        for (int i = 0; i < allAnimals.size() - 1; i++) {
            for (int j = i+1; j < allAnimals.size(); j++) {
                int count = 0;
                for (String a:
                     allWords) {
                    if(allAnimals.get(i).contains(a) && allAnimals.get(j).contains(a)) count++;
                }

                maxCount = Math.max(count,maxCount);
            }
        }

        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("guess.out")));
        out.println(maxCount+1);
        out.close();



    }
}
