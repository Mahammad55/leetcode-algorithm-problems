package collection.medium;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

// 1834
public class SingleThreadedCPU {
    public static void main(String[] args) {

    }

    public static int[] getOrder(int[][] tasks) {
        int n = tasks.length;
        int[][] newTasks = new int[n][3];

        for (int i = 0; i < n; i++) {
            newTasks[i][0] = tasks[i][0];
            newTasks[i][1] = tasks[i][1];
            newTasks[i][2] = i;
        }

        Arrays.sort(newTasks, (a, b) -> ((a[0] == b[0] ? (a[1] - b[1]) : (a[0] - b[0]))));

        record Task(int pTime, int id) {
        }
        Queue<Task> queue = new PriorityQueue<>(
                (task1, task2) ->
                        (task1.pTime == task2.pTime ? (task1.id - task2.id) : (task1.pTime - task2.pTime))
        );

        int[] res = new int[n];
        long cpuTime = 1;
        int pos = 0;

        for (int i = 0; i < n; i++) {
            while (pos < n && newTasks[pos][0] <= cpuTime) {
                queue.add(new Task(newTasks[pos][1], newTasks[pos][2]));
                ++pos;
            }

            if (queue.isEmpty()) {
                queue.add(new Task(newTasks[pos][1], newTasks[pos][2]));
                cpuTime = newTasks[pos][0];
                ++pos;
            }

            Task done = queue.poll();
            res[i] = done.id;
            cpuTime += done.pTime;
        }

        return res;
    }
}
