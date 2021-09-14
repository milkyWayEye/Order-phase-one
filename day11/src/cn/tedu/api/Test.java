package cn.tedu.api;
/*方法的重载中,如果同名方法的参数列表中分别为子类和父类,
* 那么调用时填了一个子类参数会匹配有子类的,参数列表只有父类的时候填子类参数也匹配父类参数方法*/
public class Test {
    public static void main(String[] args) {
        Father ss = new Son();
        Son s = (Son) ss;
        sout(s);
        sout(new Son());
    }
    public static void sout(Father f) {
        System.out.println("bb");
    }
//    public static void sout(Son s) {
//        System.out.println("ez");
//    }
}

class Father {

}

class Son extends Father{

}