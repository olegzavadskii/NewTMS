package homework18.task1;

import java.util.List;

public class RepositoryThreadLock implements Runnable {
    private List<Object> objects;
    private boolean isFound = false;
    private ObjectForSyncAndLock object;
    private Action action;
    private volatile boolean isRunning = true;

    public RepositoryThreadLock(ObjectForSyncAndLock object, List<Object> objects, Action action) {
        this.object = object;
        this.objects = objects;
        this.action = action;
    }

    private boolean find(ObjectForSyncAndLock object) {
        object.getLock().lock();
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
        } finally {
            object.getLock().unlock();
        }
        return isFound;
    }

    private void toAddOrDelete(ObjectForSyncAndLock object) {
        object.getLock().lock();
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
        } finally {
            object.getLock().unlock();
        }
    }

    @Override
    public void run() {
        while (isRunning) {
            if (this.action == Action.MODIFICATION) {
                find(object);
                toAddOrDelete(object);
            } else {
                find(object);
            }
        }
    }

    public void stopThread() {
        isRunning = false;
    }
}
