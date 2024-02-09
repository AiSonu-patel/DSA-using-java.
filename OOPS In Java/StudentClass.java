/**
 * StudentClass
 */
public class StudentClass {

    public static class Students{
        String Name;
        int RollNumber;
        double percent;
    }
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.Name = "Sonu";
        s1.RollNumber = 101;
        s1.percent = 80.5;

        System.out.println(s1.Name);
    }
}