public class GreatestDifferenceFinder {
    int greatestDifference(int[] intArray) {
        // 코드를 입력하세요.
        if (intArray.length < 2) {
            return 0;
        }else {
            int small = intArray[0];
            int big = intArray[0];
            for (int i = 0; i < intArray.length; i++) {
                if (intArray[i] < small) {
                    small = intArray[i];
                }else if (intArray[i] > big) {
                    big = intArray[i];
                }
            }
            return big - small;
        }
    }
}