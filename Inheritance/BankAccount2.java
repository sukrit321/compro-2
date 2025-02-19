import java.util.Scanner;
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
class Saving extends Account{
    String id;
    String tel;
    boolean promptPay;

    public Saving(String name, String code, double balance) {
        super(name, code, balance);
        this.promptPay = false;
        System.out.println("Saving account");
    }
    
    @Override
    void printInfo() {
        super.printInfo();
        if(promptPay){
            System.out.print("PromptPay");
            if(id != null){
                System.out.print(", " + id);
            }
            if(tel != null){
                System.out.print(", " + tel);
            }
            System.out.println();
        }
        else {
            System.out.println("no PromptPay");
        }
    }

    boolean openPromptPay(int k, String text){
        if(k == 1){
            if(text.length() == 13){
                this.promptPay = true;
                this.id = text;
            }
            else {
                return false;
            }
        }
        else {
            if(text.length() == 10){
                this.promptPay = true;
                this.tel = text;
            }
            else {
                return false;
            }
        }
        return this.promptPay;
    }

}

public class BankAccount2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String code = scan.nextLine();
        double money = scan.nextDouble();
        Saving savings = new Saving(name, code, money);
        int N = scan.nextInt();
        for(int i = 0; i < N; ++i) {
            int y = scan.nextInt();
            switch (y) {
                case 1:
                    savings.printInfo();
                    break;
            
                case 2:
                    double b =savings.checkBalance();
                    System.out.println(b);
                    break;
                case 3:
                    savings.closeAccount();
                    break;
                case 4:
                    double x = scan.nextDouble();
                    boolean a = savings.deposit(x);
                    System.out.println(a);
                    break;
                case 5:
                    double z = scan.nextDouble();
                    boolean c = savings.withdrawn(z);
                    System.out.println(c);
                break;
                case 6:
                    int k = scan.nextInt();
                    String text = scan.next();
                    boolean m = savings.openPromptPay(k, text);
                    System.out.println(m);
            }
        }
    }
}