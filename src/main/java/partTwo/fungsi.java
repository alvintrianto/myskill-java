package partTwo;

public class fungsi {
    public static int tambah(int a,int b){
        return a + b;
    }

    public static int kuadrat(int x){
        return x*x;
    }

    public static void main(String[] arg){
        int hasilTambah = tambah(1,3);
        int hasilKuadrat = kuadrat(5);

        int hasilTambahKedua = tambah(1,4);
        int hasilTambahKetiga = tambah(1,5);

        System.out.println("Hasil tambah: " + hasilTambah);
        System.out.println("Hasil kuadrat: " + hasilKuadrat);
        System.out.println("Hasil kuadrat: " + hasilKuadrat);
    }
}
