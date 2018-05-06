package praktek02;

public class Jajar_GenjangAksi {
    public static void main(String[] args) {
        Jajar_Genjang rl = new Jajar_Genjang();
        rl.alas   = 7;
        rl.tinggi = 9;
        
        rl.cetakInfo();
        System.out.println("Keliling Jajar Genjang = "+rl.hitungKeliling());
        rl.cetakKeliling();
        
        Jajar_Genjang r2 = new Jajar_Genjang();
        r2.cetakInfo();
        
        Jajar_Genjang r3 = new Jajar_Genjang(40,70);
        r3.cetakInfo();
    }
}
