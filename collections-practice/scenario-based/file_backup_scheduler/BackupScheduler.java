package scenario_based.file_backup_scheduler;

import java.util.*;

class BackupScheduler {
    PriorityQueue<BackupTask> queue = new PriorityQueue<>();

    void addTask(BackupTask task) {
        queue.add(task);
    }

    void executeTasks() {
        while (!queue.isEmpty()) {
            queue.poll().execute();
        }
    }
}
