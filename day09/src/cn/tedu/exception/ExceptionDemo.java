package cn.tedu.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/*本类用作异常的入门案例*/
public class ExceptionDemo {
    public static void main(String[] args) {
        //f1();//用来测试异常的暴露
        //f2();//异常的解决方案一
        //f3();//异常的解决方案二
        method();//本方法用来解决f3()抛出的异常
    }

    /*以后这个代码就是别人来写,不是我们自己写*/
    private static void method() {//方法用来解决f3()抛出的异常,为了在main方法调用之前处理掉这个问题
        try{
            f3();
        }catch (Exception e){
            System.out.println("输入的不对哦~");
        }
    }

    /*异常的解决方案二:向上抛出,谁调用这个方法,谁来解决
    * 格式: 在方法的小括号与大括号之间写: throws 异常类型1,异常类型2...
    * 但是注意:我们一般不把异常直接抛给main(),因为没人解决了,再往后就是JVM虚拟机了
    * 所以:我们一般会在main()方法调用之前解决掉异常
    * */
    private static void f3() throws Exception{
        //需求:接收两个整数,打印它们除法的结果
        //1.提示接收用户输入的两个整数
        System.out.println("请您输入要计算的第一个整数:");
        int a = new Scanner(System.in).nextInt();
        System.out.println("请您输入要计算的第二个整数:");
        int b = new Scanner(System.in).nextInt();
        //2.输出两个数除法的结果
        System.out.println(a / b);
    }

    /*异常的解决方案一:自己捕获处理,格式:
     * try{
     *   可能会发生异常的所有代码
     * }catch(异常的类型 异常的名字){
     *   捕获到了预先推测的异常,就执行此处设置的解决方案
     * }
     * */
    private static void f2() {
        try {
            //需求:接收两个整数,打印它们除法的结果
            //1.提示接收用户输入的两个整数
            System.out.println("请您输入要计算的第一个整数:");
            int a = new Scanner(System.in).nextInt();
            System.out.println("请您输入要计算的第二个整数:");
            int b = new Scanner(System.in).nextInt();
            //2.输出两个数除法的结果
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0!");
        } catch (InputMismatchException e) {
            System.out.println("请输入整数!");
        } catch (Exception e) {
            /*忽略所有子异常的差异,统一用父类型Exception来接
            * 也就是说,不管什么子异常,都能被匹配到,这个是多态最为经典的一种用法*/
            System.out.println("输入不正确!请重新输入");/*提供的通用解决方案*/
        }
    }

    /*ArithmeticException
     * 算数异常
     * 除数为0时,报算术异常,因为除数不能为0.
     * */
    /*InputMismatchException
     *输入不匹配异常
     * 输入的类型和要求的类型不匹配
     * */
    /*用来暴露异常*/
    /*1.不要害怕BUG,真正的勇士敢于直面自己写的BUG
     * 2.学会看报错的提示信息,确定错误的方向,不管第1行有多长,都得看完
     * 3.学会看报错的行号信息,确定自己报错的位置,哪里不对点哪里
     * 注意:源码不会错,要看自己的代码*/
    private static void f1(){
        //需求:接收两个整数,打印它们除法的结果
        //1.提示接收用户输入的两个整数
        System.out.println("请您输入要计算的第一个整数:");
        int a = new Scanner(System.in).nextInt();
        System.out.println("请您输入要计算的第二个整数:");
        int b = new Scanner(System.in).nextInt();
        //2.输出两个数除法的结果
        System.out.println(a / b);
    }
}
