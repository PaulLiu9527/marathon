package base.multithreading;


import org.junit.jupiter.api.Test;
import org.openjdk.jol.info.ClassLayout;

/**
 * @author liupu@miningyum.com
 * @version 1.0
 * @date 2021/6/8 14:23
 */
public class SynchronizedTest {

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(5000);
        A a = new A();
        System.out.println(ClassLayout.parseInstance(a).toPrintable());
    }


}





