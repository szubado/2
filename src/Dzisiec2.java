import java.util.Random;

public class Dzisiec2 {
    public static void main(String[] args) {
        int tab[] = new int[10];
        int tab2[] = new int[tab.length];
        int tab3[] = new int[tab.length];

        Random random = new Random();
        boolean repeate = true;
        int change = -1;
        while (repeate) {
            for (int i = 0; i < tab.length; i++) {
                tab[i] = random.nextInt(-20, 21);
                tab2[i] = random.nextInt(-20, 21);
                tab3[i] = random.nextInt(-20, 21);

                change++;
            }
            for (int i = 0; i < tab.length; i++) {                //bylo && repeate do warunku w petli
                for (int j = 0; j < tab.length; j++) {
                    if (tab[i] == tab2[j]) {
                        for (int k = 0; k < tab.length; k++){
                            if(tab[i] == tab3[k]) {
                                repeate = false; //wiec nie wejde do while
                                break;  //nie musze dalej szukac bo znalazlam
                            }
                        }
                        //wyjscie z petli zeby nie szukac ponownie tab[i] w tab2 bo w tab3 i nie ma
                        break;
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