import java.util.Scanner;
public class DoWhileCuti02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah cuti: ");
        jatahCuti = scan.nextInt();

        do 
        {
            System.out.print("Apakah Anda Mengambil cuti (y/t)?");
            konfirmasi = scan.next();
            if (konfirmasi.equalsIgnoreCase("y"))
            {
                System.out.println("Jumlah hari : ");
                jumlahHari = scan.nextInt();
                if (jumlahHari <= jatahCuti)
                {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                }
                else 
                {
                    System.out.println("Sisa jatah cuti Anda Tidak mecukupi");
                    break;
                }
            }
        }
        while (jatahCuti > 0);

    }

}
