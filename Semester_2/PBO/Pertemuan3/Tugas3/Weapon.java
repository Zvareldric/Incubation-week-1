package Semester_2.PBO.Pertemuan3.Tugas3;

import java.util.Random;

public class Weapon {
    int atk;
    String name;
    boolean isBroken;
    int condition = 100;

    Weapon(String nama, int atkPower){
        this.name = nama;
        this.atk = atkPower;
    }

    void repair(){
        this.condition = 100;
    }

    int use(){
        if (this.condition > 0) {
            this.condition -= 10;
            return this.atk;
        } else {
            System.out.println("Senjata rusak, tidak bisa digunakan.");
            return 0;
        }
    }

    static int randomAtk(Weapon w) {
        Random r = new Random();
        int maksimal = (int)(0.3 * w.atk); // 30% dari atk
        int minimal = (int)(0.1 * w.atk); // 10% dari atk
        return r.nextInt(maksimal - minimal + 1) + minimal;
    }

    void display(){
        System.out.printf("Weapon : %s\nPower : %d\n", this.name, this.atk);
        System.out.println("Kondisi : " + this.condition);
        System.out.println("Rusak : " + this.isBroken);
    }
}

