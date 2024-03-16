package Semester_2.PBO.Pertemuan3.Tugas3;

public class Enemy {
    String nama;
    int hp = 0;
    int def;
    int baseAtk = 46;
    Weapon weapon;
    int level = 1;

    Enemy (String nama, int hp, int def, int baseAtk, Weapon weapon, int level){
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

    void remedy(){
        this.hp += 100;
    }

    void display(){
        System.out.println("Nama : " + this.nama);
        System.out.println("Level : " + this.level);
        System.out.println("Health : " + this.hp + " hp");
        System.out.println("Deffense : " + this.def);
        System.out.println("Base attack : " + this.baseAtk);
        // System.out.println("Weapon : " + this.weapon.name);
    }
}
