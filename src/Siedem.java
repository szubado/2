import java.util.Random;

public class Siedem {
    public static void main(String[] args) {
        int tab[] = new int[30];
        int tab2[] = new int[tab.length];
        Random random = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(101);
        }
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < tab.length - 1; i++) {
                if (tab[i + 1] > tab[i]) {
                    int temp = tab[i + 1];
                    tab[i + 1] = tab[i];
                    tab[i] = temp;
                    flag = true;
                }
            }
        }
        System.out.println(tab[1]);
    }
}
