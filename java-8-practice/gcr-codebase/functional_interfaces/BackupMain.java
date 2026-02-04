package functional_interfaces;

import java.io.Serializable;
	
//	Marker Interface usage
	class BackupData implements Serializable {
	
	 int id;
	 String name;
	
	 BackupData(int id, String name) {
	     this.id = id;
	     this.name = name;
	 }
	}
	
//	Main class
	public class BackupMain {
	 public static void main(String[] args) {
	
	     BackupData data = new BackupData(101, "PolicyData");
	
	     System.out.println("BackupData object created");
	     System.out.println("This class is Serializable for backup");
	 }
	}

