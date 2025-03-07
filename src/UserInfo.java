import java.util.Scanner;
import java.time.LocalDate;

public class UserInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Data
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelamin = scanner.next().charAt(0);

        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = scanner.nextInt();

        // Hitung umur
        int tahunSekarang = LocalDate.now().getYear();
        int umur = tahunSekarang - tahunLahir;

        // Tentukan jenis kelamin
        String jenisKelaminText;
        if (jenisKelamin == 'L' || jenisKelamin == 'l') {
            jenisKelaminText = "Laki-laki";
        } else if (jenisKelamin == 'P' || jenisKelamin == 'p') {
            jenisKelaminText = "Perempuan";
        } else {
            jenisKelaminText = "Tidak valid";
        }

        // Output
        System.out.println("\nData Diri:");
        System.out.println("Nama         : " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelaminText);
        System.out.println("Umur         : " + umur + " tahun");

        scanner.close();
    }
}
