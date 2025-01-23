package BasicCodingStudy.collections.deque.test.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class TaskScheduler {

    private Queue<Task> tasks = new ArrayDeque<>();

    public void addTask(Task task) {
        tasks.offer(task);
    }

    public int getRemainingTasks() {
        return tasks.size();
    }

    public void processNextTask() {
        Task task = tasks.poll();
        if(task != null){
            //실행한다. 구현체 중에 하나가 넘어온다.
            task.execute(); // new CompressionTask();
        }
    }
}
