import java.util.Scanner;

public class TigaLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Batas deret (n) : ");
        int n = scanner.nextInt();

        System.out.println("\n===== SATU DERET, TIGA LOOP =====");

        // Ketentuan 1: Tulis ketiga versi deret secara lengkap dengan label untuk, sementara, melakukan sementara
        // 1. FOR (untuk)
        System.out.print("untuk : ");
        for (int iFor = 1; iFor <= n; iFor++) {
            System.out.print(iFor + " ");
        }
        System.out.println();

        // 2. WHILE (sementara / ketika)
        System.out.print("sementara : ");
        int iWhile = 1;
        while (iWhile <= n) {
            System.out.print(iWhile + " ");
            iWhile++;
        }
        System.out.println();

        // 3. DO-WHILE (lakukan sementara)
        System.out.print("lakukan sementara : ");
        int iDoWhile = 1;
        do {
            System.out.print(iDoWhile + " ");
            iDoWhile++;
        } while (iDoWhile <= n);
        System.out.println();

        /*
         * Ketentuan 2 & Penjelasan Soal:
         * Kenapa saat n = 0, dua baris pertama (for dan while) kosong, sedangkan baris ketiga (do-while) mencetak angka 1?
         * PENJELASAN:
         * Loop 'for' dan 'while' memeriksa kondisi (1 <= n) SEBELUM menjalankan badan loop.
         * Saat n = 0, kondisi (1 <= 0) bernilai false sejak awal, sehingga badan loop tidak pernah dijalankan.
         * Sebaliknya, loop 'do-while' selalu MENJALANKAN badan loop minimal satu kali terlebih dahulu
         * sebelum memeriksa kondisi di akhir. Oleh karena itu, angka 1 dicetak terlebih dahulu sebelum
         * kondisi (2 <= 0) diperiksa dan menghentikan perulangan.
         * Kesimpulan: do-while memeriksa kondisinya setelah badan loop dijalankan, jadi badannya pasti jalan minimal sekali.
         */

        System.out.println();

        // Ketentuan 3: Buktikan meleset satu (off-by-one)
        int kurang = 0;
        for (int i = 1; i < n; i++) {
            kurang++;
        }

        int kurangSama = 0;
        for (int i = 1; i <= n; i++) {
            kurangSama++;
        }

        System.out.println("i < n berputar : " + kurang + " kali");
        System.out.println("i <= n berputar : " + kurangSama + " kali");

        // Ketentuan 4: Saring deret 1-10 dengan continue (lewati genap) dan break (berhenti kalau i > 7)
        System.out.print("Melucuti senjata: ");
        int countPrintln = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // lewati angka genap
            }
            if (i > 7) {
                break; // berhenti kalau i > 7
            }
            System.out.print(i + " ");
            countPrintln++;
        }
        System.out.println();
        System.out.println("Sampai println : " + countPrintln + " kali");

        /*
         * Ketentuan 5:
         * Kenapa loop tidak berhenti di i = 8 padahal 8 sudah lebih besar dari 7?
         * PENJELASAN:
         * Pada saat i = 8 (angka genap), perintah 'if (i % 2 == 0) continue;' dieksekusi TERLEBIH DAHULU
         * sebelum program mencapai pengecekan 'if (i > 7) break;'.
         * Pengecekan 'continue' langsung melompati sisa perintah dalam badan loop dan melanjutkan ke iterasi i = 9.
         * Baru saat i = 9 (angka ganjil), syarat 'continue' bernilai false, sehingga program lanjut ke pengecekan
         * 'if (i > 7) break;' yang kemudian menghentikan loop (break) secara permanen.
         */

        scanner.close();
    }
}