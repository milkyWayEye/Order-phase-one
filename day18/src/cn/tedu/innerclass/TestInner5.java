package cn.tedu.innerclass;
/*本类用于测试匿名内部类
* 匿名内部类没有名字,通常与匿名对象结合在一起使用*/
public class TestInner5 {
    public static void main(String[] args) {
        //传统方式:创建接口的实现类+实现类实现接口中的抽象方法+创建实现类对象+通过对象调用方法
        //3.创建接口对应的匿名对象与匿名内部类,并调用实现了的方法save()
        new Inter1() {

            @Override
            public void save() {

            }

            @Override
            public void get() {

            }

            @Override
            public void eat() {

            }
        }.eat1();

        //5.创建抽象类对应的匿名对象与匿名内部类
        new Inter2(){

            @Override
            public void drink() {
                System.out.println("一人饮酒醉");
            }
        }.drink();
        new Inter3() {
            public void dd() {
                System.out.println("dd");
            }
        }.dd();
    }
    /*如果想要多次使用实现后的功能,还是要创建普通的对象
    * 匿名对象只能使用一次,一次只能调用一个功能
    * 匿名内部类其实就充当了实现类的角色,去实现未实现的抽象方法,只是没有名字而已*/
}

//1.创建接口
interface Inter1{
    //2.定义接口中的抽象方法
    void save();
    void get();
    void eat();
    default void eat1() {
        System.out.println("你好~");
    }
    default void eat2() {
        System.out.println("你很好");
    }
}

//4.创建抽象类
abstract class Inter2{
    public void play(){
        System.out.println("Inner2...play()");
    }
    abstract public void drink();
}

class Inter3{
    public void study(){
        System.out.println("什么都阻挡不了我想学习赚钱的决心");
    }
    public void powerUp(){
        System.out.println("我们会越来越强~");
    }
}