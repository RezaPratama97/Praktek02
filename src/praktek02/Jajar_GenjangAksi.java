package praktek02;

public class Jajar_GenjangAksi {
    public static void main(String[] args) {
        Jajar_Genjang rl = new Jajar_Genjang();
        rl.alas   = 7;
        rl.tinggi = 9;
        
        rl.cetakInfo();
        System.out.println("Keliling Jajar Genjang = "+rl.hitungKeliling());
        rl.cetakKeliling();
    }
}
