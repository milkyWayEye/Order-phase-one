package cn.tedu.inner2;

/*本类用于测试接口与类之间的复杂关系*/
public class TestRelation {
    public static void main(String[] args) {
        Inter3Impl i = new Inter3Impl();
        i.save();
        i.delete();
        i.update();
        i.find();
    }
}

interface Inter1 {
    void save();
    void delete();
}

interface Inter22 {
    void update();
    void find();
}

class inter1Impl implements Inter1 {

    @Override
    public void save() {

    }

    @Override
    public void delete() {

    }
}

//创建接口3,同时继承两个接口
/*接口可以继承接口,并且可以多继承,多个接口之间用逗号隔开*/
interface Inter3 extends Inter1,Inter22{

}

//创建接口3的实现类
/*接口与实现类是实现的关系,并且可以多实现,多个接口之间用逗号隔开
* 对于Java中的类而言,遵循:单继承 多实现
* 一个类只能有一个父类,但是一个类可以实现多个接口*/
class Inter3Impl implements Inter3 {

    @Override
    public void save() {
        System.out.println("稍等...正在努力保存中...");
    }

    @Override
    public void delete() {
        System.out.println("删除成功");
    }

    @Override
    public void update() {
        System.out.println("小二正在马不停蹄的更新");
    }

    @Override
    public void find() {
        System.out.println("客官,马上就查询好啦,稍等一丢丢~");
    }
}