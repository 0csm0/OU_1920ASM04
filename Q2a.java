//i)

class Q2a {
    public static void main(String[] args) {
        for (int i = 3; i >= 1; i--) {
            for (int j = (i * 3); j >= 1; j -= 1) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println();
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print("**");
            }
            System.out.println();
        }

    }
}