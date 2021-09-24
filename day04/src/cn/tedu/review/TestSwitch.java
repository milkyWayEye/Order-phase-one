package cn.tedu.review;

import java.util.Scanner;

/**本类用于练习选择结构*/
public class TestSwitch {
    public static void main(String[] args) {
        System.out.println("请输入您的令牌号:");
        String s = new Scanner(System.in).nextLine();

        switch (s) {
            case "天" :
                System.out.println("请玩家进入天字一号房间");break;
            case "地" :
                System.out.println("请玩家进入地字一号房间");break;
            case "玄" :
                System.out.println("请玩家进入玄字一号房间");break;
            case "黄" :
                System.out.println("请玩家进入黄字一号房间");break;
            default:
                System.out.println("哪里来的混子,乱棍打出去");
        }
    }
}
