/*import java.util.Scanner;
class Account {
    String name;
    String code;
    double balance;
    boolean active;

    public Account(String name, String code, double balance) {
        this.name = name;
        this.code = code;
        this.balance = balance;
        this.active = true;
        System.out.println("Open account");
    }

    void printInfo(){
        System.out.print(name + ", " + code + ", " + balance + ", ");
        if(active){
            System.out.println("active");
        }
        else {
            System.out.println("inactive");
        }
    }

    double checkBalance(){
        return this.balance;
    }

    void closeAccount(){
        active = false;
        printInfo();
    }

    boolean deposit(double x){
        if(this.active){
            this.balance += x;
            System.out.print(this.balance + " ");
            return true;
        }
        else {
            return false;
        }
    }

    boolean withdrawn(double z){
        if(!this.active || this.balance - z < 0){
            return false;
        }
        else {
            this.balance -= z;
            System.out.print(this.balance + " ");
            return true;
        }
    }
}
public class BankAccount1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String code = scan.nextLine();
        double money = scan.nextDouble();
        Account accounts = new Account(name, code, money);
        int N = scan.nextInt();
        for(int i = 0; i < N; ++i) {
            int y = scan.nextInt();
            switch (y) {
                case 1:
                    accounts.printInfo();
                    break;
            
                case 2:
                    double b =accounts.checkBalance();
                    System.out.println(b);
                    break;
                case 3:
                    accounts.closeAccount();
                    break;
                case 4:
                    double x = scan.nextDouble();
                    boolean a = accounts.deposit(x);
                    System.out.println(a);
                    break;
                case 5:
                    double z = scan.nextDouble();
                    boolean c = accounts.withdrawn(z);
                    System.out.println(c);
                break;
            }
        }
    }
}*/