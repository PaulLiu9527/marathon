package base.multithreading;

import org.openjdk.jol.info.ClassLayout;

/**
 * @author liupu@miningyum.com
 * @version 1.0
 * @date 2021/6/8 14:25
 */
public class PrintObjectHead {
    public static void main(String[] args){
        A a = new A();
        System.out.println(ClassLayout.parseInstance(a).toPrintable());
    }
}

class A {
    boolean flag = false;
}
