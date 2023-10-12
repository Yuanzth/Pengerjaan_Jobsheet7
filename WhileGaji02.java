import java.util.Scanner;

public class WhileGaji02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur, totalGajiLembur;
        String jabatan;
        gajiLembur = 0;
        totalGajiLembur = 0;

        System.out.print("Masukkan Jumlah Karyawan : ");
        jumlahKaryawan = scan.nextInt();

        int i = 0;
        while (i < jumlahKaryawan) 
        {
            System.out.println("Pilihan Jabatan - Direktur, Manajer, Karyawan");
            System.out.print("Masukkan jabatan ke-" + (i+1) + ": ");
            jabatan = scan.next();
            System.out.print("Masukkan Jam lembur: ");
            jumlahJamLembur = scan.nextInt();
            i++;
        
            if (jabatan.equalsIgnoreCase("direktur"))
            {
                continue;
            }
            else if (jabatan.equalsIgnoreCase("manajer"))
            {
                gajiLembur = jumlahJamLembur * 100000;
            }
            else if (jabatan.equalsIgnoreCase("karyawan"))
            {
                gajiLembur = jumlahJamLembur * 75000;
            }
            else 
            {
                System.out.println("Jabatan Invalid");
                i--;
            }
            totalGajiLembur += gajiLembur;
        }
        System.out.println("Total gaji lembur : " + totalGajiLembur);
    }
}
