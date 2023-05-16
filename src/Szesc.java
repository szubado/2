public class Szesc {
    public static void main(String[] args) {
        int n = 9;
        int iloczyn = 0;
            boolean flag = true;
            while (flag) {
                flag = false;
                if (n > 2 && n % 2 == 0) {
                    n = n / 2;
                    iloczyn++;
                    flag = true;
                }
            }
            if (n > 2 && n % 2 != 0) {
                System.out.println("To nie jest potega 2ki");
            } else {
                System.out.println(iloczyn);
            }
        }
    }

