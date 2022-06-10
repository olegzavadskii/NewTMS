package homework18.task1;

import java.util.List;
import java.util.concurrent.locks.Lock;

public class RepositoryThreadLock implements Runnable {
    private List<Object> objects;
    private boolean isFound = false;
    private Object object;
    private volatile boolean isRunning = true;
    private Lock locker;


    public RepositoryThreadLock(Object object, List<Object> objects, Lock locker) {
        this.object = object;
        this.objects = objects;
        this.locker = locker;
    }

    private boolean find(Object object) {
        locker.lock();
        try {
            System.out.println("The message before sleeping...");
            Thread.sleep(500);
            System.out.println("The message after sleeping...");
            isFound = objects.stream().anyMatch(el -> el.equals(object));
            if (isFound) {
                System.out.println("Object is found " + Thread.currentThread().getName());
            } else {
                System.out.println("Object is not found " + Thread.currentThread().getName());
            }
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
        locker.unlock();
        return isFound;
    }

    private synchronized void toAddOrDelete(Object object) {
        locker.lock();
        try {
            System.out.println("The message before sleeping...");
            Thread.sleep(500);
            System.out.println("The message after sleeping...");
            if (isFound) {
                objects.remove(object);
                System.out.println("Object is deleted " + Thread.currentThread().getName());
            } else {
                objects.add(object);
                System.out.println("Object is added " + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        locker.unlock();
    }

    @Override
    public void run() {
        while (isRunning) {
            find(object);
            toAddOrDelete(object);
        }
    }

    public void stopThread() {
        isRunning = false;
    }
}
