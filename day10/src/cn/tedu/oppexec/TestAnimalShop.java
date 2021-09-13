package cn.tedu.oppexec;

import java.util.Arrays;

/*本类用于实现宠物商店设计案例*/
public class TestAnimalShop {
    public static void main(String[] args) {
        //开始测试
        //1)创建宠物商店对象
        AnimalShop shop = new AnimalShop();
        //2.给宠物店起名字
        shop.shopName = "爱宠宠物店";
        //3.查看宠物店现在所有的宠物
        System.out.println(Arrays.toString(shop.animals));
        //4.创建动物对象--叫小白的3岁的小猫
        Cat cat = new Cat();
        cat.name = "小白";
        cat.age = 3;
        shop.animals[0] = cat;
        shop.buy(shop.animals[0]);
        //5.1创建一直叫罗小黑的5岁的猫
        Cat cat1 = new Cat();
        cat1.name = "罗小黑";
        cat1.age = 5;
        //5.2将第二只创建好的小动物放到数组里
        shop.animals[1] = cat1;

        //6.1创建一只叫旺财的4岁的狗
        Dog dog = new Dog();
        dog.name = "旺财";
        dog.age = 4;
        //6.2将第三只创建好的小动物放到数组里
        shop.animals[2] = dog;

        //7.1创建一直叫银子的100岁的鸟
        Bird bird = new Bird();
        bird.name = "银子";
        bird.age = 100;
        //7.2将第四只创建好的小动物放到数组里
        shop.animals[3] = bird;

        //8.1创建一只叫大米的狗
        Dog dog1 = new Dog();
        dog1.name = "大米";
        dog1.age = 7;
        //8.2将第五只创建好的小动物放到数组里
        shop.animals[4] = dog1;

        //9.通过遍历数组,查看每一只动物的名字
        System.out.println(Arrays.toString(shop.animals));
        for (int i=0;i<shop.animals.length;i++) {
            System.out.print(shop.animals[i].name+"\t");
            System.out.println(shop.animals[i].age);
        }

        //10.调用动物自己的方法
        shop.animals[2].eat();
        //11.商店查看方法
        Animal query = shop.query(1);
        System.out.println(query.name+'\t'+query.age);
        //12.商店买方法
        shop.buy(query);
    }
}

//1.创建宠物类的父类Animal
class Animal {
    //2.定义动物类的属性
    public String name;
    public int age;

    //3.定义动物类的方法
    public void eat() {
        System.out.println("小动物Animal吃啥都行~");
    }
}

//4.创建子类小猫类
class Cat extends Animal {
    //5.重写父类的方法
    @Override
    public void eat() {
        System.out.println("小猫爱吃小鱼干~");
    }

    //6.添加子类的特有方法
    public void miaoMiao() {
        System.out.println("小猫开始喵喵叫啦...");
    }
}

//7.创建子类小鸟类
class Bird extends Animal {
}

//8.创建子类小狗类
class Dog extends Animal {
}

//9.创建宠物商店类
class AnimalShop {
    //10.定义宠物商店的属性
    public String shopName;//商店名
    //准备一个Animal类型的数组,用来存放小动物对象,长度为5
    public Animal[] animals = new Animal[5];

    //11.定义宠物商店的方法
    public Animal query(int i) {
        //传入编号,也就是数组下标,返回数组中对应的小动物对象
        return animals[i];
    }
    //11.2定义宠物商店的方法2--购买小动物
    /*此处方法的参数是多态的体现,不管传入的是具体的什么小动物,都看作Animal类型*/
    public void buy(Animal animal) {
        System.out.println("恭喜你要带:"+animal.name+"回家啦~,它"+animal.age
        +"岁啦,要好好照顾它哦~");
    }
}
