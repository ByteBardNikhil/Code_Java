package Practice;

public class TestStatic {

    public static void main(String[] args) {
        Faculty f1 = new Faculty("Ram", "Math");
        Faculty f2 = new Faculty("Ramesh", "English");
        System.out.println("Total Number of Faculties : "+Faculty.count);
    }
}

class Faculty {

    private String name, sub;
    public static int count;

    public Faculty(String name, String sub) {
        this.name = name;
        this.sub = sub;
        count++;
    }

}
