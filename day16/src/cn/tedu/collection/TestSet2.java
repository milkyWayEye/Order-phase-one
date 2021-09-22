package cn.tedu.collection;

import java.util.HashSet;
import java.util.Set;

/*本类用于继续策划死Set*/
public class TestSet2 {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();

        Student s1 = new Student("张三",3);
        Student s2 = new Student("李四",4);
        Student s3 = new Student("李四",4);

        set.add(s1);
        set.add(s2);
        set.add(s3);

    }
}
