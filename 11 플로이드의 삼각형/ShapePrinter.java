public class ShapePrinter {
    public void printFloydsPyramid(int height) {
        // 코드를 입력하세요.
        int num = 1;
        int max = height * (height + 1) / 2;
        int length = String.valueOf(max).length();
        
        
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                int numLength = String.valueOf(num).length();
                if (numLength < length) {
                    for (int k = 1; k <= length - numLength; k++) {
                        System.out.print(" ");
                    }
                }
                System.out.print(num);
                System.out.print(" ");
                num++;
            }
            System.out.println();
        }
    }
}