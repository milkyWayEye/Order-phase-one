package cn.tedu.inter;
/*本接口用于接口的入门案例1*/

/*1.我们通过interface关键字来定义接口*/
public interface Inter {
    void theThree();
    /*2.接口里可以有普通方法吗?不可以*/
    public void theOne();
    /*3.接口里可以有抽象方法吗?可以,接口中的方法都是抽象方法*/
    abstract public void theTwo();
}
