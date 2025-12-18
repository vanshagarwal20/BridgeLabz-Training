package programming_elements;

public class PenDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalPens = 14;
        int stud = 3;
        int PensPerStudent = totalPens / stud;   
        int rmgPens = totalPens % stud;    
        System.out.println("The Pen Per Student is " + PensPerStudent +" and the remaining pen not distributed is " + rmgPens);
	}

}
