public class Grades {
    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.add(4);
        grades.add(4);
        grades.add(6);

        System.out.println(grades.lastGrade());
        System.out.println(grades.sumGrades(grades.grades));
        System.out.print(grades.averGrade());
    }

    private int[] grades;
    private int size;

    public Grades(){
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size]  = value;
        this.size++;
    }

    public int sumGrades(int [] grades) {

        int result = 0;
        for (int i = 0; i < grades.length; i++) {
            result = result + grades[i];
        }
        return result;
    }

    public int lastGrade() {
        int result =this.grades[this.size - 1];
        return result;
    }

    public double averGrade() {
        double result = 0;
        for (int i = 0; i < grades.length; i++) {
        result += grades[i];
        }
        return result/this.size;
    }

}




