package cn.tedu.inter;
/*本类用作接口的实现类*/
/*1.我们通过implements建立实现类与接口的实现关系*/
/*2.实现类与接口建立了实现关系后,有两种方案:
* 方案一:不实现/实现部分 接口中的抽象方法,作为抽象子类,躺平
* //abstract class InterImpl implements Inter {}
* 方案二:实现父接口中的所有的抽象方法,作为普通子类,父债子还*/
public class InterImpl implements Inter{
    @Override
    public void theThree() {

    }

    @Override
    public void theOne() {
        System.out.println("下雨天和火锅更配~");
    }

    @Override
    public void theTwo() {
        System.out.println("玩啥玩,我爱敲代码~");
    }
}
