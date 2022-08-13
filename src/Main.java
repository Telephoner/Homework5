public class Main {
    //задача 1
    public static void main(String[] args) {
        int[] natural = new int[3];
        natural[0] = 1;
        natural[1] = 2;
        natural[2] = 3;
        double[] fractional = {1.57, 7.654, 9.986};
        int[] whatever = {1, 74, 76, 97, 23, 45874, 13337};
        //задача 2
        System.out.println("Задание 2");
        for (int a = 0; a < natural.length; a++) {
            if (a >= natural.length - 1) {
                System.out.print(natural[a] + "\n");

            } else {
                System.out.print(natural[a] + ", ");
            }
        }
        for (int b = 0; b < fractional.length; b++) {
            if (b >= fractional.length - 1) {
                System.out.print(fractional[b] + "\n");
            } else {
                System.out.print(fractional[b] + ", ");
            }
        }
        for (int c = 0; c < whatever.length; c++) {
            if (c >= whatever.length - 1) {
                System.out.print(whatever[c] + "\n");

            } else {
                System.out.print(whatever[c] + ", ");
            }
        }
        //задача 3
        System.out.println("Задание 3");
        for (int d = 2; d <= natural.length; d--) {
            if (d <= natural.length - 3) {
                System.out.print(natural[d] + "\n");
                break;
            } else {
                System.out.print(natural[d] + ", ");

            }
        }
        for (int e = 2; e <= fractional.length; e--) {
            if (e <= natural.length - 3) {
                System.out.print(fractional[e] + "\n");
                break;
            } else {
                System.out.print(fractional[e] + ", ");
            }
        }
        for (int f = 6; f <= whatever.length; f--) {
            if (f <= whatever.length - 6) {
                System.out.print(whatever[f] + "\n");
                break;
            } else {
                System.out.print(whatever[f] + ", ");
            }
        }
            //задание 4
            System.out.println("Задание 4");
            for (int g = 0; g < natural.length; g++) {
                if (natural[g] % 2 == 0) {
                    System.out.println("Число " + natural[g] + " — четное, оставляем без изменений.");
                } else {
                    natural[g] = natural[g] + 1;
                    System.out.println("Число " + natural[g] + " получилось в результате суммирования, т.к. исходное число являлось нечетным. ");
                }
            }
        }
}