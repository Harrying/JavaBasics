package day19.com.briup.work;


public class Work3 {
    static final Object object = new Object();

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (object) {
                    for (int i = 0; i < 10; i ++) {
                        System.out.println(Thread.currentThread().getName() + "    " + "A");
                        object.notify();
                        try {
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }, "t1");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (object) {
                    for (int i = 0; i < 10; i ++) {
                        System.out.println(Thread.currentThread().getName() + "     " + "B");
                        object.notify();
                        try {
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }, "t2");
        t1.start();
        t2.start();
    }
}