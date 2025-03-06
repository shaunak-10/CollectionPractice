package queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayQueuePractice {
    public static void main(String[] args) throws InterruptedException {
        // thread safe - unbounded
        // elements can only be taken when their delay has expired
        // useful for scheduling a task to be executed after certain delay
        // internally uses priority queue

        BlockingQueue<DelayedTask> delayQueue = new DelayQueue<>();
        delayQueue.put(new DelayedTask("Task 1", 5, TimeUnit.SECONDS));
        delayQueue.put(new DelayedTask("Task 2", 3, TimeUnit.SECONDS));
        delayQueue.put(new DelayedTask("Task 3", 10, TimeUnit.SECONDS));

        while(!delayQueue.isEmpty())
        {
            DelayedTask d = delayQueue.take();
            System.out.println("Executed: " + d.getTaskName() + " at " + System.currentTimeMillis());
        }

    }
}

class DelayedTask implements Delayed{

    private final String taskName;
    private final long startTime;

    public DelayedTask(String taskName, long delay, TimeUnit unit) {
        this.taskName = taskName;
        this.startTime = System.currentTimeMillis() + unit.toMillis(delay);
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long remaining = startTime - System.currentTimeMillis();
        return unit.convert(remaining, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        if(this.startTime < ((DelayedTask)o).startTime)
        {
            return -1;
        }
        if(this.startTime > ((DelayedTask)o).startTime)
        {
            return 1;
        }
        return 0;
    }

    public String getTaskName() {
        return taskName;
    }
}
