public class zadatak2 {
    public static void main(String[] args) {
        /* Zadatak 2:
Napraviti metodu koja prihvata niz String-ova i neki String, vraca nam true ako se taj
String nalazi u nizu.
*/
        String[] niz = {"da", "ne", "mozda", "alo",""};
        String neki = "x";
        boolean x = stringUNizu(niz, neki);
        System.out.println(x);
    }

    public static boolean stringUNizu(String[] niz, String nekiString) {
        boolean x = true;
        for (int i = 0; i < niz.length; i++) {
            if (nekiString.equalsIgnoreCase(niz[i])) {
                x = true;
                break;
            } else {
                x = false;
            }
        }
        return x;
    }
}
