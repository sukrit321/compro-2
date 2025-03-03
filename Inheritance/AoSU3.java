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

class Team {
    Hero[] members;

    Team(Hero[] members){
        if(!is5MemberTeam(members)){
            return;
        }
        if(isValid(members)){
            isBalanced(members);
            this.members = members;
        }
    }

    boolean is5MemberTeam(Hero[] members){
        if(members != null && members.length == 5){
            System.out.println("full team");
            return true;
        }
        else if(members != null && members.length > 5){
            System.out.println("too many members");
            return false;
        }
        else {
            System.out.println("member is missing");
            // x = false;
            return false;
        }
    }

    boolean isValid(Hero[] members){
        
        if (members == null || members.length < 5 || members.length > 5) {
            return false;
        }
        else {
            boolean b = false;
            String n = "";
            for(int i = 0 ; i < members.length; i++){
                for(int j = i + 1; j < members.length; j++){
                    if(members[i].name.equals(members[j].name)){
                        b = true;
                        n = members[i].name;
                        System.out.println("cannot select same hero: " + n);
                        return false;
                    }
                }
            }
            System.out.println("valid hero selection");
            return true;
        }
    }

    boolean isBalanced(Hero[] members){
        if (members == null || members.length < 5 || members.length > 5) {
            return false;
        }
        for(int i = 0; i < members.length; i++){
            if(members[i] instanceof Carry){
                
            }
        }
    }

}

class Carry extends Hero{
    Carry(String name, int hp, int attkType, int attkDmg, int phyDef, int magDef){
        super(name, hp, attkType, attkDmg, phyDef, magDef);
    }
}

class Fighter extends Hero{
    Fighter(String name, int hp, int attkType, int attkDmg, int phyDef, int magDef){
        super(name, hp, attkType, attkDmg, phyDef, magDef);
    }
}

class Mage extends Hero{
    Mage(String name, int hp, int attkType, int attkDmg, int phyDef, int magDef){
        super(name, hp, attkType, attkDmg, phyDef, magDef);
    }
}

class Tank extends Hero{
    Tank(String name, int hp, int attkType, int attkDmg, int phyDef, int magDef){
        super(name, hp, attkType, attkDmg, phyDef, magDef);
    }
}

class Support extends Hero{
    Support(String name, int hp, int attkType, int attkDmg, int phyDef, int magDef){
        super(name, hp, attkType, attkDmg, phyDef, magDef);
    }
}

class Assassin extends Hero{
    Assassin(String name, int hp, int attkType, int attkDmg, int phyDef, int magDef){
        super(name, hp, attkType, attkDmg, phyDef, magDef);
    }
}

public class AoSU3 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    Hero[] members = null;
    if(N > 0) {
        members = new Hero[N];
        for(int i = 0; i < N; ++i) {
            int type = scan.nextInt();
            String name = scan.next();
            int hp = scan.nextInt();
            int attkType = scan.nextInt();
            int attkDmg = scan.nextInt();
            int phyDef = scan.nextInt();
            int magDef = scan.nextInt();
            if(type == 1){
                members[i] = new Carry(name, hp, attkType, attkDmg, phyDef, magDef);
            }
            else if(type == 2){
                members[i] = new Fighter(name, hp, attkType, attkDmg, phyDef, magDef);
            }
            else if(type == 3){
                members[i] = new Mage(name, hp, attkType, attkDmg, phyDef, magDef);
            }
            else if(type == 4){
                members[i] = new Tank(name, hp, attkType, attkDmg, phyDef, magDef);
            }
            else if(type == 5){
                members[i] = new Support(name, hp, attkType, attkDmg, phyDef, magDef);
            }
            else {
                members[i] = new Assassin(name, hp, attkType, attkDmg, phyDef, magDef);
            }
        }
    }
    Team t = new Team(members);
    System.out.println(t.is5MemberTeam(members));
    System.out.println(t.isValid(members));
    System.out.println(t.isBalanced(members));
    }
}
   