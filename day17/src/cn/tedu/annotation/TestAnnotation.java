package cn.tedu.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

/*本类用于完成自定义注解*/
public class TestAnnotation {
    public static void main(String[] args) {

    }
}

/*3.通过元注解@Target规定自定义注解可以使用的位置
* 我们使用"ElementType.静态常量"的方式来指定自定义注解具体可以加在什么
* 位置,而且,值可以写多个,格式:@Target({ElementType.XXX,ElementType.XXY})*/
//3.通过@Retention注解标记自定义注解的生命周期
/*4.通过元注解@Retention规则自定义注解的生命周期
* 我们使用"RetentionPolicy.静态常量"的方式来指定自定义注解的生命周期
* 注意:值只能写一个:SOURCE CLASS RUNTIME 3选1*/
@Retention(RetentionPolicy.RUNTIME)//到运行时都有效
@Target({ElementType.METHOD,ElementType.TYPE})
//1.定义自定义注解
/*1.首先注意:注解定义的语法与Java不同
 * 2.定义自定义注解的格式:@interface 注解名
 * */
@interface Rice{
    //5.我们可以给注解进行功能增强--添加注解的属性
    /*5.注意:int age();不是方法的定义,而是给自定义注解添加了一个age属性*/
    //int age();//给自定义注解添加一个普通属性age,类型是int
    int age() default 0;//给自定义注解的普通属性赋予默认值0
    String value();
    /*6.注解中还可以添加特殊属性value
    * 特殊属性的定义方式与普通属性一样,主要是使用方式不同
    * 注意:特殊属性的名字必须教value,但是类型不做限制
    * 特殊属性也可以赋予默认值,格式与普通属性一样,不能简写*/
}

//定义一个类用来测试Rice注解
/*2.当我们给Rice注解添加了一个age属性以后,@Rice注解使用时直接报错
* 结论:当注解没有定义属性时,可以直接使用
*   当注解定义了属性以后,必须给属性复制,格式:@Rice(age = 10)*/
/*测试3:给age属性赋予默认值以后,可以直接使用@Rice注解
* 不需要给age属性赋值,因为age属性已经有默认值0了*/
/*测试4:给Rice注解添加了特殊属性value以后,必须给属性赋值
* 只不过特殊属性赋值时可以简写成@Rice("Apple")*/
/*测试5:如果特殊属性也赋予了默认值,那么可以直接使用这个注解*/
/*如果要给注解的所有属性赋值,每条赋值都不能简写*/
@Rice("Apple")
//@Rice(10)报错,不可以简写,必须给属性赋值,格式:@Rice(age=10)
class TestAnno{
    /*测试1:分别给TestAnno类 name属性 eat方法都添加Rice注解
    * 结论:属性上的注解报错了,说明自定义注解可以加在什么位置,由@Target决定*/
    String name;
    @Rice("Apple")
    public void eat(){
        System.out.println("干饭不积极,思想有问题");
    }
}