package scenario_based.stream_buzz;

import java.util.*;

//	CreatorStats class
	class CreatorStats {
	 public String creatorName;
	 public double[] weeklyLikes;
	
	 public CreatorStats(String creatorName, double[] weeklyLikes) {
	     this.creatorName = creatorName;
	     this.weeklyLikes = weeklyLikes;
	 }
	}
	
//	Program class
	class Program {
	
//	  EngagementBoard (already provided as per template)
	 public static List<CreatorStats> EngagementBoard = new ArrayList<>();
	
//	  Register creator
	 public void RegisterCreator(CreatorStats record) {
	     EngagementBoard.add(record);
	 }
	
//	  Get top post counts
	 public Dictionary<String, Integer> GetTopPostCounts(List<CreatorStats> records, double likeThreshold) {
	
	     Dictionary<String, Integer> result = new Hashtable<>();
	
	     for (CreatorStats cs : records) {
	         int count = 0;
	         for (double likes : cs.weeklyLikes) {
	             if (likes >= likeThreshold) {
	                 count++;
	             }
	         }
	         if (count > 0) {
	             result.put(cs.creatorName, count);
	         }
	     }
	     return result;
	 }
	
//	  Calculate average likes
	 public double CalculateAverageLikes() {
	
	     if (EngagementBoard.isEmpty()) {
	         return 0;
	     }
	
	     double sum = 0;
	     int totalWeeks = 0;
	
	     for (CreatorStats cs : EngagementBoard) {
	         for (double likes : cs.weeklyLikes) {
	             sum += likes;
	             totalWeeks++;
	         }
	     }
	     return sum / totalWeeks;
	 }
	
	 // Main method
	 public static void main(String[] args) {
	
	     Scanner sc = new Scanner(System.in);
	     Program program = new Program();
	
	     while (true) {
	
	         System.out.println("1. Register Creator");
	         System.out.println("2. Show Top Posts");
	         System.out.println("3. Calculate Average Likes");
	         System.out.println("4. Exit");
	         System.out.println("Enter your choice:");
	
	         int choice = sc.nextInt();
//	       consume newline
	         sc.nextLine(); 
	         
	
	         switch (choice) {
	
	             case 1:
	                 System.out.println("Enter Creator Name:");
	                 String name = sc.nextLine();
	
	                 double[] likes = new double[4];
	                 System.out.println("Enter weekly likes (Week 1 to 4):");
	                 for (int i = 0; i < 4; i++) {
	                     likes[i] = sc.nextDouble();
	                 }
//	               consume newline
	                 sc.nextLine(); 
	
	                 CreatorStats creator = new CreatorStats(name, likes);
	                 program.RegisterCreator(creator);
	
	                 System.out.println("Creator registered successfully");
	                 break;
	
	             case 2:
	                 System.out.println("Enter like threshold:");
	                 double threshold = sc.nextDouble();
	                 sc.nextLine();
	
	                 Dictionary<String, Integer> topPosts =
	                         program.GetTopPostCounts(EngagementBoard, threshold);
	
	                 if (topPosts.isEmpty()) {
	                     System.out.println("No top-performing posts this week");
	                 } else {
	                     Enumeration<String> keys = topPosts.keys();
	                     while (keys.hasMoreElements()) {
	                         String key = keys.nextElement();
	                         System.out.println(key + " - " + topPosts.get(key));
	                     }
	                 }
	                 break;
	
	             case 3:
	                 double avg = program.CalculateAverageLikes();
	                 System.out.println("Overall average weekly likes: " + (int) avg);
	                 break;
	
	             case 4:
	                 System.out.println("Logging off - Keep Creating with StreamBuzz!");
//	               terminate program safely
	                 return; 
	                 
	
	             default:
	                 System.out.println("Invalid choice");
	         }
	     }
	 }
	}

