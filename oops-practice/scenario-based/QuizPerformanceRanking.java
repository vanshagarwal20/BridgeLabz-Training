package practice_problems;

import java.util.*;

class Student {
    String name, dept;
    int q1, q2, q3;

    Student(String name, String dept, int q1, int q2, int q3){
        this.name = name;
        this.dept = dept;
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
    }

    int total(){
        return q1 + q2 + q3;
    }
}

public class QuizPerformanceRanking {
	
	public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        List<Student> list = new ArrayList<>();

        for(int i = 0; i < n; i++){

            String line = sc.nextLine();
            String[] parts = line.split(" ");

            if(parts[0].equals("Record")){

                String name = parts[1];
                String dept = parts[2];
                int q1 = Integer.parseInt(parts[3]);
                int q2 = Integer.parseInt(parts[4]);
                int q3 = Integer.parseInt(parts[5]);

                list.add(new Student(name, dept, q1, q2, q3));

                System.out.println("Record Added: " + name);
            }

            else if(parts[0].equals("Top")){

                if(list.isEmpty()){
                    System.out.println("No Records Available");
                    continue;
                }

                String type = parts[1];

                // Department wise
                if(type.equals("Engineering") || type.equals("Electronics")){

                    boolean found = false;
                    int max = Integer.MIN_VALUE;

                    for(Student s : list){
                        if(s.dept.equals(type)){
                            found = true;
                            max = Math.max(max, s.total());
                        }
                    }

                    if(!found){
                        System.out.println("Department Not Found");
                        continue;
                    }

                    for(Student s : list){
                        if(s.dept.equals(type) && s.total() == max){
                            System.out.println(s.name + " " + max);
                        }
                    }
                }

                // Quiz wise
                else{

                    int max = Integer.MIN_VALUE;

                    if(type.equals("Q1")){
                        for(Student s : list)
                            max = Math.max(max, s.q1);

                        for(Student s : list)
                            if(s.q1 == max)
                                System.out.println(s.name + " " + max);
                    }

                    else if(type.equals("Q2")){
                        for(Student s : list)
                            max = Math.max(max, s.q2);

                        for(Student s : list)
                            if(s.q2 == max)
                                System.out.println(s.name + " " + max);
                    }

                    else if(type.equals("Q3")){
                        for(Student s : list)
                            max = Math.max(max, s.q3);

                        for(Student s : list)
                            if(s.q3 == max)
                                System.out.println(s.name + " " + max);
                    }
                }
            }
        }
    }

}
