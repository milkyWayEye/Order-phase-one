package cn.tedu.inner2;
 /*本接口用于进一步测试接口的使用*/
public interface Inter2 {
  /*1.接口中是否有构造方法?没有*/
  /*接口中能有成员变量吗?没有
  * 接口中的变量,实际上都是静态常量
  * 静态:可以被接口名直接调用
  * 常亮:值不可以被修改,并且定义时必须赋值
  * 所以,接口会默认给每个变量自动拼接public static final*/
  int a = 2;
  void ss();
  /*3.接口中有抽象方法吗?有
  * 而且会给方法自动拼接public abstract*/
  public abstract void play();
  void eat();
}
