/* scrivere una classe Sequence che
ha un costruttore che accetta List<Integer>
ha un metodo int longestIncreasing() che ritorna la lunghezza della sequenza crescente piu' lunga, es: [1,2,3,4,0,2] -> 4, [1,2,0,3,4] -> 3, [] -> 0, [-4,-3,-1,-1,1,2] ->6 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sequence {

    private List<Integer> newArray;

    public Sequence() {
        newArray = new ArrayList<>(Arrays.asList(1,2,3,4,0,2));
        System.out.println(newArray);

    }


    public int longestIncreasing() {
        int last = newArray.get(0);
        int count = 0;
        int max = count;
        for (int index = 0; index < newArray.size(); index++) {
            int curr = newArray.get(index);
            if (curr >= last) {
                count++;
            } else {
                count = 1;
            }
            if (count > max) {
                max = count;
            }

        }
        return max;
    }
}
