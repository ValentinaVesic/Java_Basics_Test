public class zadatak3 {
    public static void main(String[] args) {
        /*Zadatak 3:
Napraviti metodu koja prihvata niz brojeva i vraca najveci broj iz niza.*/

        int[] niz = {950, 15, 1150, 18, 24, 25780, -879789987};
        int maksimum = najveciBrojUNizu(niz);
        System.out.println(maksimum);
    }

    public static int najveciBrojUNizu(int[] niz) {
        int najveci = niz[0];
        for (int i = 1; i < niz.length; i++) {
            if (najveci < niz[i]) {
                najveci = niz[i];
            }
        }
        return najveci;
    }
}
