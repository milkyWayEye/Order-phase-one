package cn.tedu.review;
/*本类用于回顾多线程售票案例2*/
public class TestRunnableV2 {
    public static void main(String[] args) {
        //4.创建实现业务类也就是目标业务类对象
        TicketRunnable2 target = new TicketRunnable2();
        //5.创建Thread类的对象,并将业务对象交给Thread的构造方法
        //原因:接口与接口实现类都没有start(),所以创建的还是Thread
        Thread t1 = new Thread(target, "燕子");
        Thread t2 = new Thread(target, "鱼");
        Thread t3 = new Thread(target, "兔子");
        Thread t4 = new Thread(target, "猫");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

//1.创建接口实现类,作为目标业务类
class TicketRunnable2 implements Runnable {
    //3.1定义票数
    int tickets = 100;
    Object o = new Object();

    //2.添加父接口中未实现的抽象方法,里面是业务
    @Override
    public void run() {
        //3.2循环卖票
        while (true) {
            synchronized (o) {
                if (tickets > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("窗口" + Thread.currentThread().getName() + "在卖票" + tickets--);
                }
                if (tickets <= 0) break;
            }
        }
    }
}
