public class zadatak6 {
    public static void main(String[] args) {
        /*Zadatak 6:
Napraviti metodu koja prima 3 niza String-ova i ispisuje nam poruku koji je od ta 3 niza
najveci.*/
        String[] niz1 = new String[150];
        String[] niz2 = new String[1550];
        String[] niz3 = new String[150];
        najveciString(niz1, niz2, niz3);

    }

    public static void najveciString(String[] niz1, String[] niz2, String[] niz3) {
        if (niz1.length > niz2.length && niz1.length > niz3.length) {
            System.out.println("Prvi niz je najveci.");
        } else if (niz2.length > niz1.length && niz2.length > niz3.length) {
            System.out.println("Drugi niz je najveci.");
        } else if (niz3.length > niz1.length && niz3.length > niz2.length) {
            System.out.println("Treci niz je najveci.");
        } else if (niz1.length == niz2.length && niz2.length == niz3.length) {
            System.out.println("Svi nizovi su iste velicine.");
        }
    }
}
