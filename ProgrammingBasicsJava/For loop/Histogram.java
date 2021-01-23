import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;
        for (int i = 1; i <=n ; i++) {
            double currentNum = Double.parseDouble(scanner.nextLine());
            if (currentNum < 200){
            p1++;

            }else if (currentNum < 400 ){
                p2++;

            }else if (currentNum < 600){
                p3++;

            }else if (currentNum < 800) {
                p4++;

            }else if (currentNum >= 800){
                p5++;

            }

        }
        System.out.printf("%.2f%%%n", p1 / n * 100);
        System.out.printf("%.2f%%%n", p2/ n * 100);
        System.out.printf("%.2f%%%n", p3/ n * 100);
        System.out.printf("%.2f%%%n", p4/ n * 100);
        System.out.printf("%.2f%%", p5/ n * 100);
    }
}
