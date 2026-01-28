package scenario_based.file_backup_scheduler;

class InvalidBackupPathException extends Exception {
    public InvalidBackupPathException(String message) {
        super(message);
    }
}
