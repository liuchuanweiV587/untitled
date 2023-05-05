import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int hardestWorker(int n, int[][] logs) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < logs.length; i++) {
            int temp = 0;
            if (i > 0) {
                temp = logs[i - 1][1];
            }

            if (map.get(logs[i][1] - temp) == null){
                map.put(logs[i][1] - temp, logs[i][0]);
            }else{
              int value =  map.get(logs[i][1] - temp)>logs[i][0]? logs[i][0]:map.get(logs[i][1] - temp);
                map.put(logs[i][1] - temp, value);
            }


        }

        List<Integer> mapkey = new ArrayList<>(map.keySet());
        Collections.sort(mapkey);
        Integer integer = map.get(mapkey.get(mapkey.size()-1));

        return integer;

    }


}