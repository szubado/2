public class Cztery {
    public static void main(String[] args) {
        int n = 10;
        int tab[] = new int[n];
        tab[0] = 0;
        tab[1] = 1;
        for (int i = 2; i < tab.length; i++) {
            tab[i] = tab[i - 1] + tab[i - 2];
        }
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
    }
}
