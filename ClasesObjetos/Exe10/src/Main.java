class bankaccount {
    String holder;
    float balance;

    void setAccount (String holder, float balance){
        this.holder = holder;
        this.balance = balance;
    }

    void deposit (float money){
        this.balance += money;

    }

    void withdraw (float money){
        this.balance -= money;
    }

    float getBalance () {
        return balance;
    }

}

public class Main {
    public static void main(String[] args) {
        bankaccount holder1 = new bankaccount();
        holder1.setAccount("Kiko Rivera", 230500.54f);
        holder1.deposit(9543.98f);
        holder1.withdraw(100000);

    }
}