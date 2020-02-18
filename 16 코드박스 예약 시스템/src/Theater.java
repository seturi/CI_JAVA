public class Theater {
    private Seat[][] seats;

    private int rowCount, colCount;

    public Theater(int rowCount, int colCount) {
        if (rowCount > 26) {
            rowCount = 26; // number of alphabets
        }
        seats = new Seat[rowCount][colCount];
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                seats[i][j] = new Seat();
            }
        }

        this.rowCount = rowCount;
        this.colCount = colCount;
    }

    public boolean reserve(String name, char rowChar, int col, int numSeat) {
        // 여기에 코드를 작성하세요
        if (numSeat > colCount || getRowIndex(rowChar) >= rowCount || col + numSeat - 1 > colCount) {
            return false;
        }else {
            for (int i = 0; i < numSeat; i++) {
                Seat s = seats[getRowIndex(rowChar)][i + col - 1];
                if(s.isOccupied()) {
                    for (int j = 0; j < i; j++) {
                        seats[getRowIndex(rowChar)][j + col - 1].cancel();
                    }
                    return false;
                }
                s.reserve(name);
            }
            return true;
        }

    }

    public int cancel(String name) {
        // 여기에 코드를 작성하세요
        int count = 0;
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                Seat s = seats[i][j];
                if(s.isOccupied() && s.match(name)) {
                    s.cancel();
                    count++;
                }
            }
        }
        return count;
    }

    public int cancel(char rowChar, int col, int numSeat) {
        // 여기에 코드를 작성하세요
        int count = 0;
        for (int i = 0; i < numSeat; i++) {
            Seat s = seats[getRowIndex(rowChar)][i + col - 1];
            if (s.isOccupied()) {
                s.cancel();
                count++;
            }
        }
        return count;
    }


    public int getNumberOfReservedSeat() {
        // 여기에 코드를 작성하세요
        int count = 0;
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                Seat s = seats[i][j];
                if(s.isOccupied()) {
                    count++;
                }
            }
        }
        return count;
    }

    public void printSeatMatrix() {
        System.out.print("  ");
        for (int i = 1; i <= 9; i++) {
            System.out.print("  " + i);
        }
        System.out.println();

        for (int i = 0; i < rowCount; i++) {
            System.out.print((char) ('A' + i) + ": ");
            for (int j = 0; j < colCount; j++) {
                Seat s = seats[i][j];
                if (s.isOccupied()) {
                    System.out.print("[O]");
                } else {
                    System.out.print("[ ]");
                }
            }
            System.out.println();
        }
    }

    private int getRowIndex(char uppercaseChar) {
        return uppercaseChar - 'A';
    }
}