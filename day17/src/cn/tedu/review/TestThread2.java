package cn.tedu.review;

/*本类用于回顾多线程售票案例*/
public class TestThread2 {
    public static void main(String[] args) {
        //4.创建多个自定义线程类对象
        TicketThread2 t1 = new TicketThread2("小明");
        TicketThread2 t2 = new TicketThread2("小红");
        TicketThread2 t3 = new TicketThread2("小张");
        TicketThread2 t4 = new TicketThread2("大黄");
        //5.调用start()将线程加入就绪队列
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

//1.自定义多线程类,用来售票
class TicketThread2 extends Thread {
    //3.1定义票数
    //6.票数会出现售卖400张的情况,需要设置为静态
    static int tickets = 100;

    //2.添加一个构造函数给线程命名


    public TicketThread2(String name) {
        super(name);
    }

    //2.添加重写后的run(),里面是业务
    @Override
    public void run() {
        //super.run();
        //3.2循环卖票
        while (true) {

            synchronized (TicketThread2.class) {
                if (tickets <= 0) break;
                try {
                    sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                /*重卖产生在拿票后,超卖产生在拿票前*/
                System.out.println("现在卖票的是" + getName() + "窗口" + tickets--);
            }
        }
    }
}