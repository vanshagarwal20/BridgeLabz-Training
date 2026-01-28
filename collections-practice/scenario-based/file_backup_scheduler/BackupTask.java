package scenario_based.file_backup_scheduler;

class BackupTask implements Comparable<BackupTask> {
    String folderPath;
    int priority;

    BackupTask(String folderPath, int priority) throws InvalidBackupPathException {
        if (folderPath == null || folderPath.isEmpty()) {
            throw new InvalidBackupPathException("Invalid backup path");
        }
        this.folderPath = folderPath;
        this.priority = priority;
    }

    @Override
    public int compareTo(BackupTask other) {
        return Integer.compare(other.priority, this.priority); // High priority first
    }

    void execute() {
        System.out.println("Backing up: " + folderPath + " (Priority " + priority + ")");
    }
}

