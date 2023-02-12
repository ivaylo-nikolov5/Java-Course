import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradingStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfGrades = Integer.parseInt(sc.nextLine());
        List<Integer> grades = readGrades(sc, numberOfGrades);
        List<Integer> finalGrades = calcFinalGrades(grades);

        System.out.println(finalGrades);
    }

    private static List<Integer> readGrades(Scanner sc, int numberOfGrades) {
        List<Integer> grades = new ArrayList<>();

        for (int i = 0; i < numberOfGrades; i++) {
            grades.add(Integer.parseInt(sc.nextLine()));
        }

        return grades;
    }

    private static List<Integer> calcFinalGrades(List<Integer> grades) {
        for (int i = 0; i < grades.size(); i++) {
            int currentGrade = grades.get(i);
            int remainder = 5 - currentGrade % 5;

            if (currentGrade != 0 && remainder < 3) {
                grades.set(i, currentGrade + remainder);

                currentGrade = grades.get(i);

                if (currentGrade < 40) {
                    grades.set(i, currentGrade - remainder);
                }
            }


        }

        return grades;
    }
}
