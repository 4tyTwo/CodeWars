import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class ObservedPin {

    // Source: https://www.codewars.com/kata/5263c6999e0f40dee200059d
    
    public static List<String> getPINs(String observed) {
        ArrayList<String> list = new ArrayList<>();
        list.add(observed);
        for (int i = 0; i < observed.length(); ++i) {
            int size = list.size();
            for (int j = 0; j < size; ++j)
                list.addAll(adjacentPINs(list.get(j), i).stream().filter(s -> !list.contains(s)).collect(Collectors.toList()));
        }
        return list;
    }

    private static List<String> adjacentPINs(String pin, int pos) {
        ArrayList<String> list;
        ArrayList<String> fullList = new ArrayList<>();
        switch (pin.charAt(pos)) {
            case '0' : list = new ArrayList<>(Arrays.asList("0", "8")); break;
            case '1' : list =  new ArrayList<>(Arrays.asList("1", "2", "4")); break;
            case '2' : list = new ArrayList<>(Arrays.asList("1", "2", "3", "5")); break;
            case '3' : list = new ArrayList<>(Arrays.asList("2", "3", "6")); break;
            case '4' : list = new ArrayList<>(Arrays.asList("1", "4", "5", "7")); break;
            case '5' : list = new ArrayList<>(Arrays.asList("2", "4", "5", "6", "8")); break;
            case '6' : list = new ArrayList<>(Arrays.asList("3", "5", "6", "9")); break;
            case '7' : list = new ArrayList<>(Arrays.asList("4", "7", "8")); break;
            case '8' : list = new ArrayList<>(Arrays.asList("5", "7", "8", "9", "0")); break;
            case '9' : list = new ArrayList<>(Arrays.asList("6", "8", "9")); break;
            default  : list = new ArrayList<>();
        }
        fullList.addAll(list.stream().map(s -> pin.substring(0, pos) + s + pin.substring(pos + 1)).collect(Collectors.toList()));
        return fullList;
    }

    public static void main(String[] args) {
        List<String> a = getPINs("369");
        a.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println(a);
        System.out.println(new ArrayList<>(Arrays.asList("236", "238", "239", "256", "258", "259", "266", "268", "269", "296", "298", "299", "336", "338", "339", "356", "358", "359", "366", "368", "369", "396", "398", "399", "636", "638", "639", "656", "658", "659", "666", "668", "669", "696", "698", "699")));
    }
}