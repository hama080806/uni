import java.util.*;

public class grades {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int numOfS = 0;
        double average = 0.0;
        double highest = 0.0;
        int name = 0;

        System.out.println("please enter the number of students:");
        numOfS = in.nextInt();
        String[] students = new String[numOfS];
        double[] grades = new double[numOfS];

        for (int i = 0; i < numOfS; i++) {
            System.out.println("please enter the student name: ");
            students[i] = in.next();
            System.out.println("please enter the grade: ");
            grades[i] = in.nextDouble();
            if(grades[i] >=60 ){
            System.out.println(" pass");
        }
        else{
            System.out.println("fail");
        }
            if (grades[i] > highest) {
                highest = grades[i];
                name = i;
            }

        }


        average = calcAverage(grades);
        System.out.println("the average of the class is: " + average);
        System.out.println(students[name] + " has the hghest grade of: " + highestGrade(grades));
        
    }

    public static double calcAverage(double[] gr) {
        double total = 0.0;

        for (int i = 0; i < gr.length; i++) {
            total += gr[i];
        }
        return total / gr.length;
    }
    public static double highestGrade(double[] grade){
        double high=-1;
        for (int i=0;i<grade.length;i++){
          if (high < grade[i]){
            high = grade[i];
          }
        }
        return high;

    }
}
