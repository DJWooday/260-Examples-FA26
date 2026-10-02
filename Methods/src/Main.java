public class Main {
    public static int maxInt(int a, int b) {
        return a >= b ? a : b;
    }

    public static void maxInt(int a, int b, int max) {
        max = a >= b ? a : b;
    }

    public static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length()-i-1)) {
                return false;
            }
        }
        return true;
    }

    public static void MoveLeftInGrid(char[] grid, int index) {
        if (index == 0) return;
        index -= 1;
        System.out.println(grid[index]);
    }

    public static void main(String[] args) {
        //double x=6.9, y=2.34;
        int x=6, y=1;
        int max = maxInt(x, y) + 5;
        System.out.println(max);

        System.out.println(isPalindrome("non p"));

        char[] grid = {'5', '9', '4'};
        int index = 1;
        MoveLeftInGrid(grid, index);
        System.out.println(index);

        max = -1;
        maxInt(x, y, max);
        System.out.println(max);



    }
}
