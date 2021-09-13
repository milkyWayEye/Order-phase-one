package cn.tedu.review;
/*本类用于复习抽象类与抽象方法*/
public class TestAbstract {
}

abstract class Teacher{
    public abstract void ready();
    public abstract void teach();
}

class CGBTeacher extends Teacher{

    @Override
    public void ready() {
        System.out.println("正在备课互联网架构与微服务全家桶");
    }

    @Override
    public void teach() {
        System.out.println("正在讲课互联网架构与微服务全家桶");
    }
}

class ACTTeacher extends Teacher {

    @Override
    public void ready() {
        System.out.println("正在备课基础加强与框架加强");
    }

    @Override
    public void teach() {
        System.out.println("正在授课基础加强与框架加强");
    }
}

abstract  class SCDTeacher extends Teacher{
    @Override
    public void ready() {
        System.out.println("正在备课大数据");
    }
}