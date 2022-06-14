package homework18.task1;

import java.util.List;

public class RepositoryThreadLock extends AbstractRep implements Runnable {

    public RepositoryThreadLock(ObjectForSyncAndLock object, List<Object> objects, Action action) {
        super(object, objects, action);
    }

    protected boolean find(ObjectForSyncAndLock object) {
        object.getLock().lock();
        try {
            super.find(object);
        } finally {
            object.getLock().unlock();
        }
        return isFound;
    }

    protected void toAddOrDelete(ObjectForSyncAndLock object) {
        object.getLock().lock();
        try {
            super.toAddOrDelete(object);
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
                this.find(object);
            }
        }
    }

    public void stopThread() {
        super.stopThread();
    }
}
