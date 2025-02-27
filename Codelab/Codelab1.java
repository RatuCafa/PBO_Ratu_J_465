import java.time.LocalDateTime;
import java.util.Scanner;

public class Codelab1{
    // static String Makanan = "astor";
        public static void main(String[] args) {
            String nama;
            char gender;
            int tahun_lahir, umur;
            Scanner input = new Scanner(System.in);
    
            // System.out.println(Makanan);
        System.out.print("Masukkan nama: ");
        nama = input.nextLine();

        System.out.print("Masukkan gender (L/P): ");
        gender = input.next().charAt(0);

        System.out.print("Masukkan tahun lahir: ");
        tahun_lahir = input.nextInt();

        umur = LocalDateTime.now().getYear() - tahun_lahir;

        System.out.println("\n === Data Diri ===");
        System.out.println("Nama          : " + nama);
        System.out.print("Jenis Kelamin : ");
        System.out.println((gender == 'P' || gender == 'p') ? "Perempuan" : 
                           (gender == 'L' || gender == 'l') ? "Laki- laki" : "Tidak diketahui");
        System.out.println("Umur        : " + umur);


        input.close();

    }
}