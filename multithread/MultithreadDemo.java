package multithread;
class Printer {
    public void printDocuments(String documentName, int numberOfCopies){

        for (int i=1; i<=numberOfCopies; i++){
            System.out.println(">>Printing " + documentName + "#" +i);
        }

/*
        for (int i=1; i<=numberOfCopies; i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(">>Printing " + documentName + "#" +i);
        }

 */

    }
}
class PrinterThreadUser1 extends Thread {
    Printer prtRef;

    PrinterThreadUser1(Printer p){
        prtRef = p;
    }
    @Override
    public void run() {
        //     prtRef.printDocuments("myfile.pdf", 10);

        synchronized (prtRef){
            prtRef.printDocuments("myfile.pdf", 10);
        }
    }
}

class PrinterThreadUser2 extends Thread {
    Printer prtRef;

    PrinterThreadUser2(Printer p){
        prtRef = p;
    }
    @Override
    public void run() {
        //    prtRef.printDocuments("helloworld.pdf", 5);
        synchronized (prtRef){
            prtRef.printDocuments("helloworld.pdf", 5);
        }
    }
}

public class MultithreadDemo {
    public static void main(String[] args) {
        System.out.println("Start program");
        Printer ptr = new Printer();

        PrinterThreadUser1 ptrThread1  = new PrinterThreadUser1(ptr);
        PrinterThreadUser2 ptrThread2  = new PrinterThreadUser2(ptr);

        ptrThread1.start();
        ptrThread2.start();
        System.out.println("End of program");
    }

}
