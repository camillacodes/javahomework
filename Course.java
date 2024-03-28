package School;

public class Course {
    private String department;
    private int hours;
    private int coursenum;
    private int num3;
    public Course(String department, int hours, int coursenum){

            this.department = department;
            this.hours = hours;
            this.coursenum = coursenum;

    }

    @Override
    public String toString() {
        return "Department: " + department + ", Hours: " + hours + ", Course Number: " + coursenum;
    }

}
