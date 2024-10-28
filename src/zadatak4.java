public class zadatak4 {
    public static void main(String[] args) {
        /*Zadatak 4(xo):
Napraviti metodu koja prima niz karaktera(sastoje se samo od x i o), vraca nam karakter
koji se
nalazi uzastopno 3 puta za redom.
Primer:
{x,o,o,x,o,o,o,x,x} -> o je pobednik!*/
        char[] niz = {'x', 'x', 'x', 'o', 'o', 'o', 'x', 'x', 'x' };
        char pobednik = pobednik(niz);
        System.out.println(pobednik);
    }

    public static char pobednik(char[] niz) {
        int j = 0;
        int k = 1;
        char pobednik = ' ';
        for (int i = 2; i < niz.length; i++) {
            if (niz[j] == niz[k] && niz[k] == niz[i]) {
                pobednik = niz[j];
                break;
            }
            j++;
            k++;
        }
        return pobednik;
    }
}
