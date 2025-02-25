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

class FixedDeposit extends Account{
    double fixedAmount;

    public FixedDeposit(String name, String code, double balance, double money2) {
        super(name, code, balance);
        this.fixedAmount = money2;
        System.out.println("FixedDeposit account with " + this.fixedAmount);
    }
    @Override
    boolean deposit(double x){
        if(x >= fixedAmount){
            boolean b = super.deposit(x);
            if(b){
                return true;
            }
            else {
                return false;
            }
        }
        else {
            System.out.print("deposit less than " + fixedAmount + " ");
            return false;
        }
    }

    
    
}

class CurrentAccount extends Account{
    double overDraft;

    public CurrentAccount(String name, String code, double balance, double overDraft) {
        super(name, code, balance);
        this.overDraft = overDraft;
        System.out.println("Current account with overdraft " + overDraft);
    }
    @Override
    boolean withdrawn(double z){
        if(balance - z >= -overDraft && active){
            balance -= z;
            if(balance >= 0){
                System.out.print(balance + " ");
                return true;
            }
            else {
                System.out.print(balance + " overdraft ");
                return true;
            }
        }
        else {
            return false;
        }
    }
}

public class BankAccount3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Saving sAcc = null;
        FixedDeposit fAcc = null;
        CurrentAccount cAcc = null;
        for (int t = 1; t <= 3; t++) {
            String name = scan.nextLine();
            String code = scan.nextLine();
            double money1 = scan.nextDouble();
            if (t == 1) {
                scan.nextLine();
                sAcc = new Saving(name, code, money1);
            } else if (t == 2) {
                double money2 = scan.nextDouble();
                scan.nextLine(); //Skip the remainder of the double line.
                fAcc = new FixedDeposit(name, code, money1, money2);

            } else if (t == 3) {
                double money2 = scan.nextDouble();
                scan.nextLine(); // Skip the remainder of the double line.
                cAcc = new CurrentAccount(name, code, money1, money2);
            }
        }
        int N = scan.nextInt();
        for(int i = 0; i < N; ++i) {
            int q = scan.nextInt();
            int y = scan.nextInt();
            switch (y) {
                case 1:
                    if(q == 1){
                        sAcc.printInfo();
                    }
                    else if( q == 2){
                        fAcc.printInfo();
                    }
                    else {
                        cAcc.printInfo();
                    }
                    break;
            
                case 2:
                    if(q == 1){
                        double b = sAcc.checkBalance();
                        System.out.println(b);
                    }
                    else if( q == 2){
                        double b = fAcc.checkBalance();
                        System.out.println(b);
                    }
                    else {
                        double b = cAcc.checkBalance();
                        System.out.println(b);
                    }
                    break;
                case 3:
                    if(q == 1){
                        sAcc.closeAccount();
                    }
                    else if( q == 2){
                        fAcc.closeAccount();
                    }
                    else {
                        cAcc.closeAccount();
                    }
                    break;
                case 4:
                    if(q == 1){
                        double x = scan.nextDouble();
                        boolean a = sAcc.deposit(x);
                        System.out.println(a);
                    }
                    else if( q == 2){
                        double x = scan.nextDouble();
                        boolean a = fAcc.deposit(x);
                        System.out.println(a);
                    }
                    else {
                        double x = scan.nextDouble();
                        boolean a = cAcc.deposit(x);
                        System.out.println(a);
                    }
                    break;
                case 5:
                    if(q == 1){
                        double z = scan.nextDouble();
                        boolean c = sAcc.withdrawn(z);
                        System.out.println(c);
                    }
                    else if( q == 2){
                        double z = scan.nextDouble();
                        boolean c = fAcc.withdrawn(z);
                        System.out.println(c);
                    }
                    else {
                        double z = scan.nextDouble();
                        boolean c = cAcc.withdrawn(z);
                        System.out.println(c);
                    }
                    break;
            }
        }
    }
}