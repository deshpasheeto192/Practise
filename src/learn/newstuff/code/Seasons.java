package learn.newstuff.code;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

//finds max difference between the highest and lowest temperature for each season
//improvements will be done later
class Season {
    public static void main(String[] args) {
        int array[] = {12, -3,0, -1, 4, 3, 45, 42 , 41 ,25, 24, 19};
        Season season = new Season();
        System.out.println(season.solution(array));
    }
    public String solution(int[] T) {
        // write your code in Java SE 8
        List<String> seasons = List.of("WINTER","SPRING", "SUMMER", "AUTUMN");
        Map<String, Integer> map = new LinkedHashMap<>();
        for(String season : seasons) {
            map.put(season, 0);
        }
        int seasonVals = T.length/4;
        int count = 0, j =0, seasonCnt=0;

        for(int i = 0; i <= T.length; i++) {
            while (seasonCnt < seasonVals) {
                String seasonNam = seasons.get(seasonCnt);
                if (map.containsKey(seasonNam)) {
                    while (count < seasonVals) {
                        int prevVal = Math.abs(map.get(seasonNam));
                        map.put(seasonNam, prevVal - T[j]);
                        j++;
                        count++;
                    }
                    count = 0;
                    seasonCnt++;
                }
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        return map.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).get().getKey();

    }
}
