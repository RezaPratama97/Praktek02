package praktek02;
public class Jajar_Genjang {
    double alas;
    double tinggi;
    
    void cetakInfo() {
        System.out.println("==================");
        System.out.println("alas   :"+alas);
        System.out.println("tinggi :"+tinggi);
        System.out.println("==================");
    }
    
    double hitungKeliling() {
        double keliling;
        keliling=alas*tinggi;
        return keliling;
    }
    
    void cetakKeliling(){
        System.out.println("Kelilingnya adalah : "+hitungKeliling());
    }
}
