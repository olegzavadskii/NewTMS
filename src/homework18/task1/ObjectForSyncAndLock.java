package homework18.task1;

import java.util.concurrent.locks.Lock;

public class ObjectForSyncAndLock {
    private Lock lock;

    public ObjectForSyncAndLock() {
    }

    public ObjectForSyncAndLock(Lock lock) {
        this.lock = lock;
    }

    public Lock getLock() {
        return lock;
    }
}
