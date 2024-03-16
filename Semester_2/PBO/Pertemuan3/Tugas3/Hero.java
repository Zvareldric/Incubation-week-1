package Semester_2.PBO.Pertemuan3.Tugas3;

public class Hero {
    String nama;
    int hp;
    int def = 0;
    int baseAtk = 58;
    Weapon weapon;
    int level = 1;

    Hero(String nama, int hp, int def, int baseAtk, Weapon weapon, int level){
        this.nama = nama;
        this.hp = hp;
        this.def = def;
        this.baseAtk = baseAtk;
        this.weapon = weapon;
        this.level = level;
    }
    void attack(Enemy enemy){
        int serang = (this.level * this.baseAtk) + this.weapon.atk - enemy.def + Weapon.randomAtk(this.weapon);
        int hpSetelahSerangan = enemy.hp - serang; // Hitung HP setelah serangan
        if (hpSetelahSerangan < 0) {
            hpSetelahSerangan = 0; // Pastikan HP tidak menjadi negatif
        }
        enemy.hp = hpSetelahSerangan;
        System.out.printf("%s menyerang %s\n", this.nama, enemy.nama);
    }

    void defense(){
            this.def += (this.baseAtk * this.level)/2;
    }

    void heal(){
        this.hp += 100;
    }

    void display(){
        System.out.println("\nNama : " + this.nama);
        System.out.println("Level : " + this.level);
        System.out.println("Health : " + this.hp + " hp");
        System.out.println("Deffense : " + this.def);
        System.out.println("Base attack : " + this.baseAtk);
        // System.out.println("Weapon : " + this.weapon.name);
    }
}
