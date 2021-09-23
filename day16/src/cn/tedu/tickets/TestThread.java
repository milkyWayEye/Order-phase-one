package cn.tedu.tickets;
/*需求:设计多线程编程模型,4个窗口共计售票100张
* 本方案使用多线程编程方案1,继承Thread类的方式来完成*/
public class TestThread {
    public static void main(String[] args) {
        TicketThread t1 = new TicketThread();
        TicketThread t2 = new TicketThread();
        TicketThread t3 = new TicketThread();
        TicketThread t4 = new TicketThread();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

class TicketThread extends Thread{
    /*问题:4个线程对象共计售票400张,原因是创建了4次对象,各自操作各自的成员变量
    * 解决:让所有对象共享同一个数据,票数需要设置为静态*/
    static int tickets = 10;
    @Override
    public void run() {
        //3.定义变量,保存要售卖的票数
        //super.run();
        while (tickets>0){
            try {
                //7.让每个线程经历休眠,增加线程状态切换的频率与出错的概率
                //问题1:产生了重卖的现象:同一张票卖了多人
                //问题2:产生了超卖的现象:超出了规定的票数100,出现了0 -1 -2这样的票
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (TicketThread.class) {
                tickets--;
                if (tickets<0) break;
                System.out.println(getName()+"卖掉第"+(10-tickets)+"张票");
            }
        }
    }
}