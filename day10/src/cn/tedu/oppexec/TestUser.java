package cn.tedu.oppexec;
/*本类用于测试封装的必要性*/
public class TestUser {
    public static void main(String[] args) {
        User u = new User();
        u.name = "西门庆";
        u.setMoney(99999);
        System.out.println(u.queryMoney());
    }
}

//创建一个用户类
class User{
    public String name;
    private double money = 10000;

    public double queryMoney(){
        /*后续可以添加权限的校验*/
        return money;
    }

    public void setMoney(double money) {
        /*后续可以添加权限的校验*/
        this.money = money;
    }
}
