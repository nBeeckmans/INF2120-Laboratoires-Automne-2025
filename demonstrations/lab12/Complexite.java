public class Complexite {

    public static void main(String [] args){
        System.out.println(methode(10));
        System.out.println(methode(20));
        System.out.println(methode(1000));
    }
    public static int methode(int n) {
        int k = 0;
        int i = 0;
        int j = i+1;

        for (; i < n; ++i){
            if (i == j){
                i = 0;
                j++;
            }
            k++;
        }

        return k;
    }

    public static boolean methode(int[] array, int valeur) {
        //assert estTrié(array);

        int i = 0;
        int j = array.length -1;
        int somme = array[i] + array[j];
        while(somme != valeur && i < j) {
            while(somme != valeur && i < j) {
                somme =  array[i] + array[j];
                --j;
            }
            somme =  array[i] + array[j];
            ++i;
        }
        return somme == valeur;
    }
}