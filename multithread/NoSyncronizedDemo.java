package multithread;
////void printData(int n){  //method not synchronized
//        synchronized void printData(int n){

class MyData{
    synchronized void printData(int n){
        for(int i=0;i<5;i++){
            System.out.println(i+ "-" + (n*i));
            try{
                Thread.sleep(500);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
class MyThread1 extends Thread {
    MyData d;

    MyThread1(MyData d) {
        this.d = d;
    }

    public void run() {
        d.printData(10);
    }
}

class MyThread2 extends Thread{
        MyData d;

        MyThread2(MyData d) {
            this.d = d;
        }

        public void run() {
            d.printData(100);
        }
}

public class NoSyncronizedDemo {
    public static void main(String args[]){
        MyData obj = new MyData();   //share resource object
        MyThread1 t1=new MyThread1(obj);
        MyThread2 t2=new MyThread2(obj);
        t1.start();
        t2.start();
    }
}
