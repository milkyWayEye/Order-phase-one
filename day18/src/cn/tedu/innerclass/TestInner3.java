package cn.tedu.innerclass;
/*本类用于测试成员内部类被static修饰*/
public class TestInner3 {
    public static void main(String[] args) {
//        //4.创建内部类对象访问内部类资源 方式一
//        Outer3.Inner3 oi = new Outer3().new Inner3();
//        oi.show();
//        //4.2创建内部类匿名对象访问内部类资源 方式二
//        new Outer3().new Inner3().show();
        /*现象:当内部类被static修饰以后,new Outer3()报错,注释掉上面的代码*/
        //6.1由于内部类是静态的,所以可以通过外部类类名直接找到,不用额外创建外部类对象
        Outer3.Inner3 oi = new Outer3.Inner3();
        oi.show();
        Outer3.Inner3.show2();
        //6.2方式二:创建匿名静态成员内部类对象
        new Outer3.Inner3().show();

        //8.1调用内部类的静态方法,方式一:不推荐
        new Outer3.Inner3().show2();
        //8.2调用内部类的静态方法,方式二:推荐
        /*没有创建任何一个对象,直接都是通过类名找到的静态资源
        * 像这样连着点的方式,称作:链式加载*/
        Outer3.Inner3.show2();
    }
}

//1.创建外部类
class Outer3{
    //2.创建成员内部类
    //5.用static修饰成员内部类
    static class Inner3{
        //3.1定义成员内部类的普通方法
        public void show(){
            System.out.println("Inner3...show()");
        }
        //7.创建一个静态成员内部类中的静态方法
        public static void show2(){
            System.out.println("Inner3...show2()");
        }
    }
}
