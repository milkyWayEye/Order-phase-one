package cn.tedu.oop2;
/*完成设计老师类,使用面向抽象编程的思想*/
public class DesignTeach {
    public static void main(String[] args) {

    }
}

abstract class Teacher {
    public abstract void ready();
    public abstract void teach();
}

/*培优班CGB -- 主打互联网架构与微服务体系*/
class CGBTeacher extends Teacher {

    @Override
    public void ready() {

    }

    @Override
    public void teach() {

    }
}

class ACTTeacher extends Teacher {
    @Override
    public void ready() {

    }

    @Override
    public void teach() {

    }
}

class SCDTeacher extends Teacher {

    @Override
    public void ready() {

    }

    @Override
    public void teach() {

    }
}
