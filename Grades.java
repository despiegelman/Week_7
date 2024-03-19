import java.util.*;
public class Grades{
    public static void main(String[]args){
        int grade;
        String letterGrade;
        boolean passing;
        boolean gotAnF;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        grade = input.nextInt();
        input.close();
        gotAnF = false;
        letterGrade = "";
        if (grade >= 65) {
            passing = true;
            if (grade >= 97){
                letterGrade = "A+";
            }else if (grade >= 93){
                letterGrade = "A";
            }else if (grade >= 90){
                letterGrade = "A-";
            }else if (grade >= 87){
                letterGrade = "B+";
            }else if (grade >= 83){
                letterGrade = "B";
            }else if (grade >= 80){
                letterGrade = "B-";
            }else if (grade >= 77){
                letterGrade = "C+";
            }else if (grade >= 73){
                letterGrade = "C";
            }else if (grade >= 70){
                letterGrade = "C-";
            }else if (grade >= 67){
                letterGrade = "D+";
            }else if (grade >= 65){
                letterGrade = "D";
            }
        }else{
            passing = false;
            if (grade >= 60) {
                letterGrade = "D+";
            }else{
                letterGrade = "F";
                gotAnF = true;
            }
        }if (passing == true){
            System.out.println("Congratulations, you're passing! Your letter grade is " + letterGrade);
            System.out.println("and you didn't get an F!");
        }else{
            System.out.println("Sorry, you're failing. Your letter grade is " + letterGrade);
            if (gotAnF == false){
                System.out.println("But you didn't get an F!");
            }else{
                System.out.println("Maybe consider tutoring");
            }
        }
    }
}