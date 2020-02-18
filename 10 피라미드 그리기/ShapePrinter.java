public class ShapePrinter {
    public void printPyramid(int height) {
        // 코드를 입력하세요.
        for (int k = 1; k <= height; k++) {
        
            for (int i = 1; i <= height - k; i++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * k - 1 ; j++) {
                System.out.print("*");
            }
            System.out.println();    
        }
    }
}