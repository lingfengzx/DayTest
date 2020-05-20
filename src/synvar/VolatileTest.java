package synvar;
/**
 * synchronized可以保证原子性、有序性和可见性。而volatile却只能保证有序性和可见性
 * @author zxk
 *
 */
public class VolatileTest {
    public volatile int inc = 0;
 
    public void increase() {
        inc++;
        System.out.println(inc);
    }
 
    public static void main(String[] args) {
        final VolatileTest test = new VolatileTest();
        for(int i=0;i<10;i++){
            new Thread(){
                public void run() {
                    for(int j=0;j<1000;j++)
                        test.increase();
                };
            }.start();
        }
 
        while(Thread.activeCount()>1)  //保证前面的线程都执行完
            Thread.yield();
        System.out.println(test.inc);
    }
}