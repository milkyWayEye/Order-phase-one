package cn.tedu.api;
/*本类用于测试基本类型的包装类*/
import java.util.Scanner;

/*本类用与正则表达式入门案例*/
//需求:接收用户输入的身份证号,并将判断的结果输出
public class TestRegex {
    public static void main(String[] args) {
        //1.提示并接收用户输入的身份证号
        System.out.println("请输入您的身份证号:");
        String input = new Scanner(System.in).nextLine();

        //2.
        String regex = "[0-9]{17}[0-9xX]";
        /*单个\在Java中有特殊的含义,表示转义符号,不认为是一个反斜杠
        * 如果想要表示反斜杠,需要在它的前面加一个用来转义的\
        * 也就是\\才表示一个单纯的斜杠*/
        if(input.matches(regex)) {
            System.out.println("恭喜您!输入正确!");
        }else{
            System.out.println("很抱歉!输入错误!");
        }
    }
}
