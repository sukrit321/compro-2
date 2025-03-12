import java.util.Scanner; 

class GameCharacter{
    String name;
    int attack;
    int defense;
    int level;
    
    void stat(){
        System.out.println(name + " " + level + " " + attack + " " + defense);
    }
}
class Hero extends GameCharacter{
    Hero(String name){ 
        this.name = name;
        this.level = 1;
        this.attack = 10;
        this.defense = 5;

    }
    void hit(Monster x){
        int uplevel = x.score / 100;
        this.level += uplevel;
        this.attack += 3*uplevel;
        this.defense += 2 *  uplevel;
    }
}
class Monster extends GameCharacter{
    int score;
    Monster(String name, int level, int score){
        this.name = name;
        this.level = level;
        this.score = score;
        this.attack = 2 * level;
        this.defense = 3 * level;
    }
}
public class RolePlayingGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int M = scan.nextInt();
        Hero[] heroes = new Hero[M];
        for(int i=0;i<M;i++){
            String name = scan.next();
            heroes[i] = new Hero(name);
        }
        int N = scan.nextInt();
        Monster[] monster = new Monster[N];
        boolean[] alive = new boolean[N];
        for(int i=0;i<N;i++){
                int level = scan.nextInt();
                int score = scan.nextInt();
                monster[i] = new Monster(Integer.toString(i+1), level , score);
        }
        int K = scan.nextInt(); //รับจำนวนคำสั่ง
        for(int i=0;i<K;i++){ //วนรับคำสั่งเพื่อดำเนินการ
            int iHero = scan.nextInt()-1;
            int iMonster = scan.nextInt()-1;
            if (!alive[iMonster]){
                heroes[iHero].hit(monster[iMonster]); //ฮีโรตัวที่ iHero ตี สัตว์ประหลาดตัวที่ iMonster รู้มาจากคำสั่ง
                alive[iMonster] = !alive[iMonster];
            }
        }
        for(int i=0;i<M;i++){
            heroes[i].stat();; //เรียกเมธอดเพื่อแสดงข้อมูล
        }
    }
}

