package homework18.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class MainApp {
    public static void main(String[] args) {
        List<Object> objects = new ArrayList<>();
        ReentrantLock locker = new ReentrantLock();
        Object object = new Object();

        RepositoryThreadSync threadSyncModif1 = new RepositoryThreadSync(object, objects, Action.MODIFICATION);
        RepositoryThreadSync threadSyncModif2 = new RepositoryThreadSync(object, objects, Action.MODIFICATION);
        RepositoryThreadSync threadSyncModif3 = new RepositoryThreadSync(object, objects, Action.MODIFICATION);
        RepositoryThreadSync threadSyncFind1 = new RepositoryThreadSync(object, objects, Action.FIND);
        RepositoryThreadSync threadSyncFind2 = new RepositoryThreadSync(object, objects, Action.FIND);
        RepositoryThreadSync threadSyncFind3 = new RepositoryThreadSync(object, objects, Action.FIND);
        RepositoryThreadLock threadLockModif1 = new RepositoryThreadLock(object, objects, locker, Action.MODIFICATION);
        RepositoryThreadLock threadLockModif2 = new RepositoryThreadLock(object, objects, locker, Action.MODIFICATION);
        RepositoryThreadLock threadLockModif3 = new RepositoryThreadLock(object, objects, locker, Action.MODIFICATION);
        RepositoryThreadLock threadLockFind1 = new RepositoryThreadLock(object, objects, locker, Action.FIND);
        RepositoryThreadLock threadLockFind2 = new RepositoryThreadLock(object, objects, locker, Action.FIND);
        RepositoryThreadLock threadLockFind3 = new RepositoryThreadLock(object, objects, locker, Action.FIND);

        Thread myThreadSync1 = new Thread(threadSyncModif1, "ModifSync1");
        Thread myThreadSync2 = new Thread(threadSyncModif2, "ModifSync2");
        Thread myThreadSync3 = new Thread(threadSyncModif3, "ModifSync3");
        Thread myThreadSync4 = new Thread(threadSyncFind1, "FindSync1");
        Thread myThreadSync5 = new Thread(threadSyncFind2, "FindSync2");
        Thread myThreadSync6 = new Thread(threadSyncFind3, "FindSync3");
        Thread myThreadLock1 = new Thread(threadLockModif1, "ModifLock1");
        Thread myThreadLock2 = new Thread(threadLockModif2, "ModifLock2");
        Thread myThreadLock3 = new Thread(threadLockModif3, "ModifLock3");
        Thread myThreadLock4 = new Thread(threadLockFind1, "FindLock1");
        Thread myThreadLock5 = new Thread(threadLockFind2, "FindLock2");
        Thread myThreadLock6 = new Thread(threadLockFind3, "FindLock3");

        myThreadSync1.start();
        myThreadSync2.start();
        myThreadSync3.start();
        myThreadSync4.start();
        myThreadSync5.start();
        myThreadSync6.start();

//        myThreadLock1.start();
//        myThreadLock2.start();
//        myThreadLock3.start();
//        myThreadLock4.start();
//        myThreadLock5.start();
//        myThreadLock6.start();

        //остановка потоков
        try {
            Thread.sleep(10000);
            threadSyncModif1.stopThread();
            threadSyncModif2.stopThread();
            threadSyncModif3.stopThread();
            threadSyncFind1.stopThread();
            threadSyncFind2.stopThread();
            threadSyncFind3.stopThread();
            threadLockModif1.stopThread();
            threadLockModif2.stopThread();
            threadLockModif3.stopThread();
            threadLockFind1.stopThread();
            threadLockFind2.stopThread();
            threadLockFind3.stopThread();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
