package cn.tedu.oop2;
/*本类用于this的第二个功能测试*/
public class TestThis2 {
    public static void main(String[] args) {
        Apple a = new Apple();
        //a.clean();
        //Apple a1 = new Apple("红富士");
    }
}

class Apple {
    public Apple() {
        /*2.this(参数);表示在本构造方法中调用本类的对应参数的构造方法*/
        /*3.this调用构造方法的语句,不能来回互相调用,会死循环,只能选一个执行
        * 4.this调用构造方法的语句,必须在构造方法的第一行*/
        this("青苹果");
        System.out.println("无参构造");
    }
    public Apple(String s) {
        /*1.this();表示在本构造方法中调用本类的无参构造*/
        //this();
        System.out.println("含参构造");
    }

    public void clean() {

    }
}