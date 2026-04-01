package functional_interfaces;

//	Interface with default method
	interface ReportExporter {
	
	 void exportToCSV();
	 void exportToPDF();
	
	 default void exportToJSON() {
	     System.out.println("Report exported in JSON format");
	 }
	}
	
//	Existing implementation
	class SalesReport implements ReportExporter {
	
	 public void exportToCSV() {
	     System.out.println("Report exported in CSV format");
	 }
	
	 public void exportToPDF() {
	     System.out.println("Report exported in PDF format");
	 }
	}
	
//	Main class
	public class ExportMain {
	 public static void main(String[] args) {
	
	     ReportExporter report = new SalesReport();
	     report.exportToCSV();
	     report.exportToPDF();
	     report.exportToJSON();  // new feature
	 }
	}

