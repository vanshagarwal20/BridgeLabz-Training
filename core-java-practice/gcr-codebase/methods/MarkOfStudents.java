package method;

public class MarkOfStudents {

	public static int[][] generateScore(int n){
        int[][] pcm = new int[n][3];
        for (int i = 0; i < n; i++){
            pcm[i][0] = (int)(Math.random() * 90) + 10;
            pcm[i][1] = (int)(Math.random() * 90) + 10;
            pcm[i][2] = (int)(Math.random() * 90) + 10;
        }        
        return pcm;
    }

    public static void main(String[] args){
        int stud = 5;        
        int[][] s = generateScore(stud);        
        for (int i = 0; i < stud; i++){
            int total = s[i][0] + s[i][1] + s[i][2];
            double avg = total / 3.0;            
            double per = (total / 300.0) * 100;
            System.out.println(s[i][0] + " " + s[i][1] + " " + s[i][2] +" Total=" + total +" Avg=" + Math.round(avg*100)/100.0 +" %=" + Math.round(per*100)/100.0);
        }
    }

}
