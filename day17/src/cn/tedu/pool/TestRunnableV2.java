package cn.tedu.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*多线程编程实现方案三:线程池的方式*/
public class TestRunnableV2 {
    public static void main(String[] args) {
        //4.创建实现业务类也就是目标业务类对象
        TicketRunnable2 target = new TicketRunnable2();
        //创建线程池
        /*Executors是用来辅助创建线程池的工具类
        * 常用的方法是:newFixedThreadPool(int)这个方法可以帮我们创建指定数目的线程池*/
        //使用Excutors工具创建一个最多包含5个线程的线程池
        ExecutorService pool = Executors.newFixedThreadPool(5);
        //使用循环启动线程
        for (int i = 0; i < 5; i++) {
            /*execute()让线程池中的线程来执行业务,每次调用这个方法,都会将一个线程加到就绪队列中
            * 这个方法的参数,就是我们要执行的具体业务,也就是目标业务类对象target */
            pool.execute(target);
        }
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
