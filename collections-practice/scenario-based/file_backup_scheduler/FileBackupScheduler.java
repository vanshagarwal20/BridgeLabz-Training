package scenario_based.file_backup_scheduler;

public class FileBackupScheduler {
    public static void main(String[] args) {
        BackupScheduler scheduler = new BackupScheduler();

        try {
            scheduler.addTask(new BackupTask("/system", 5));
            scheduler.addTask(new BackupTask("/documents", 2));
            scheduler.addTask(new BackupTask("/media", 3));
        } catch (InvalidBackupPathException e) {
            System.out.println(e.getMessage());
        }

        scheduler.executeTasks();
    }
}
