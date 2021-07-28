package 抽象与接口;

import java.awt.*;

public abstract class 抽象 {
    /*
    抽象函数：表达概念而无法实现具体代码的函数
    抽象类：表达概念而无法构造出实体的类

    #  带有abstract修饰符的函数是抽象函数
    #  有抽象函数的类一定是抽象类
    #  抽象类不能制造对象，但是可以定义变量
         任何继承了抽象类的非抽象类的对象都可以付给这个变量

    */
    public abstract void draw(Graphics g);


}

