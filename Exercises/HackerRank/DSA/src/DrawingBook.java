import java.util.Scanner;

public class DrawingBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pages = Integer.parseInt(sc.nextLine());
        int page = Integer.parseInt(sc.nextLine());
        int minimumPages = pageCount(pages, page);
        System.out.println(minimumPages);

    }

    private static int pageCount(int n, int p) {
        return Math.min(p / 2, n / 2 - p / 2);
    }
}
