package Tugas.src;
import java.util.Scanner;

public class Tugas_PBO {
     public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

       
        System.out.println("Pilih Login");
        System.out.println("1.Admin");
        System.out.println("2.Mahasiswa");
        System.out.print("Masukkan Pilihan: ");
        int pilihan = input.nextInt();
        input.nextLine();
        switch (pilihan) {
            case 1:
                admin();
                break;
            case 2:
                mahasiswa();
                break;
            default:
                System.out.println("Pilihan tidak valid");

        }
    }

    public static void admin() {
        String userAdmin = "Admin465";
        String passAdmin = "Password465";

        System.out.print("Masukkan username: ");
        String usernameAdmin = input.nextLine();

        System.out.print("Masukkan Password: ");
        String passwordAdmin = input.nextLine();

        if (usernameAdmin.equals(userAdmin) && passwordAdmin.equals(passAdmin)) {
            System.out.println("Login anda berhasil");
        }else{
            System.out.println("Login gagal! Username atau password salah.");
        }
    }

    public static void mahasiswa() {
        String userMahasiswa = "Ratu Carmenita";
        String passMahasiswa = "202410370110465";

        System.out.print("Masukkan username: ");
        String usernameMahasiswa = input.nextLine();

        System.out.print("Masukkan Password: ");
        String passwordMahasiswa = input.nextLine();

        if (usernameMahasiswa.equals(userMahasiswa) && passwordMahasiswa.equals(passMahasiswa)) {
            System.out.println("Login anda berhasil");
        }else{
            System.out.println("Login gagal! Username atau password salah.");
        }
    }
}
