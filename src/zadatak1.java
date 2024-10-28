public class zadatak1 {
    public static void main(String[] args) {
        /*Zadatak 1:
Napraviti metodu koja prihvata niz brojeva i vraca broj parnih brojeva u nizu.
*/

        int[] novi = {1, -2, 3, -4, 5, -6, -16, -20, 51};
        int x = brojParnihUNizu(novi);
        System.out.println(x);
    }
    public static int brojParnihUNizu(int[] niz) {
        int brojac = 0;
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] % 2 == 0) {
                brojac++;
            }
        }
        return brojac;
    }
}