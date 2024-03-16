package Semester_2.PraktikumPBO.Pertemuan2.Constructor;

public class Student {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;

    public Student(){
        name = "";
        address = "";
        age = 0;
    }
    public Student(String n, String a, int ag){
        name = n;
        address = a;
        age = ag;
    }
    public void setName(String n){ 
        name = n;
    }
    public void setAddress(String a){
        address = a;
    }
    public void setAge(int ag){
        age = ag;
    }
    public void setMath(int math){
        mathGrade = math;
    }
    public void setEnglish(int english){
        englishGrade = english;
    }
    public void setScience(int science){
        scienceGrade = science;
    }

    
    // soal no 2
    public Student(int math, int english, int science){
        this.mathGrade = math;
        this.englishGrade = english;
        this.scienceGrade = science;
    }
    
    private double getAverage(){
        double result = 0;
        result = (mathGrade+scienceGrade+englishGrade)/3;
        return result;
    }

    //constructor untuk no 4
    public Student(String n, String a, int ag, double mathGrade, double englishGrade, double scienceGrade){
        name = n;
        address = a;
        age = ag;
        this.mathGrade = mathGrade;
        this.englishGrade = englishGrade;
        this.scienceGrade = scienceGrade;
    }

    //soal no 3
    public boolean statusAkhir(double average){
        return average >= 61;
    }

    //soal no 5-
    public void jumlahObjek(int count){
        System.out.printf("\n<<< Banyaknya Objek : %d >>>",count);
    }

    public void displayMessage(){
        System.out.println("Siswa dengan nama : "+name);
        System.out.println("beramalat di : "+address);
        System.out.println("berumur : "+age);
        System.out.println("mempunyai nilai rata rata : "+ getAverage() );
        System.out.println("Status akhir : " + statusAkhir(getAverage())); // memanggil method status akhir
    }
    
}
