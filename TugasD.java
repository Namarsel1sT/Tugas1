
import java.util.Scanner;
public class TugasD {
    public static void main(String[] args) {
        Scanner Scam = new Scanner(System.in);
        int a = Scam.nextInt();
        int b = Scam.nextInt();
        
        int hasil = a / b;
        int sisa = a % b;

        System.out.println("masing-masing " + hasil);
        System.out.println("bersisa " + sisa);
    }
}
