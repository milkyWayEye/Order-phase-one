package cn.tedu.design;

public class CGBTeacher implements Teacher{

    @Override
    public void ready() {
        System.out.println("正在备课互联网架构+微服务全家桶技术");
    }

    @Override
    public void teach() {
        System.out.println("正在授课互联网架构+微服务全家桶技术");
    }
}
