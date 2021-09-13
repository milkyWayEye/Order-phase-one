package cn.tedu.inner2;
/*本类用作接口2的实现类*/
public class Inter2Impl implements Inter2{
    public Inter2Impl() {
        /*如果一个类没有明确指定自己的父类,那么这个类默认继承顶级父类Object
        * 所以,虽然接口中没有构造方法,但是不影响实现类构造函数中的super()
        * 因为这个构造方法是Object的,与接口无关*/
    }

    /*如果接口中添加了抽象方法,那么实现类中需要实现所有未实现的抽象方法*/
    @Override
    public void ss() {

    }

    @Override
    public void play() {

    }

    @Override
    public void eat() {

    }
}
