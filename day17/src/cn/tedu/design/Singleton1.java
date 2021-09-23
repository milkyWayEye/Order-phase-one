package cn.tedu.design;
/*本类用于实现单例设计模式实现方案1:饿汉式*/
public class Singleton1 {
    public static void main(String[] args) {
        //在main()中,不通过对象,直接通过类名,调用静态方法
        MySingle single1 = MySingle.getSingle();
        MySingle single2 = MySingle.getSingle();

        System.out.println(single1==single2);
        System.out.println(single1);
        System.out.println(single2);
    }
}
//0.创建自己的单例程序
class MySingle{
    //1.提供构造方法,并将构造方法私有化
    /*构造方法私有化的目的:为了防止外界随意创建本类对象*/
    private MySingle(){}

    //2.创建本类的对象,并将对象也私有化
    //4.2由于静态资源只能调用静态资源,所以single对象也需要设置成静态
    private static MySingle single = new MySingle();

    //3.提供公共的访问方式,返回创建好的对象
    //4.1为了不通过对象,直接调用本方法,需要将本方法设置为静态
    public static MySingle getSingle() {
        return single;
    }
}