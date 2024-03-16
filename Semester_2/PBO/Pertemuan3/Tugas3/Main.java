package Semester_2.PBO.Pertemuan3.Tugas3;

public class Main {
    public static void main(String[] args) {
        // Instansiasi objek weapon
        Weapon tombak = new Weapon("Tombak", 100);
        Weapon katana = new Weapon("Katana", 1000);

        // Instansiasi objek hero
        Hero hero = new Hero("Zilong", 500, 100, 50, tombak, 100);

        // Instansiasi objek Enemy
        Enemy enemy = new Enemy("Fanny", 300, 80, 30, katana, 80);

        // Menampilkan status awal Hero dan senjatanya
        System.out.println("=======PERTEMPURAN=======");
        System.out.println("Status Awal Hero dan Senjata:");
        hero.display();
        hero.weapon.display();

        // Menampilkan status awal Enemy dan senjatanya
        System.out.println("\nStatus Awal Enemy dan Senjata:");
        enemy.display();
        enemy.weapon.display();

        // Hero menyerang Enemy
        System.out.println("\nHero menyerang Enemy:");
        hero.attack(enemy);

        // Menampilkan status setelah serangan
        System.out.println("\nStatus Setelah Serangan:");
        hero.display();
        System.out.println("=======VS=======");
        enemy.display();

        // Hero melakukan pertahanan
        System.out.println("\nHero melakukan pertahanan:");
        hero.defense(); // Contoh penggunaan: nilai atk musuh sebesar 50
        hero.display();

        // Enemy melakukan penyembuhan
        System.out.println("\nEnemy melakukan penyembuhan:");
        enemy.remedy();
        enemy.display();
    }
}

