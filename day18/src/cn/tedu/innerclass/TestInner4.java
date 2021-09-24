package cn.tedu.innerclass;
/*本类用于测试局部内部类*/
public class TestInner4 {
    public static void main(String[] args) {
        //5.创建外部类的对象,调用外部类的show()
        new Outer4().show();
        /*如何使用局部内部类的资源呢?
        * 创建外部类对象调用外部类或者直接在main()创建内部类对象都是不可行的
        * 需要在外部类中创建内部类的对象,并且调用内部类的方法,才会触发内部类的功能*/
    }
}

//1.创建外部类
class Outer4{
    //2.创建外部类的成员方法
    public void show(){
        System.out.println("Outer...show()");
        /*局部内部类的位置:在方法里*/
        //3.创建局部内部类
        class Inner4{
            //4.创建局部内部类的资源
            String name;
            int age;
            public void eat(){
                System.out.println("Inner4...eat()");
            }
        }

        /*如何使用局部内部类的资源?*/
        //6.在show()里创建内部类对象,调用内部类的功能
        new Inner4().eat();
    }
}
