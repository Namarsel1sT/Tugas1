
import java.util.Scanner;
public class TugasF {
    public static void main(String[] args) {
        int a, b;
        Scanner Scam = new Scanner(System.in);
        int baris = 3;
        int kolom = 3;
        int array[][] = new int[baris][kolom];
        
        for(a=0; a<baris; a++)
        {
            for(b=0; b<kolom; b++)
            {
                array[a][b] = Scam.nextInt();
            }
        }
        for(a=0; a<kolom; a++)
        {
            for(b=0; b<baris; b++)
            {
                System.out.print(array[b][a]+" ");
            }
            System.out.println(" ");
        }
    }
}
