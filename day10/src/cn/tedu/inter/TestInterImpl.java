package cn.tedu.inter;

/*本类用作接口实现类的测试类*/
public class TestInterImpl {
    public static void main(String[] args) {
        /*接口可以创建对象吗?不可以*/

        Inter i = new InterImpl();
        i.theOne();
        i.theTwo();

        InterImpl i2 = new InterImpl();
        i2.theOne();
        i2.theTwo();
    }
}
