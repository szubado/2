import java.util.Random;

public class Dziesiec {
    public static void main(String[] args) {
        int tab[] = new int[3];
        int tab2[] = new int[tab.length];
        int tab3[] = new int[tab.length];
        Random random = new Random();
        boolean repeated = true;
        int change = -1;
        while (repeated) {
            for (int i = 0; i < tab.length; i++) {
                tab[i] = random.nextInt(1, 100);
                tab2[i] = random.nextInt(1, 100);
                tab3[i] = random.nextInt(1, 100);
                change++;
            }
            repeated = false;
            for (int i = 0; i < tab.length; i++) {
                for (int j = 0; j < tab.length; j++) {
                    if (tab[i] == tab2[j]) {
                        for (int k = 0; k < tab.length; k++) {
                            if (tab2[j] == tab3[k]) {
                            } else {
                                repeated = true;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab3[i] + " ");
        }
        System.out.println();
        System.out.println("Tables were changed: " + change + " times");
    }
}