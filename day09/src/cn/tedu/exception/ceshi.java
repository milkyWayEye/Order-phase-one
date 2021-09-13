package cn.tedu.exception;

public class ceshi {
    public static void main(String[] args) {
        Father f = new Son();
        System.out.println(f.a);//5
        Son s = (Son)f;
        System.out.println(s.a);//8
        System.out.println(true ^ false);//true
    }
}

class Father {
    int a = 5;
}

class Son extends Father {
    int a = 8;
}