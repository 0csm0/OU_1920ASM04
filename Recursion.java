public class Recursion {
    static char[] alphabet = "zyxwvutsrqponmlkjihgfedcba".toCharArray();
    
    public static void recursivePrint(int count) {
        if (count > 0) {
            for (int i = 0; i< count; i++) {
                System.out.print(alphabet[i] + " ");
            }
            System.out.println();
           recursivePrint(count - 1);
        }
    }

}