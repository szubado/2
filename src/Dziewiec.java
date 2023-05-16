import java.util.Random;

public class Dziewiec {
    public static void main(String[] args) {
        int tab[] = new int[10];
        for(int i = 0; i < tab.length; i ++) {
            System.out.print(tab[i] + " ");
        }
        Random random = new Random();
        boolean repeated = true;
        int change = 0;
        while(repeated) {
            for (int i = 0; i< tab.length; i++) {
                tab[i] = random.nextInt(-7, 8);
            }
            repeated = false;
            for (int i = 0; i < tab.length - 1 && !repeated; i++) {
                for (int j = i + 1; j < tab.length; j++) {
                    if (tab[i] == tab[j]) {
                        change++;
                        repeated = true;
                    }
                }
            }
        }
        for (int i = 0; i < tab.length - 1; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
        System.out.println(change);
    }
}
