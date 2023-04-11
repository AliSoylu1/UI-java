package Giriş;
import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {

        int math, phys, chem, turk, hist, musc;
        int note1 = 0, note2 = 100;

        System.out.println("Lütfen ders notlarınızı girmeye başlayın.");
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik dersi notunuzu giriniz :");
        math = input.nextInt();
        boolean kosulMath = math >= note1 && math<=note2;
        String strM = kosulMath ? "" : "Programı Yeniden Başlatın! & Lütfen 0-100 arası not girin.";
        System.out.println(strM);

        System.out.print("Fizik dersi notunuzu giriniz :");
        phys = input.nextInt();
        boolean kosulPhys = phys >= note1 && phys<=note2;
        String strP = kosulPhys ? "" : "Programı Yeniden Başlatın! & Lütfen 0-100 arası not girin.";
        System.out.println(strP);

        System.out.print("Kimya dersi notunuzu giriniz :");
        chem = input.nextInt();
        boolean kosulChem = chem >= note1 && chem<=note2;
        String strC = kosulChem ? "" : "Programı Yeniden Başlatın! & Lütfen 0-100 arası not girin.";
        System.out.println(strC);

        System.out.print("Türkçe dersi notunuzu giriniz :");
        turk = input.nextInt();
        boolean kosulTurk = turk >= note1 && turk<=note2;
        String strT = kosulTurk ? "" : "Programı Yeniden Başlatın! & Lütfen 0-100 arası not girin.";
        System.out.println(strT);

        System.out.print("Tarih dersi notunuzu giriniz :");
        hist = input.nextInt();
        boolean kosulHist = hist >= note1 && hist<=note2;
        String strH = kosulHist ? "" : "Programı Yeniden Başlatın! & Lütfen 0-100 arası not girin.";
        System.out.println(strH);

        System.out.print("Müzik dersi notunuzu giriniz :");
        musc = input.nextInt();
        boolean kosulMusc = musc >= note1 && musc<=note2;
        String strMu = kosulMusc ? "" : "Programı Yeniden Başlatın! & Lütfen 0-100 arası not girin.";
        System.out.println(strMu);

        double result = (math+phys+chem+turk+hist+musc) / 6;
        System.out.println("Not ortalamanız :" + result);

        int x = 60, y = 100;
        boolean kosul1 = result >= x;
        boolean kosul2 = result <= y;
        boolean kosul3 = result <= y;
        boolean sonuc = kosul1 && kosul2;

        String str = sonuc ? "Sınıfı Geçtiniz, Tebrikler..." : "Sınıfı Geçemediniz...";
        System.out.println(str);

    }
}
