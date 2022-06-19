package homework18_Threads;

import java.util.List;

public class RepositoryThreadSync extends AbstractRep implements Runnable {

    public RepositoryThreadSync(ObjectForSyncAndLock object, List<Object> objects, Action action) {
        super(object, objects, action);
    }

    protected boolean find(ObjectForSyncAndLock object) {
        synchronized (object) {
            super.find(object);
            return isFound;
        }
    }

    protected void toAddOrDelete(ObjectForSyncAndLock object) {
        synchronized (object) {
            super.toAddOrDelete(object);
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
        super.stopThread();
    }
}
