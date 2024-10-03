public class Arrays_as_functions_arguments {
    public static void update(int marks[], int nonchange) {
        nonchange =10;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        // Passing arrays as argument
        int marks[] = { 77, 88, 99 };
        int nonchange =5;
        update(marks, nonchange);
        // print
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");

        }
        System.out.println();
        System.out.println(nonchange);
    }
}
