package Semester_2.PraktikumPBO.Pertemuan3.OverloadingConstructor;

public class LingkaranMain {
    public static void main(String[] args) {
        Lingkaran lingkaran1 = new Lingkaran(3);
        lingkaran1.displayMessage();

        Lingkaran lingkaran2 = new Lingkaran(4, 10);
        lingkaran2.displayMessage();

        //instansiasi lString pada kelas main
        Lingkaran lString = new Lingkaran("4", "10");
        lString.displayMessage();
    }
}
