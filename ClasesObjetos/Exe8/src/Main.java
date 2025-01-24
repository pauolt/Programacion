
class students {
    String name;
    float[] marks = {};

    void student (String name, float[] marks) {
        this.name = name;
        this.marks = marks;

    }

    boolean updateMarks (float mark, int numsubject) {
        if ((mark > 0 && mark < 10) && (numsubject > 0 && numsubject < marks.length)){
            marks[numsubject] = mark;
            return true;
        }
        return false;
    }

    String getMarks () {
        String info = "";
        float average = 0;
        for (float mark : marks) {
            info += mark + " | ";
            average += mark;
        }
        average = average/marks.length;

        return "Name: " + name + "\nMarks: " + info + "\nAvg: " + average;
    }

}

public class Main {
    public static void main(String[] args) {

        students student1 = new students();
        students student2 = new students();

        float[] marks1 = {5.4f, 6.4f, 9.2f, 4.8f};
        float[] marks2 = {7.2f, 2.7f, 10.0f, 8.3f};

        student1.student("Paco", marks1);
        student2.student("Kiko", marks2);

        System.out.println(student1.getMarks());
        System.out.println();
        System.out.println(student2.getMarks());
        System.out.println();

        System.out.println(student1.updateMarks(7.6f, 2));
        System.out.println(student2.updateMarks(6.2f, 1));

        System.out.println(student1.getMarks());
        System.out.println();
        System.out.println(student2.getMarks());
        System.out.println();


    }
}