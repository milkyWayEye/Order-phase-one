package cn.tedu.tread;
/*本类用于多线程编程实现方案一:继承Thread类来完成*/
public class TestThread1 {
    public static void main(String[] args) {
        //4.创建线程对象进行测试
        /*4.new对应的是线程的新建状态*/
        /*5.要想模拟多线程,至少得启动2个线程,如果只启动1个,是单线程程序*/
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        /*6.这个run()方法如果直接调用,是没有多线程抢占执行的效果的
        * 只是把这两句话看作普通方法的调用,谁先写,就先执行谁*/
        //t1.run();
        //t2.run();
        /*7.start()对应的状态就是就绪状态,会把刚刚新建好的线程加入到就绪队列之中
        * 至于什么时候执行,就是多线程执行的效果,需要等待OS选中分配CPU*/
        /*8.执行的时候Start()底层会自动调用我们重写的run()中的业务
        * 9.线程的执行具有随机性,也就是说t1-t2具体怎么执行
        * 取决于CPU的调度时间片的分配,我们是决定不了的*/
        t1.start();
        t2.start();
    }
}


//1.自定义一个多线程类,然后让这个类继承Thread
class MyThread extends Thread{
    /*1.多线程编程实现的方案1:通过继承Thread类并重写run()方法来完成的*/
    //2.重写run(),run()里是我们自己的业务
    @Override
    public void run() {
        /*2.super.run()表示的是调用父类的业务,我们现在要用自己的业务,所以注释掉*/
        //super.run();
        //3.完成业务:打印10次当前正在执行的线程的名称
        for (int i = 0; i < 10; i++) {
            /*3.getName()表示可以获取当前正在执行的线程名称
            * 由于本类继承了Thread类,所以可以直接使用这个方法*/
            System.out.println(i+"="+getName());
        }
    }
}