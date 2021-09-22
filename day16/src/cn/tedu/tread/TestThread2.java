package cn.tedu.tread;
/*本类用于多线程编程实现方法二:实现Runnable接口来完成*/
public class TestThread2 {
    public static void main(String[] args) {
        MyRunnable target = new MyRunnable();
        //5.1如何启动线程?自己没有,需要与Thread建立关系
        Thread t1 = new Thread(target);
        Thread t2 = new Thread(target);
        Thread t3 = new Thread(target);
        Thread t4 = new Thread(target);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

//1.自定义多线程类
class MyRunnable implements Runnable{
    //添加父接口中的抽象方法run(),里面是自己的业务
    @Override
    public void run() {
        //3.写业务,打印10次当前正在执行的线程名称
        for (int i = 0; i < 10; i++) {
            /*问题:自定义类与父接口Runnable中都没有获取名字的方法
            * 所以还需要从Thread中找:
            * currenThread():静态方法,获取当前正在执行的线程对象
            * getName()获取当前线程的名字*/
            System.out.println(i+"="+Thread.currentThread().getName());
        }
    }
}
