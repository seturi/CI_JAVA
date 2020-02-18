public class Course {
    private String subject;
    private int credit;
    private String gradeChar;
    public static final int CREDIT_MAJOR = 3;
    public static final int CREDIT_GENERAL = 2;

    public Course(String subject, int credit, String gradeChar) {
        this.subject = subject;
        this.credit = credit;
        this.gradeChar = gradeChar;
    }

    public double gradeCharTograde(String gradeChar) {
        switch (gradeChar){
            case ("A+"):
                return 4.5;
            case ("A"):
                return 4.0;
            case ("B+"):
                return 3.5;
            case ("B"):
                return 3.0;
            case ("C+"):
                return 2.5;
            case ("C"):
                return 2.0;
            case ("D+"):
                return 1.5;
            case ("D"):
                return 1.0;
            default:
                return 0.0;
        }
    }

    public  double getGrade() {
        return gradeCharTograde(gradeChar);
    }

    public int getCredit() {
        return credit;
    }
}