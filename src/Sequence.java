/* scrivere una classe Sequence che
ha un costruttore che accetta List<Integer>
ha un metodo int longestIncreasing() che ritorna la lunghezza della sequenza crescente piu' lunga, es: [1,2,3,4,0,2] -> 4, [1,2,0,3,4] -> 3, [] -> 0, [-4,-3,-1,-1,1,2] ->6 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Sequence {

    List<Integer> newArray = new ArrayList<>(Arrays.asList());

    public Sequence() {
        Random number = new Random();
        for (int index = 0; index <= 5; index++) {
            int result = number.nextInt(5);
            newArray.add(result);
        }

        System.out.println(newArray);

    }

}
