package homework18.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class MainApp {
    public static void main(String[] args) {
        List<Object> objects = new ArrayList<>();
        ReentrantLock locker = new ReentrantLock();
        Object object = new Object();

        RepositoryThreadSync threadSync = new RepositoryThreadSync(object, objects);
        RepositoryThreadLock threadLock = new RepositoryThreadLock(object, objects, locker);

        Thread myThreadSync1 = new Thread(threadSync, "Sync1");
        Thread myThreadSync2 = new Thread(threadSync, "Sync2");
        Thread myThreadSync3 = new Thread(threadSync, "Sync3");
        Thread myThreadLock1 = new Thread(threadLock, "Lock1");
        Thread myThreadLock2 = new Thread(threadLock, "Lock2");
        Thread myThreadLock3 = new Thread(threadLock, "Lock3");


        myThreadSync1.start();
        myThreadSync2.start();
        myThreadSync3.start();

//        myThreadLock1.start();
//        myThreadLock2.start();
//        myThreadLock3.start();


        //остановка потоков
        try {
            Thread.sleep(10000);
            threadSync.stopThread();
            threadLock.stopThread();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
