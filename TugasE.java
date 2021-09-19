
import java.util.Scanner;
public class TugasE {
    public static void main(String[] args) {
        Scanner Scam = new Scanner(System.in);
        double a = Scam.nextDouble();
        double t = Scam.nextDouble();

        double luas = a * t / 2;

        System.out.format("%.2f", luas);
    }
}
