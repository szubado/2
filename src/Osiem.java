public class Osiem {
    public static void main(String[] args) {
        int tab[] = new int[100];
        tab[0] = 2;
        for (int i = 1; i < tab.length; i++) {
            tab[i] = tab[0] + i;
        }
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < Math.sqrt(tab.length); i++) {
            if (tab[i] != 0) {
                for (int j = i + 1; j < tab.length; j++) {
                    if (tab[j] % tab[i] == 0) {
                        tab[j] = 0;
                    }
                }
            }
        }
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] != 0) {
                System.out.print(tab[i] + " ");
            }
        }
    }
}
