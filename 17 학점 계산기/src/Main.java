public class Main {
    public static void main(String[] args) {
        GradeCalculator gradeCalc = new GradeCalculator("김신의", 4.0, 100);

        gradeCalc.addCourse(new Course("OOP", Course.CREDIT_MAJOR, "A+"));
        gradeCalc.addCourse(new Course("신호와시스템", Course.CREDIT_MAJOR, "A"));
        gradeCalc.addCourse(new Course("해석학", Course.CREDIT_MAJOR, "B+"));
        gradeCalc.addCourse(new Course("확률", Course.CREDIT_MAJOR, "A+"));
        gradeCalc.addCourse(new Course("스포츠댄스", Course.CREDIT_GENERAL, "A"));

        gradeCalc.print();
    }
}

        /*

        직전 학기 성적: 4.0 (총 100학점)
        이번 학기 성적: 4.1071428571 (총 14학점)
        전체 예상 학점: 4.0131578947 (총 114학점)

        */
