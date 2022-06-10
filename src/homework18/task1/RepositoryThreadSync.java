package homework18.task1;

import java.util.List;

public class RepositoryThreadSync implements Runnable {
    private List<Object> objects;
    private boolean isFound = false;
    private Object object;
    private volatile boolean isRunning = true;


    public RepositoryThreadSync(Object object, List<Object> objects) {
        this.object = object;
        this.objects = objects;
    }

    private synchronized boolean find(Object object) {
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
        return isFound;
    }

    private synchronized void toAddOrDelete(Object object) {
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
