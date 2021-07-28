import java.util.Scanner;

public class 定义类 {
    int price = 20;     // 价格
    int balance = 0;    // 余额
    static int total;          // 总额

    void showPrompt() {
        System.out.println("Welcome");
    }

    // 将投入的币加入余额中
    void insertMommy(int amount) {
        balance += amount;
        System.out.println("收您:" + amount);
        showBalance();
        System.out.println("--------------");
    }

    // 查看余额数
    void showBalance() {
        System.out.println("余额：" + balance);
    }

    // 判断钱是否足够，足够后扣除钱数并结束程序
    // 如果钱不够继续调用投币类并传给收钱类
    void getFood() {
        boolean Price = true;
        while (Price)
            if (balance >= price) {
                System.out.println("哇！钱够了给你瓶大旺仔！！！");
                balance -= price;
                this.total += price;
                Price = false;
                System.out.println("总消费：" + this.total + " 余额：" + balance);
            } else {
                System.out.println("余额不够请继续投币");
                insertMommy(Coin());
            }
    }

    // 投币
    int Coin() {
        Scanner in = new Scanner(System.in);
        System.out.print("请投币：");
        return in.nextInt();
    }

    public static void main(String[] args) {
        定义类 VM = new 定义类();
        VM.showPrompt();
        VM.showBalance();
        System.out.print("请投币：");
        VM.insertMommy(VM.Coin());
        VM.getFood();

        定义类 VM1 = new 定义类();
        VM1.showPrompt();
        VM1.showBalance();
        System.out.print("请投币：");
        VM1.insertMommy(VM.Coin());
        VM1.getFood();
    }
}
