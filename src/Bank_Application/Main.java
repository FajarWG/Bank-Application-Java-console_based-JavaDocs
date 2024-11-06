package Bank_Application;

import java.util.Scanner;

/**
 * Main class untuk menjalankan aplikasi Bank.
 * Kelas ini berfungsi untuk memulai aplikasi dan memanggil operasi perbankan.
 * 
 * @author pratiksutar841
 */
public class Main 
{
    /**
     * Metode utama yang digunakan untuk menjalankan aplikasi Bank.
     * 
     * Metode ini membuat objek dari kelas {@link Operation} dan memanggil metode
     * {@link Operation#bankinfo()} untuk menampilkan informasi bank kepada pengguna.
     *
     * @param args Argumen yang diterima dari command line (tidak digunakan dalam aplikasi ini).
     */
    public static void main(String[] args) 
    {
        // Membuat objek Operation untuk menjalankan operasi bank
        Operation operlation = new Operation();
        
        // Memanggil metode bankinfo() dari objek Operation
        operlation.bankinfo();
    }
}
