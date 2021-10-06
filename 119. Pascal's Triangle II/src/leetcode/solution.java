package leetcode;

import sun.applet.Main;

import java.util.ArrayList;
import java.util.List;

public class solution {
    public static void main(String[] args) {
        solution s = new solution();
        System.out.println(s.getRow(4));

    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < rowIndex + 1; i++) {
            result.add(1);
            for (int j = i; j >= 0; j--) {
                if (j != 0 && j != i) {
                    result.set(j, result.get(j) + result.get(j - 1));
                }
            }
        }
        return result;
    }
}
