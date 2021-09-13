package cn.tedu;

public class exercise {
    public static void main(String[] args) {
        //error1();
        //error2();
        newKnowledge1();
    }

    /*错在下标越界,会报错*/
    private static void error1() {
        int[] i = new int[5];
        System.out.println(i[5]);
    }

    /*基本类型和final连用*/
    private static void error2() {
        int m = 2;
        byte n = 4;
        byte z = (byte)(m + n);
        System.out.println(m+n);
        byte b1=1,b2=2,b3,b4;
        final byte b5=3,b6=4,b7,b8;
        //b3 = b1 + b2; 编译错误,byte类型的变量在计算时会先提升为int类型
        //b7 = b1 + b2; 编译错误,byte类型的变量在计算时会先提升为int类型
        //b3 = b5 + b7;编译错误,b7没有被赋值
        b8 = b5 + b6;//被final修饰的byte不会提升,右边结果类型看左边
        int a = b5 + b6;
        b4 = b5 + b6;
        b7 = (byte)(b1 + b5);//b5不提升但b1会提升
        System.out.println(b8);
        System.out.println(b4);
        final int ss=1,dd=2;
        byte zz = ss+dd;
    }

    /*转义字符*/
    private static void newKnowledge1() {
        System.out.println("我\b你");
        System.out.println("我\\b你");
    }
}