public class zadatak5 {
    public static void main(String[] args) {
        /*        /*Zadatak 5:
Napraviti metodu koja prima niz brojeva i proverava da li je niz monoton.
Niz je monoton ukoliko mu je vrednost ili rastuca ili opadajuca.
Primer: */
        int[] monoton = {1, 11, 8, -5, 21, 35};
        int[] monoton2 = {1, 0, -5, -10};
        int[] nemonoton = {1, 3, 6, 2, 11};
        int[] nemonoton2 = {5, 3, 4, 0, -2};
        int[] nemonoton3 = {1, 1, 2, 1, 3, 1, 1, 1, 1};
        potvrdaMonotonosti(monoton);
        potvrdaMonotonosti(monoton2);
    }

    public static void potvrdaMonotonosti(int[] niz) {
        int j = 0;
        int k = 1;
        String x = "";

        for (int i = 2; i < niz.length; i++) {
            if ((niz[j] >= niz[k] && niz[k] < niz[i]) ||
                    (niz[j] <= niz[k] && niz[k] > niz[i])) {
                x = "nije";
                break;
            } else {
                x = "jeste";
            }
            j++;
            k++;
        }
        System.out.println("Niz brojeva " + x + " monoton.");
    }
}
