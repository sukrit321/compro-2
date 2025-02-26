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


}
public class AoSU2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Hero[] members = null;
        if(N > 0) {
            members = new Hero[N];
            for(int i = 0; i < N; ++i) {
                String name = scan.next();
                int hp = scan.nextInt();
                int attkType = scan.nextInt();
                int attkDmg = scan.nextInt();
                int phyDef = scan.nextInt();
                int magDef = scan.nextInt();
            members[i] = new Hero(name, hp, attkType, attkDmg, phyDef, magDef);
            }
        }
        Team t = new Team(members);
        System.out.println(t.is5MemberTeam(members));
        System.out.println(t.isValid(members));
    }
}