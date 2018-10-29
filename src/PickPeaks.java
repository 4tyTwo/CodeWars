import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class PickPeaks {

    // Source: https://www.codewars.com/kata/pick-peaks

    public static Map<String,List<Integer>> getPeaks(int[] arr) {
        boolean plateau = false;
        int tmpPos = -1, tmpPeak = -1;
        ArrayList<Integer> pos = new ArrayList<>(), peaks = new ArrayList<>();
        for (int i = 1; i < arr.length - 1; ++i) {
            if (!plateau) {
                if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                    pos.add(i);
                    peaks.add(arr[i]);
                } else {
                    if (arr[i] > arr[i - 1] && arr[i] == arr[i + 1]) {
                        tmpPos = i;
                        tmpPeak = arr[i];
                        plateau = true;
                    }
                }
            } else {
                if (arr[i] == arr[i - 1] && arr[i] != arr[i + 1]) {
                    plateau = false;
                    if (arr[i] > arr[i + 1]) { // plateau ended and it is peak
                        pos.add(tmpPos);
                        peaks.add(tmpPeak);
                    }
                }
            }
        }
        return new HashMap<String, List<Integer>>() {{
            put("pos", pos);
            put("peaks", peaks);
        }};
    }

    public static void main(String[] args) {
        int[][] array = {
                {2,1,3,1,2,2,2,2,1},
                {2,1,3,1,2,2,2,2}};
        for (int i = 0; i < array.length; ++i) {
            System.out.println(PickPeaks.getPeaks(array[i]));
        }
    }
}