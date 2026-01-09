package linked_list;

class StudentNode{	
	int RollNumber;
	String name;
	int age;
	String grade;
	StudentNode next;

	StudentNode(int rollNumber, String name, int age,String grade) {	
		RollNumber = rollNumber;
		this.name = name;
		this.age = age;
		this.grade=grade;
		this.next = null;
	}	
}

class StudentLinkedList{	
	StudentNode head;	
	void addBegining(int rollNumber, String name, int age,String grade) {		
		StudentNode node = new StudentNode(rollNumber,  name, age, grade);
		node.next=head;
		head=node;		
	}
	
	void addEnd(int rollNumber, String name, int age,String grade){
		StudentNode node =new StudentNode(rollNumber,name,age,grade);		
		if(head==null){
			head=node;
			return ;			
		}
		StudentNode temp=head;
		while(temp.next!=null){
			temp=temp.next;			
		}
		temp.next=node;
		
	}
	
	void addAtPosition(int pos,int rollNumber, String name, int age,String grade) {
		StudentNode node =new StudentNode(rollNumber,name,age,grade);		
		if(pos==0){			
			addBegining(rollNumber,name,age,grade);
			return ;			
		}		
		StudentNode temp=head;
		
		for(int i=1;i<pos-1 && temp!=null;i++){
			temp=temp.next;	
		}
		
		if(temp==null){
			System.out.println("Position out of range");
			return ;
		}
		
		node.next=temp.next;
		temp.next=node;
		
		
	}
	 // Delete by Roll Number
    public void deleteByRoll(int roll){
        if (head == null){
            System.out.println("List is empty");
            return;
        }

        // if head node is to be deleted
        if (head.RollNumber == roll){
            head = head.next;
            System.out.println("Student deleted");
            return;
        }

        StudentNode temp = head;

        while (temp.next != null && temp.next.RollNumber != roll){
            temp = temp.next;
        }

        if (temp.next == null){
            System.out.println("Student not found");
        }
        else{
            temp.next = temp.next.next;
            System.out.println("Student deleted");
        }
    }

    // Search by Roll Number
    public void search(int roll){
        StudentNode temp = head;
        while (temp != null){
            if (temp.RollNumber == roll){
                System.out.println("Student Found:");
                displayStudent(temp);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Student not found");
    }

    // Update grade
    public void updateGrade(int roll, String newGrade){
        StudentNode temp = head;
        while (temp != null){
            if (temp.RollNumber == roll){
                temp.grade = newGrade;
                System.out.println("Grade updated");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Student not found");
    }

    // Display all
    public void display(){
        if (head == null){
            System.out.println("No student records");
            return;
        }

        StudentNode temp = head;

        while (temp != null){
            displayStudent(temp);
            temp = temp.next;
        }
    }

    // Display one student
    private void displayStudent(StudentNode s){
        System.out.println("Roll: " + s.RollNumber + 
                           ", Name: " + s.name + 
                           ", Age: " + s.age + 
                           ", Grade: " + s.grade);
    }
	
	
}
  

public class StudentRecordManagement {
    public static void main(String[] args){
        StudentLinkedList list = new StudentLinkedList();

        list.addBegining(101, "Ravi", 20, "A");
        list.addEnd(102, "Neha", 21, "B");
        list.addEnd(103, "Amit", 19, "C");

        list.addAtPosition(2, 104, "Pooja", 22, "A");

        System.out.println("All Students:-");
        list.display();

        System.out.println("Searching Roll 102:-");
        list.search(102);

        System.out.println("Updating Grade of 103:-");
        list.updateGrade(103, "A+");

        System.out.println("Deleting Roll 101:-");
        list.deleteByRoll(101);

        System.out.println("Final List:");
        list.display();
    }
}