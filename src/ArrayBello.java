/*  Scrivete una classe ArrayBello che espone tre metodi:
add - aggiunge un elemento, se si e' raggiunto il limite di elementi all'interno dell'array lo ridimensiona travasandoci dentro gli elementi
get - ritorna l'elemento all'n -esima posizione
print - stampa tutti gli elementi dell'array
scrivere una classe Sequence che
ha un costruttore che accetta List<Integer>
ha un metodo int longestIncreasing() che ritorna la lunghezza della sequenza crescente piu' lunga, es: [1,2,3,4,0,2] -> 4, [1,2,0,3,4] -> 3, [] -> 0, [-4,-3,-1,-1,1,2] ->6 */

public class ArrayBello {

    private int[] array;

    public ArrayBello() {
        int[] array = {1, 2, 3, 4, 5};
        this.array = array;
    }

    public void print() {
        for (int index = 0; index < array.length; index++) {
            int result = array[index];
            System.out.println(result);
        }
    }

    public int[] add(int index) {
        array = new int[5 + index];
        int contatore = 1;
        for(int i= 0; i < array.length; i++){
            array[i] = contatore++;
        }
        return array;
    }

    public int getArray() {
        return array.length;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

}
