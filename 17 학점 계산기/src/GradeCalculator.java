import java.util.ArrayList;

public class GradeCalculator {
    ArrayList<Course> Courses;
    public final String name;
    public double last_grade;
    public int last_credit;

    public GradeCalculator(String name, double last_grade, int last_credit) {
        this.name = name;
        this.last_grade = last_grade;
        this.last_credit = last_credit;
        Courses = new ArrayList<Course>();
    }

    public void addCourse(Course course) {
        Courses.add(course);
    }

    public void print() {
        double this_grade = 0;
        int this_credit = 0;
        for (Course course:Courses) {
            this_grade += course.getGrade() * course.getCredit();
            this_credit += course.getCredit();
        }
        double avg_grade = (this_grade + last_grade * last_credit) / (this_credit + last_credit);

        //System.out.println("직전 학기 성적: " + last_grade + " (총 " + last_credit +"학점)");
        System.out.printf("직전 학기 성적: %.1f (총 %d학점)\n", last_grade, last_credit);
        //System.out.println("이번 학기 성적: " + (this_grade / this_credit) + " (총 " + this_credit +"학점)");
        System.out.printf("이번 학기 성적: %.10f (총 %d학점)\n", (this_grade / this_credit), this_credit);
        //System.out.println("전체 예상 학점: " + avg_grade + " (총 " + (last_credit + this_credit) +"학점)");
        System.out.printf("전체 예상 학점: %.10f (총 %d학점)\n", avg_grade, (last_credit + this_credit));
    }
}