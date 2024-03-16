package Semester_2.PraktikumPBO.Pertemuan2.Tugas2;

import java.util.Scanner;

public class Display {
    public void displayMenuAwal(){
        Scanner in = new Scanner(System.in);
        Perpus kategori = new Perpus();

        System.out.println("==== Selamat Datang di PerpusOnline ====");
        System.out.println("Pilih :");
        System.out.println("1. Teknologi");
        System.out.println("2. Filsafat");
        System.out.println("3. Sejarah");
        System.out.println("4. Agama");
        System.out.println("5. Psikologi");
        System.out.println("6. Politik");
        System.out.println("7. Fiksi \n");

        System.out.print("Masukkan Pilihan Anda : ");
        short pilihan = in.nextShort(); 
        System.out.println("============================ \n");

        switch (pilihan) {
            case 1:
                System.out.println("Kategori : Teknologi \n");
                kategori.setDisplayBuku(
                    "Algorithms to Live By: The Computer Science of Human Decisions","Brian Christian","Tom Griffiths", "Penelusuran unik bagaimana algoritma komputer dapat membimbing keputusan manusia dalam kehidupan sehari-hari dengan bijaksana.", 
                    "Computer Architecture: A Quantitative Approach", "John L. Hennessy", "David A. Patterson", "Buku ini mengeksplorasi arsitektur komputer dengan pendekatan kuantitatif, menyoroti desain dan kinerja sistem komputer modern.");
                break;
            case 2 :
                System.out.println("Kategori : Filsafat \n");
                kategori.setDisplayBuku(
                    "A History of Western Philosophy","Bertrand Russell","-", "Penelusuran mendalam tentang pemikiran filsafat Barat, membahas pemikiran dari para pemikir terkemuka hingga perkembangan modern.",
                    "Loving The Wounded Soul", "Regis Machdy", "-", "Menggambarkan perjalanan penyembuhan melalui cinta dalam menghadapi trauma dan kesulitan emosional.");
                break;
            case 3 :
                System.out.println("Kategori : Sejarah \n");
                kategori.setDisplayBuku(
                    "Sejarah Dunia yang Disembunyikan","Jonathan Black","-","Mengungkap fakta menarik tentang peristiwa dan tokoh yang sering terlupakan dalam sejarah dunia.",
                    "World History Sejarah Dunia Lengkap", "Hutton Webster", "-", "Menyajikan pandangan mendalam tentang peradaban dunia dari zaman kuno hingga modern.");
                break;
            case 4 :
                System.out.println("Kategori : Agama \n");
                kategori.setDisplayBuku(
                    "Secrets of Divine Love: Sebuah Perjalanan Spiritual yang Mendalam tentang Islam","A. Helwa","-", "Menjelajahi hubungan spiritual dengan Islam melalui pengalaman pribadi, menginspirasi pencarian makna dan kedekatan dengan Tuhan.",
                    "The Miracle of Ikhlas", "Anin DP", "-", "Kisah penuh inspirasi tentang kekuatan ikhlas dalam menghadapi cobaan dan mencapai kesuksesan.");
                break;
            case 5 :
                System.out.println("Kategori : Psikologi \n");
                kategori.setDisplayBuku(
                    "The Psychology of Money","Morgan Housel","-", "Membahas hubungan antara emosi dan keputusan finansial secara jelas dan mendalam.",
                    "The Power of Habit", "Charles Duhigg", "-", "Mengungkap kekuatan kebiasaan dalam mengubah kehidupan dan perubahan pribadi yang signifikan.");
                break;
            case 6 :
                System.out.println("Kategori : Politik \n");
                kategori.setDisplayBuku(
                    "Paradoks Demokrasi","Chantal Mouffe","-", "Merangkum kontradiksi demokrasi dalam konteks politik kontemporer, menyoroti kompleksitas dan ketegangan antara pluralitas dan konsensus.",
                    "Politik Hukum di Indonesia", "Prof. Dr. Moh. Mahfud MD", "-", "Analisis mendalam mengenai hubungan politik dan hukum di Indonesia, dengan wawasan dari Prof. Dr. Moh. Mahfud MD.");
                break;
            case 7 :
                System.out.println("Kategori : Fiksi \n");
                kategori.setDisplayBuku(
                    "Solo Leveling","Chugong","-", "10 tahun yang lalu, setelah \"Gate\" yang menghubungkan dunia nyata dengan dunia monster dibuka, beberapa orang biasa dan biasa menerima kekuatan untuk berburu monster di dalam Gerbang. Mereka dikenal sebagai \"Hunter\". Namun, tidak semua Pemburu itu kuat. Namaku Sung Jin-Woo, seorang Pemburu peringkat E. Aku adalah seseorang yang harus mempertaruhkan nyawanya di ruang bawah tanah yang paling rendah, \"Terlemah di Dunia\". Karena tidak memiliki keterampilan apa pun untuk ditampilkan, saya hampir tidak mendapatkan uang yang dibutuhkan dengan bertarung di ruang bawah tanah dengan level rendah ... setidaknya sampai saya menemukan ruang bawah tanah tersembunyi dengan tingkat kesulitan tersulit di dalam ruang bawah tanah peringkat D! Pada akhirnya, saat saya menerima kematian, saya tiba-tiba menerima kekuatan aneh, sebuah catatan pencarian yang hanya bisa saya lihat, sebuah rahasia untuk naik level yang hanya saya yang tahu! Jika saya berlatih sesuai dengan misi saya dan memburu monster, level saya akan naik. Berubah dari Pemburu terlemah menjadi Pemburu peringkat-S terkuat!",
                    "Omniscient Reader's Viewpoint", "Sing Shong", "-", "Kim Dok Ja, satu-satunya orang yang membaca web novel 'Tiga Cara Bertahan Hidup di Dunia yang Hancur'. Setelah membaca bab terakhir novel tersebut, tiba-tiba dunianya berubah menjadi seperti di web novel. Hanya Kim Dok Ja yang mampu bertahan hidup di situasi genting tersebut. Bersama dengan para karakter di 'Tiga Cara Bertahan Hidup di Dunia yang Hancur', Kim Dok Ja akan menyelamatkan dirinya!");
                break;
            default:
                System.out.println("Input tidak valid");
                break;
        }
        kategori.hitungJumlahKata();
        kategori.cekPersentaseKesamaan();
        kategori.displayMessage();

        in.close();
    }
}
