package Multithreading.ThreadSecurityIssues_4;

public class withdrawIssue{
    public static void main(String[] args){

    Account account = new Account(100, "Travel fund");
    withdraw withdraw = new withdraw(account, 50, "you");
    Thread you = new Thread(withdraw);
    withdraw withdraw1 = new withdraw(account,100,"wife");
    Thread wife = new Thread(withdraw1);

    you.start();
    wife.start();
    }
}

// 账户
class Account{
    private int money;
    private String name;

    public Account(int money, String name){
        this.money = money;
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// 银行
class withdraw implements Runnable{

    private Account account;
    private int drawingMoney;
    private int nowMoney;

    public withdraw(Account account, int drawingMoney, String name){
        Thread.currentThread().setName(name);
//        super(name);
        this.account = account;
        this.drawingMoney = drawingMoney;
    }


    // withdraw
    // synchronized 默认锁的是 this 对象，而此处的 this 指的是 withdraw，而不是需要操作的Account
    @Override
    public void run() {
        synchronized (account){
            if (account.getMoney() - drawingMoney < 0){
                System.out.println(Thread.currentThread().getName() + "The money is not enough!");
                return;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // 取钱
            show();

            // 余额
            System.out.println(account.getName() + "'s Balance is " + account.getMoney());
            // 手里现在钱的总数
            System.out.println(Thread.currentThread().getName() + " have "+ nowMoney + " now!");
        }

    }

    private void show(){
        account.setMoney(account.getMoney() - drawingMoney );
        nowMoney += drawingMoney;
    }


    public int getDrawingMoney() {
        return drawingMoney;
    }

    public void setDrawingMoney(int drawingMoney) {
        this.drawingMoney = drawingMoney;
    }

    public int getNowMoney() {
        return nowMoney;
    }

    public void setNowMoney(int nowMoney) {
        this.nowMoney = nowMoney;
    }
}