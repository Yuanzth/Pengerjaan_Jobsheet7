import java.util.Scanner;

public class WhileKelipatan02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kelipatan, jumlah, counter;
        jumlah = 0;
        counter = 0;
        System.out.print("Masukkan bilangan kelipatan (1-9): ");
        kelipatan = scan.nextInt();
        
        int i = 1; // Inisialisasi
        while (i <= 50) // Kondisi
        { 
            if (i % kelipatan == 0) 
            {
                jumlah += i; // Menambahkan nilai i ke jumlah
                counter++;
            }
            i++; // Update
        }
            double rataRata = (double) jumlah / counter; // Menghitung rata-rata
            System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
            System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
            System.out.printf("Rata-rata bilangan kelipatan %d dari 1 sampai 50 adalah %.2f\n", kelipatan, rataRata);
    }
}