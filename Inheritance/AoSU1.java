import java.util.Scanner;
class Hero {
    String name;
    int hp;
    int attkType;
    int attkDmg;
    int phyDef;
    int magDef;
    public Hero(String name, int hp, int attkType, int attkDmg, int phyDef, int magDef) {
        this.name = name;
        this.hp = hp;
        this.attkType = attkType;
        this.attkDmg = attkDmg;
        this.phyDef = phyDef;
        this.magDef = magDef;
        checkAndWarn();
    }

    boolean checkAndWarn(){
        if (hp >= 0 && attkType >= 0 && attkDmg >= 0 && phyDef >= 0 && magDef >= 0){
            return true;
        }
        else {
            System.out.println("warning: value cannot be negative");
            return false;
        }
    }

    void printInfo(){
        System.out.println("Name: " + name);
        System.out.println("HP: " + hp);
        if(attkType == 1){
            System.out.println("Attack: " + attkDmg + " (physical)");
        }
        else {
            System.out.println("Attack: " + attkDmg + " (magical)");
        }
        System.out.println("Defense: " + phyDef + " (physical), " + magDef + " (magical)");
        checkAndWarn();
    }

}
public class AoSU1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        int hp = scan.nextInt();
        int attkType = scan.nextInt();
        int attkDmg = scan.nextInt();
        int phyDef = scan.nextInt();
        int magDef = scan.nextInt();

        Hero hero = new Hero(name, hp, attkType,attkDmg, phyDef, magDef);
        hero.printInfo();
        System.out.println(hero.checkAndWarn());
    }
}
