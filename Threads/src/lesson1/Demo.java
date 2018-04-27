package lesson1;

class MyClass extends Thread {

    @Override
    public void run() {

        for (int i = 0; i < 10 ; i++) {

            System.out.println("Thread ID: " + Thread.currentThread().getId() + "\nValue: " + i);

        }

        try {

            Thread.sleep(100);

        } catch (InterruptedException e) {

            e.printStackTrace();

        }

    }

}

public class Demo {

    public static void main(String [] args) {

        MyClass myClass = new MyClass();
        myClass.start();

        MyClass myClass1 = new MyClass();
        myClass1.start();

    }

}
