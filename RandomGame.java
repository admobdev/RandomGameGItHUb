import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) throws InterruptedException {
        Random sca = new Random();
        System.out.println("NOMALUM SONNI TOPISH O'YINIGA XUSH KELIBSIZ !!!");
        Thread.sleep(2600);
        System.out.println(" \t  Unda boshladik......");
        Thread.sleep(1000);
        Scanner sc = new Scanner(System.in);
        int y;
        boolean returnGame = true;

        while(returnGame) {
            boolean yoq = false;
            int x = (int) (Math.random() * 10);
            int count = 0;

            while (yoq == false) {
                Thread.sleep(300);
                System.out.print(" \t    Nomalum sonni kiritib ko'ring: ");
                y = sc.nextInt();
                count ++;

                if (y == x) {
                    yoq = true;
                }
                else if (y < x) {
                    System.out.println("       \t   BU son biroz kichik.. :(");
                }
                else if (y > x) {
                    System.out.println("      \t  BU son biroz katta.. :(");
                }
            }

            System.out.println("      \t  Ofarin siz uddalandiz. :)" + " U son " + x + " edi");
            Thread.sleep(1800);
            System.out.println("      \t     Siz o'yin davomida " + count + " marta urinish qayd ettingiz.. :)");
            Thread.sleep(1500);

            String qaytaOynash;
            qaytaOynash = sc.nextLine();
            System.out.println("       \t        Yana o'ynashni hohlaysiz m ? \n   \t              xa yoki yoq  <- tanlang");
            qaytaOynash = sc.nextLine();

            if (qaytaOynash.equalsIgnoreCase("xa"))
            {
                System.out.println("   \t  Unda boshladik..  :)");
                Thread.sleep(500);
                returnGame = true;
            }
            else
            {
                Thread.sleep(500);
                System.out.println("Yaxshi qatnashganiz uchun tashakkur");
                returnGame = false;
            }
        }
    }
}