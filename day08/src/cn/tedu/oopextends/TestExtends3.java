package cn.tedu.oopextends;

public class TestExtends3 {
    public static void main(String[] args) {
        Son3 s = new Son3();
        s.eat();
        s.play();
        s.studyJava();
    }
}

class Father3 {
    public void eat() {
        System.out.println("爸爸爱吃肉");
    }
    public void play() {
        System.out.println("爸爸爱放风筝");
    }
}

class Son3 extends Father3 {
    public void studyJava() {
        System.out.println("别闹,学Java呢~");
    }
    /*重写:子类对父类的方法不满意,可以重写父类的方法
    * 重写的语法规则:两同 两小 一大
    * 一大:子类方法的修饰符权限>=父类方法的修饰符权限
    * 两同:方法名相同,参数列表相同
    * 两小:子类方法的返回值类型<=父类方法的返回值类型
    * 子类方法抛出的异常类型<=父类方法抛出的异常类型
    * 注意1:如果父类方法的返回值类型为void,那子类方法的返回值类型也是void
    * 注意2:我们这里说的返回值类型的大小,不是值的大小,而是继承关系*/
    @Override/*这个注解类似于一个标签,用来标记这是一个重写的方法*/
    public void play() {

    }
}
