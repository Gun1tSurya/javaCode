package hacker_rank.wissenTech.test;

import java.util.*;

public class Solution {
    public static class RatingStatisticsCollectorImpl implements RatingStatisticsCollector {
        Map<String,Integer> map = new HashMap<>();

        @Override
        public void putNewRating(String app, int rating){
            map.put(app,rating);
        }

        @Override
        public double getAverageRating(String app){
            int  scores;
            scores = map.get(app);
            ArrayList<Integer> sc = new ArrayList<>();
            sc.add(scores);
            if (sc == null) {
                System.out.println("NOT found");
            }

            int sum = 0;
            for (int x : sc) {
                sum += x;
            }
            return (float) sum / sc.size();
        }

        @Override
        public int getRatingsCount(String app){
           int count =0;
            for(int i=0;i<map.size();i++){
                if(map.containsKey(app)){
                    count++;
                }
            }

            return count;
        }
    }

    ////////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////

    public interface RatingStatisticsCollector {
        // Ratings feed will call this method when new app rating information is received. This is input to your class. ratings is a non negative integer between 0 to 10.
        public void putNewRating(String app, int rating);

        // Report the average rating of the app.
        public double getAverageRating(String app);

        // Report the total number of rating for an app.
        public int getRatingsCount(String app);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numLines = Integer.parseInt(scanner.nextLine());
        int currentLine = 0;
        while (currentLine++ < numLines) {
            final RatingStatisticsCollector stats = new RatingStatisticsCollectorImpl();
            final Set<String> apps = new TreeSet<>();

            String line = scanner.nextLine();
            String[] inputs = line.split(",");
            for (int i = 0; i < inputs.length; ++i) {
                String[] tokens = inputs[i].split(" ");
                final String app = tokens[0];
                apps.add(app);
                final int runs = Integer.parseInt(tokens[1]);

                stats.putNewRating(app, runs);

            }
            for (String app : apps) {
                System.out.println(
                        String.format("%s %.2f %d", app, stats.getAverageRating(app), stats.getRatingsCount(app)));
            }

        }
        scanner.close();

    }
}
