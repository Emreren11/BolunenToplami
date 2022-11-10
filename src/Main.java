import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        int no,sum=0;

        System.out.print("Bir sayı giriniz: ");
        no=inp.nextInt();
        while(no%2==0)
        {
            if (no%4==0)
            {
                sum+=no;
            }
            System.out.print("Bir sayı daha giriniz (Döngüyü bitirmek için tek sayı giriniz): ");
            no=inp.nextInt();
        }
        System.out.println("Girilen sayılardan 4'e bölünebilen sayıların toplamı: "+sum);
    }
}