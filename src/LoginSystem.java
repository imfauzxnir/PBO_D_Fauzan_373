import java.util.InputMismatchException;
import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                // Menu utama
                System.out.println("\nPilih Login:");
                System.out.println("1. Admin");
                System.out.println("2. Mahasiswa");
                System.out.println("3. Keluar");
                System.out.print("Masukkan pilihan: ");

                int pilihan = scanner.nextInt();
                scanner.nextLine(); // Membersihkan buffer

                if (pilihan == 1) {
                    loginAdmin(scanner);
                } else if (pilihan == 2) {
                    loginMahasiswa(scanner);
                } else if (pilihan == 3) {
                    System.out.println("Program selesai.");
                    break;
                } else {
                    System.out.println("Pilihan tidak valid. Silakan masukkan angka 1, 2, atau 3.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid! Harap masukkan angka (1, 2, atau 3).");
                scanner.nextLine(); // Membersihkan input yang salah agar tidak loop terus-menerus
            }
        }

        scanner.close();
    }

    // Metode untuk login sebagai Admin
    public static void loginAdmin(Scanner scanner) {
        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();

        if (username.equals("Admin") && password.equals("Admin123")) {
            System.out.println("Login Admin berhasil!");
        } else {
            System.out.println("Login gagal! Username atau password salah.");
        }
    }

    // Metode untuk login sebagai Mahasiswa
    public static void loginMahasiswa(Scanner scanner) {
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();

        if (nama.equals("Fauzan Irawan") && nim.equals("202110370311373")) {
            System.out.println("Login Mahasiswa berhasil!");
        } else {
            System.out.println("Login gagal! Nama atau NIM salah.");
        }
    }
}
