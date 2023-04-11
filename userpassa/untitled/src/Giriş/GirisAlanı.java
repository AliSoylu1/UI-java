package Giriş;

import java.util.Scanner;

public class GirisAlanı {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String userName, password, newPassaword;
        int right;

        System.out.print("Kullancı adınızı girin: ");
        userName = input.nextLine();
        System.out.print("Şifrenizi girin: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş başarılı...");
        } else {
            System.out.println("Yanlış giriş yaptınız. Şifrenizi sıfırlamak istermisiniz.");
            System.out.println("\n1-EVET \n2-HAYIR");
            right = input.nextInt();
            if (right == 1) {

                System.out.print("Eski şifreniz ile aynı olmasın!");
                System.out.print("Şifrenizi girin: ");
                newPassaword = input.next();

                if (newPassaword.equals(password)) {
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz:");
                    newPassaword = input.nextLine();

                } else {
                    System.out.print("Yeni Şifreniz Başarı ile Oluşturuldu.");
                }
            } else if (right == 2) {
                System.out.println("Yenileme işlemi iptal edildi");


            } else {
                System.out.println("Geçersiz seçim lütfen 1 veya 2 seçin.");
            }
        }
    }
}
