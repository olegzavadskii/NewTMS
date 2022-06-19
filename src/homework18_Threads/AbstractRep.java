package homework18_Threads;

import java.util.List;

public abstract class AbstractRep {
    protected List<Object> objects;
    protected boolean isFound = false;
    protected ObjectForSyncAndLock object;
    protected Action action;
    protected volatile boolean isRunning = true;

    public AbstractRep(ObjectForSyncAndLock object, List<Object> objects, Action action) {
        this.object = object;
        this.objects = objects;
        this.action = action;
    }

    protected boolean find(ObjectForSyncAndLock object) {
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

    protected void toAddOrDelete(ObjectForSyncAndLock object) {
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

    protected void stopThread() {
        isRunning = false;
    }
}
