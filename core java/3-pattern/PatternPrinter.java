public class PatternPrinter {
    public static void main(String[] args) {
        int n = 5;
        int outerLimit = n / 2;
        int innerLimit = 0;
        int num = 3;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < outerLimit && j >= innerLimit && j < n - innerLimit) {
                    System.out.print(num + " ");
                } else if (i >= outerLimit && j <= innerLimit && j >= n - innerLimit - 1) {
                    System.out.print(num + " ");
                } else {
                    System.out.print("  ");
                }
            }
            if (i < outerLimit) {
                innerLimit++;
            } else {
                innerLimit--;
            }
            System.out.println();
        }
    }
}
