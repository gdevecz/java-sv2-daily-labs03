package day01;

import java.util.ArrayList;
import java.util.List;

public class Students {

    private List<Integer> heights;

    public Students() {
        heights = new ArrayList<>();
    }

    public void addHeight(int height) {
        heights.add(height);
    }

    public boolean isHeightsIncreasing() {
        int i = 1;
        while (i < heights.size() && (heights.get(i - 1) <= heights.get(i))) {
            i++;
        }
        return i < heights.size() ? false : true;
    }

    public List<Integer> getHeights() {
        return heights;
    }
}
