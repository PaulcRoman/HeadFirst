package cap15;

public class BankAccount {
    private int balance = 100;

    public int getBalance(){
        return balance;
    }

    public void withdraw(int amount){
        balance = balance - amount;
    }
}

class RyanAndMonicajob implements Runnable {
    private BankAccount account = new BankAccount();

    public static void main(String[] args) {
        RyanAndMonicajob theJob = new RyanAndMonicajob();
        Thread one = new Thread(theJob);
        Thread two = new Thread(theJob);
        one.setName("Ryan");
        two.setName("Monica");
        one.start();
        two.start();
    }

    public void run() {
        for (int i = 0; i<10; i++){
            makeWithdrawal(10);
            if (account.getBalance()<0){
                System.out.println("Overdrawn!");
            }
        }
    }

    private synchronized void makeWithdrawal(int amount) {
        if (account.getBalance() >= amount) {
            System.out.println(Thread.currentThread().getName()+ " is about to withdraw.");
            try {
                System.out.println(Thread.currentThread().getName()+ " is going to sleep.");
                Thread.sleep(500);
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " woke up.");
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName()+" complete the withdrawal.");
        }else {
            System.out.println("Sorry, not enough funds for "+ Thread.currentThread().getName());
        }
    }
}
