package Lecture1;

import java.util.Scanner;

public class ProjectsCreation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int projectsCount = Integer.parseInt(scanner.nextLine());
        int timeNeeded = projectsCount * 3;

        String result = String.format("The architect %s will need %s hours " +
                "to complete %s project/s.", name, timeNeeded, projectsCount);

        System.out.println(result);


    }
}
