package Semester_2.PraktikumPBO.Pertemuan2.Tugas;

import java.util.Scanner;
public class Display {
    static Scanner in = new Scanner(System.in);

    public void displayMenuAwal() {
        System.out.println("==== Selamat Datang di PerpusOnline ====");
        System.out.println("Pilih Kategori Buku:");
        System.out.println("1. Teknologi");
        System.out.println("2. Filsafat");
        System.out.println("3. Sejarah");
        System.out.println("4. Agama");
        System.out.println("5. Psikologi");
        System.out.println("6. Politik");
        System.out.println("7. Fiksi\n");

        System.out.print("Masukkan Pilihan Anda: ");
        short pilihan = in.nextShort();
        System.out.println("============================\n");

        switch (pilihan) {
            case 1:
                displayTeknologi();
                break;
            case 2:
                displayFilsafat();
                break;
            case 3:
                displaySejarah();
                break;
            case 4:
                displayAgama();
                break;
            case 5:
                displayPsikologi();
                break;
            case 6:
                displayPolitik();
                break;
            case 7:
                displayFiksi();
                break;
            default:
                System.out.println("Input tidak valid");
                break;
        }
        in.close();
    }

    //Method tiap buku
    private void displayTeknologi() {
        System.out.println("Kategori : Teknologi \n");
        Perpus bukuTeknologi1 = new Perpus("Algorithms to Live By: The Computer Science of Human Decisions", "Brian Christian", "Tom Griffiths", "Penelusuran unik bagaimana algoritma komputer dapat membimbing keputusan manusia dalam kehidupan sehari-hari dengan bijaksana.");
        Perpus bukuTeknologi2 = new Perpus("Computer Architecture: A Quantitative Approach", "John L. Hennessy", "David A. Patterson", "Buku ini mengeksplorasi arsitektur komputer dengan pendekatan kuantitatif, menyoroti desain dan kinerja sistem komputer modern.");
        setAllDisplay(bukuTeknologi1, bukuTeknologi2);
    }

    private void displayFilsafat() {
        System.out.println("Kategori : Filsafat \n");
        Perpus bukuFilsafat1 = new Perpus("A History of Western Philosophy", "Bertrand Russell", "-", "Penelusuran mendalam tentang pemikiran filsafat Barat, membahas pemikiran dari para pemikir terkemuka hingga perkembangan modern.");
        Perpus bukuFilsafat2 = new Perpus("Loving The Wounded Soul", "Regis Machdy", "-", "Menggambarkan perjalanan penyembuhan melalui cinta dalam menghadapi trauma dan kesulitan emosional.");
        setAllDisplay(bukuFilsafat1, bukuFilsafat2);
    }

    private void displaySejarah() {
        System.out.println("Kategori : Sejarah \n");
        Perpus bukuSejarah1 = new Perpus("Sejarah Dunia yang Disembunyikan", "Jonathan Black", "-", "Mengungkap fakta menarik tentang peristiwa dan tokoh yang sering terlupakan dalam sejarah dunia.");
        Perpus bukuSejarah2 = new Perpus("World History Sejarah Dunia Lengkap", "Hutton Webster", "-", "Menyajikan pandangan mendalam tentang peradaban dunia dari zaman kuno hingga modern.");
        setAllDisplay(bukuSejarah1, bukuSejarah2);
    }

    private void displayAgama() {
        System.out.println("Kategori : Agama \n");
        Perpus bukuAgama1 = new Perpus("Secrets of Divine Love: Sebuah Perjalanan Spiritual yang Mendalam tentang Islam", "A. Helwa", "-", "Menjelajahi hubungan spiritual dengan Islam melalui pengalaman pribadi, menginspirasi pencarian makna dan kedekatan dengan Tuhan.");
        Perpus bukuAgama2 = new Perpus("The Miracle of Ikhlas", "Anin DP", "-", "Kisah penuh inspirasi tentang kekuatan ikhlas dalam menghadapi cobaan dan mencapai kesuksesan.");
        setAllDisplay(bukuAgama1, bukuAgama2);
    }

    private void displayPsikologi() {
        System.out.println("Kategori : Psikologi \n");
        Perpus bukuPsikologi1 = new Perpus("The Psychology of Money", "Morgan Housel", "-", "Membahas hubungan antara emosi dan keputusan finansial secara jelas dan mendalam.");
        Perpus bukuPsikologi2 = new Perpus("The Power of Habit", "Charles Duhigg", "-", "Mengungkap kekuatan kebiasaan dalam mengubah kehidupan dan perubahan pribadi yang signifikan.");
        setAllDisplay(bukuPsikologi1, bukuPsikologi2);
    }

    private void displayPolitik() {
        System.out.println("Kategori : Politik \n");
        Perpus bukuPolitik1 = new Perpus("Paradoks Demokrasi", "Chantal Mouffe", "-", "Merangkum kontradiksi demokrasi dalam konteks politik kontemporer, menyoroti kompleksitas dan ketegangan antara pluralitas dan konsensus.");
        Perpus bukuPolitik2 = new Perpus("Politik Hukum di Indonesia", "Prof. Dr. Moh. Mahfud MD", "-", "Analisis mendalam mengenai hubungan politik dan hukum di Indonesia, dengan wawasan dari Prof. Dr. Moh. Mahfud MD.");
        setAllDisplay(bukuPolitik1, bukuPolitik2);
    }

    private void displayFiksi() {
        System.out.println("Kategori : Fiksi \n");
        Perpus bukuFiksi1 = new Perpus("Solo Leveling", "Chugong", "-", "10 tahun yang lalu, setelah \"Gate\" yang menghubungkan dunia nyata dengan dunia monster dibuka, beberapa orang biasa dan biasa menerima kekuatan untuk berburu monster di dalam Gerbang. Mereka dikenal sebagai \"Hunter\". Namun, tidak semua Pemburu itu kuat. Namaku Sung Jin-Woo, seorang Pemburu peringkat E. Aku adalah seseorang yang harus mempertaruhkan nyawanya di ruang bawah tanah yang paling rendah, \"Terlemah di Dunia\". Karena tidak memiliki keterampilan apa pun untuk ditampilkan, saya hampir tidak mendapatkan uang yang dibutuhkan dengan bertarung di ruang bawah tanah dengan level rendah ... setidaknya sampai saya menemukan ruang bawah tanah tersembunyi dengan tingkat kesulitan tersulit di dalam ruang bawah tanah peringkat D! Pada akhirnya, saat saya menerima kematian, saya tiba-tiba menerima kekuatan aneh, sebuah catatan pencarian yang hanya bisa saya lihat, sebuah rahasia untuk naik level yang hanya saya yang tahu! Jika saya berlatih sesuai dengan misi saya dan memburu monster, level saya akan naik. Berubah dari Pemburu terlemah menjadi Pemburu peringkat-S terkuat!");
        Perpus bukuFiksi2 = new Perpus("Omniscient Reader's Viewpoint", "Sing Shong", "-", "Kim Dok Ja, satu-satunya orang yang membaca web novel 'Tiga Cara Bertahan Hidup di Dunia yang Hancur'. Setelah membaca bab terakhir novel tersebut, tiba-tiba dunianya berubah menjadi seperti di web novel. Hanya Kim Dok Ja yang mampu bertahan hidup di situasi genting tersebut. Bersama dengan para karakter di 'Tiga Cara Bertahan Hidup di Dunia yang Hancur', Kim Dok Ja akan menyelamatkan dirinya!");
        setAllDisplay(bukuFiksi1, bukuFiksi2);
    }

    //Merge keseluruhan display untuk tampil di terminal setelah user memilih angka buku
    private void setAllDisplay(Perpus buku1, Perpus buku2) {
        buku1.displayInfoBuku();
        System.out.println("============================\n");
        buku2.displayInfoBuku();
        int cekTingkatKesamaan = Perpus.cekTingkatKesamaan(buku1, buku2);
        System.out.println("Nilai hasil cek Kesamaan: " + cekTingkatKesamaan + "%");
        
        System.out.println("\n============== Hasil copy ==============\n");
        copy(buku1, buku2);
    }
    
    private void copy(Perpus buku1, Perpus buku2){
        buku1 = buku2; //Untuk mencopy buku1 atau buku 2 
        buku1.displayInfoBuku();
        System.out.println("============================\n");
        buku2.displayInfoBuku();
    }
}
