package Semester_2.PraktikumPBO.Pertemuan2.InstanceMethod;

public class Rasional {
    private int pembilang, penyebut;

    public Rasional(){
        pembilang=0;
        penyebut=0;
    }

    public Rasional(int pbl, int pyb){
        pembilang=pbl;
        penyebut=pyb;
    }

    //mengecek suatu bilangan adalah rasional atau bukan
    public boolean isRasional(){
        return (penyebut!= 0);
    }

    //menyederhanakan bilangan rasional
    public void Sederhana(){
        int temp, A, B;
        if (penyebut ==0){
            return;
        }
        A = (pembilang<penyebut) ? penyebut:pembilang;
        B = (pembilang<penyebut) ? pembilang:penyebut;

        // while (B != 0){
        //     temp= A % B;
        //     A = B;
        //     B = temp;
        // }

        //soal no 3
        for (; B != 0;) {
            temp = A % B;
            A = B;
            B = temp;
        }

        pembilang /=A;
        penyebut /=A;
    }

    public double Cast(){
        return (penyebut==0.0) ? 0.0 : (double)pembilang /
        (double)penyebut;

    }

    //oprator
    public boolean moreThan (Rasional A){
        return (pembilang * A.penyebut > penyebut * A.pembilang);
    }

    //soal no 2
    public boolean lessThan (Rasional A){
        return (pembilang * A.penyebut < penyebut * A.pembilang);
    }

    public boolean lessThanEqual (Rasional A){
        return (pembilang * A.penyebut <= penyebut * A.pembilang);
    }

    public boolean moreThanEqual (Rasional A){
        return (pembilang * A.penyebut >= penyebut * A.pembilang);
    }

    //operator Unary- ---> A = -A
    public void negasi(){
        pembilang = - pembilang;
    }

    
    //soal no 4
    //untuk operator penjumlahan
    public void unaryPlus(Rasional A){
        int hasilPembilang = pembilang * A.penyebut + penyebut * A.pembilang;
        int hasilPenyebut = penyebut * A.penyebut;
        System.out.printf("Nilai dari 'R1 += R2' : %d/%d", hasilPembilang, hasilPenyebut);
    }
    // Untuk operator pengurangan (-)
    public void unarySubtract(Rasional A){
        int hasilPembilang = pembilang * A.penyebut - penyebut * A.pembilang;
        int hasilPenyebut = penyebut * A.penyebut;
        System.out.printf("Nilai dari 'R1 -= R2' : %d/%d", hasilPembilang, hasilPenyebut);
    
    }
    //operator perkalian (*)
    public void unaryMultiply(Rasional A){
        int hasilPembilang = pembilang * A.pembilang;
        int hasilPenyebut = penyebut * A.penyebut;
        System.out.printf("Nilai dari 'R1 *= R2' : %d/%d", hasilPembilang, hasilPenyebut);
    }   
        
    // Untuk operator pembagian (/)
    public void unaryDivide(Rasional A) {
        if (A.pembilang != 0) { 
            int hasilPembilang = pembilang * A.penyebut;
            int hasilPenyebut = penyebut * A.pembilang; 
            System.out.printf("Nilai dari 'R1 /= R2' : %d/%d", hasilPembilang, hasilPenyebut);
        } else {
            //ketika bagian A.pembilang = 0
            System.out.println("Tidak bisa dibagi oleh 0.");
        }
    }

    public void cetak(){
        System.out.println(pembilang + "/" + penyebut);
    }
}