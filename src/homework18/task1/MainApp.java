package homework18.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Object> objects = new ArrayList<>();
        Object object = new Object();

        RepositoryThreadSync threadSyncModif1 = new RepositoryThreadSync(object, objects, Action.MODIFICATION);
        RepositoryThreadSync threadSyncModif2 = new RepositoryThreadSync(object, objects, Action.MODIFICATION);
        RepositoryThreadSync threadSyncModif3 = new RepositoryThreadSync(object, objects, Action.MODIFICATION);
        RepositoryThreadSync threadSyncFind1 = new RepositoryThreadSync(object, objects, Action.FIND);
        RepositoryThreadSync threadSyncFind2 = new RepositoryThreadSync(object, objects, Action.FIND);
        RepositoryThreadSync threadSyncFind3 = new RepositoryThreadSync(object, objects, Action.FIND);
        RepositoryThreadLock threadLockModif1 = new RepositoryThreadLock(object, objects, Action.MODIFICATION);
        RepositoryThreadLock threadLockModif2 = new RepositoryThreadLock(object, objects, Action.MODIFICATION);
        RepositoryThreadLock threadLockModif3 = new RepositoryThreadLock(object, objects, Action.MODIFICATION);
        RepositoryThreadLock threadLockFind1 = new RepositoryThreadLock(object, objects, Action.FIND);
        RepositoryThreadLock threadLockFind2 = new RepositoryThreadLock(object, objects, Action.FIND);
        RepositoryThreadLock threadLockFind3 = new RepositoryThreadLock(object, objects, Action.FIND);

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

        List<Thread> listMyThread = Arrays.asList(myThreadSync1, myThreadSync2, myThreadSync3,
                myThreadSync4, myThreadSync5, myThreadSync6,
                myThreadLock1, myThreadLock2, myThreadLock3,
                myThreadLock4, myThreadLock5, myThreadLock6);

        for (Thread thread : listMyThread) {
            thread.start();
        }

        List<RepositoryThreadSync> listThreadSync = Arrays.asList(threadSyncModif1, threadSyncModif2,
                threadSyncModif3, threadSyncFind1, threadSyncFind2, threadSyncFind3);
        List<RepositoryThreadLock> listThreadLock = Arrays.asList(threadLockModif1, threadLockModif2,
                threadLockModif3, threadLockFind1, threadLockFind2, threadLockFind3);


        //остановка потоков
        try {
            Thread.sleep(10000);
            for (RepositoryThreadSync syncThread : listThreadSync) {
                syncThread.stopThread();
            }
            for (RepositoryThreadLock lockThread : listThreadLock) {
                lockThread.stopThread();
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
