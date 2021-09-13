package cn.tedu.design;

abstract public class ACTTeacher implements Teacher{
    @Override
    public void ready() {
        System.out.println("正在备课基础加强+框架加强技术");
    }
}
