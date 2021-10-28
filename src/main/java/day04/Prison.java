package day04;

import java.util.ArrayList;
import java.util.List;

public class Prison {
    private List<Integer> cells;

    public void openFreeCells() {
        int days = 100;
        int numberOfCells = 100;
        cells = openTheCells(days, numberOfCells);
        System.out.println(printOpenedCells());
    }

    private List<Integer> openTheCells(int days, int numberOfCells) {
        boolean[] doorsOfCells = new boolean[numberOfCells];
        for (int i = 1; i <= days; i++) {
            for (int j = i - 1; j < doorsOfCells.length; j += i) {
                doorsOfCells[j] = (!doorsOfCells[j]);
            }
        }
        return getListOfOpenedCells(doorsOfCells);
    }

    private List<Integer> getListOfOpenedCells(boolean[] doorsOfCells){
        List<Integer> openedCells = new ArrayList<>();
        for (int i = 0; i <doorsOfCells.length; i++) {
            if(doorsOfCells[i]) {
                openedCells.add(i);
            }
        }
        return openedCells;
    }

    public String printOpenedCells() {
        System.out.println("A kinyitott cellák ajtószámai (1 - 100)");
        String tmp = "";
        for (int i = 0; i < cells.size(); i++) {
            tmp += (cells.get(i) + 1 + ", ");
        }
        return tmp;
    }
}
