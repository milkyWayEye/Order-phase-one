package cn.tedu.design;
/*本类用于实现单例设计摸式优化实现方案2:懒汉式*/
/*关于单例设计模式的两种实现方式:
* 1.饿汉式:不管你用不用这个类的对象,都会直接先创建一个
* 2.懒汉式:先不给创建这个类的对象,等你需要的时候再创建--延迟加载的思想
* 延迟加载的思想:是指不会在第一时间就把对象创建好加载内存
*               而是什么时候用到,什么时候再去创建对象*/
/*3.线程安全问题:由于我们存在唯一的对象single2,并且多条语句都操作了这个变量
*   如果将程序放到多线程的环境下,就容易出现数据安全的问题,所以解决方案:
*   1)将3条语句都是用同步代码块包裹,保证同步排队的效果
*   2)由于getSingle2()只有这3条语句,所以也可以将本方法设置为静态方法
* */
public class Singleton2 {
    public static void main(String[] args) {
        MySingle2 single1 = MySingle2.getMySingle2();
        MySingle2 single2 = MySingle2.getMySingle2();
        System.out.println(single1);
        System.out.println(single2);
    }
}

class MySingle2{
    private MySingle2() {}

    private static MySingle2 mySingle2;

    private static Object o = new Object();
    public static MySingle2 getMySingle2() {
        //判断之前是否创建过对象,之前创建过就直接走return
        //之前没有创建过,才走if,创建对象并将对象返回
        //6.有共享数据＋多条语句操作数据,所以尽量提前处理,避免多线程数据安全隐患
        //解决方案1:加同步代码块
        //解决方法2:将本方法getSingle2()设置为同步方法
        //因为这个方法里所有的语句都需要同步
        synchronized (o){//静态方法中使用的锁对象也得是静态的
            if (mySingle2==null) {
                mySingle2=new MySingle2();
                System.out.println("创建一个");
            }else {
                System.out.println("已存在");
            }
            return mySingle2;
        }
    }
}