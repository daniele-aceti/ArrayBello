/* scrivere una classe Sequence che
ha un costruttore che accetta List<Integer>
ha un metodo int longestIncreasing() che ritorna la lunghezza della sequenza crescente piu' lunga, es: [1,2,3,4,0,2] -> 4, [1,2,0,3,4] -> 3, [] -> 0, [-4,-3,-1,-1,1,2] ->6 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sequence {

    private List<Integer> newArray;

    public Sequence() {
        newArray = new ArrayList<>(Arrays.asList());
        System.out.println(newArray);

    }

    public int longestIncreasing() {
        int contatore = 1;
        int count = 1;
        for (int index = 0; index <= newArray.size(); index++) {
            if (newArray.size() == count) {
                return contatore;
            } else if (newArray.isEmpty()) {
                contatore = 0;
            } else if (newArray.get(index) <= newArray.get(count)) {
                //System.out.println("contatore " + index + " " + count + "contatore: " + contatore + " " + newArray.get(index));
                contatore++;
            } else if (newArray.get(index) >= newArray.get(count)) {
                return contatore;
            }

            count++;
        }

        return contatore;
    }

}
