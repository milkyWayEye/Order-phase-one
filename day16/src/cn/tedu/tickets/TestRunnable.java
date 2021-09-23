package cn.tedu.tickets;

/*1.多线程中出现数据安全问题的原因:多线程+有共享数据+多条语句操作共享数据
* 2.同步锁:相当于给容易出现问题的代码加了一把锁,加锁以后,这些代码实现同步效果
* 同步就是排队,需要考虑两个问题:
* 1)加锁的范围:不能太大,太大,效率太低;也不能太小,太小,锁不住
* 2)多个线程对象必须是同一把锁,锁对象只有一个,不然锁不住*/
public class TestRunnable {
    public static void main(String[] args) {
        TicketsRunnable t = new TicketsRunnable();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);
        Thread t4 = new Thread(t);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

class TicketsRunnable implements  Runnable{
    int tickets = 10;
    Object o = new Object();
    @Override
    public void run() {
            while(true) {
                synchronized (o) {
                    if (tickets<=0) break;
                    System.out.println(Thread.currentThread().getName()+"="+tickets--);
                }
            }
    }
}