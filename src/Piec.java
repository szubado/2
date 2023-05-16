import java.util.Random;

public class Piec {
    public static void main(String[] args) {
        int tab[] = new int[10];
        int tab2[] = new int[tab.length];
        Random random = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(101);
            System.out.print(tab[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < tab.length; i++) {
            if(i < 3) {
            tab2[i] = tab[i + 7];
        } else {
                tab2[i] = tab[i - 3];
            }
            System.out.print(tab2[i] + " ");
        }
    }
}
