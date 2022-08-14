import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int temp;
        System.out.print("Hava sıcaklığını Gir : ");
        Scanner inp = new Scanner(System.in);
        temp = inp.nextInt();

        if (temp<5) {
            System.out.println("Kayak yap...");
            } else if (temp<15) {
            System.out.println("Sinemaya git");
            } else if (temp<25) {
            System.out.println("Piknik yap");
        } else System.out.println("Yuzmeye git");
    }
}