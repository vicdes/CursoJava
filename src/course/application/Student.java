package course.application;

public class Student {
    public String name;
    public double firstGrade;
    public double secondGrade;
    public double thirdGrade;
    public double finalGrade;

    public String calculateFinalGrade() {
        this.finalGrade = this.firstGrade+this.secondGrade+this.thirdGrade;
        if (this.finalGrade >= 60.00) {
            return "\nPASS";
        } else {
            double missing = 60.00 - this.finalGrade;
            return "\nFAILED\nMISSING " + missing + " POINTS";
        }


    }

    public String toString() {
        return "FINAL GRADE = "
                + String.format("%.2f", this.finalGrade)
                + this.calculateFinalGrade();
    }
}
