package lesson5;

class Processor extends Thread {

    public void run () {

        while (true) {

            System.out.println("Hello!");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

}

public class Demo {

    public static void main (String [] args) {

        Processor processor = new Processor();

        processor.start();

    }

}
