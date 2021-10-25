package day01Megoldas;

import java.util.ArrayList;
import java.util.List;

public class Students {

    private List<Integer> heights = new ArrayList<>();

    public void addHeight(int height) {
        heights.add(height);
    }

    public boolean isHeightsIncreasing() {
//        boolean increasing;
//        u az csak másképp
//        for (int i = 0; i < heights.size()-1; i++) {
//            if(heights.get(i)>heights.get(i+1)) {
//                increasing = false;
//            }
//        }

        for (int i = 1; i < heights.size(); i++) {
            if(heights.get(i)<heights.get(i-1)) {
                return false;
            }
        }
        return true;
    }
}
