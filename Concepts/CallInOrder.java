import java.util.concurrent.*;

/*
    Suppose we have the following code:
        public class Foo{
            public Foo(){...}
            public void first(){...}
            public void second(){...}
            public void third(){...}
        }
    Problem statement: The same instance of Foo will be passed to three different threads. 
    ThreadA will call first,ThreadB will call second,ThreadC will call third. 
    Design a mechanism to ensure that first is called before second and second before third.
 */

class Foo{
    public Semaphore s1, s2;
    public Foo(){
        try{
            System.out.println("Intializaing Semaphore...");
            this.s1 = new Semaphore(1,true);
            this.s2 = new Semaphore(1,true);

            s1.acquire();
            s2.acquire();

            System.out.println("Semaphore Intialized!");
        }catch(Exception e){
            System.out.println("Exception in foo(): ");
        }
    }
    public void first(){
        try{
            for(int i=0;i<5;i++){
                System.out.println(i+" - first()");
            }
            s1.release();
        }catch(Exception e){
            System.out.println("Exception in first():");
        }
    }
    public void second(){
        try{
            s1.acquire();
            s1.release();
            for(int i=0;i<5;i++){
                System.out.println(i+" - second()");
            }
            s2.release();
        }catch(Exception e){
            System.out.println("Exception in second():");
        }
    }
    public void third(){
        try{
            s2.acquire();
            s2.release();
            for(int i=0;i<5;i++){
                System.out.println(i+" - third()");
            }
        }catch(Exception e){
            System.out.println("Exception in second():");
        }
    }
}

class ThreadA implements Runnable{
    Foo foo;
    ThreadA(Foo foo){
        System.out.println("Constructor ThreadA");
        this.foo = foo;
    }
    public void run(){
        foo.first();
    }
}

class ThreadB implements Runnable{
    Foo foo;
    ThreadB(Foo foo){
        System.out.println("Constructor ThreadB");
        this.foo = foo;
    }
    public void run(){
        foo.second();
    }
}

class ThreadC implements Runnable{
    Foo foo;
    ThreadC(Foo foo){
        System.out.println("Constructor ThreadC");
        this.foo = foo;
    }
    public void run(){
        foo.third();
    }
}

public class CallInOrder{
    public static void main(String[] args){
        Foo foo = new Foo();
        Thread t1 = new Thread(new ThreadA(foo));
        Thread t3 = new Thread(new ThreadC(foo));
        Thread t2 = new Thread(new ThreadB(foo));

        t3.start();
        t1.start();
        t2.start();
    }
}