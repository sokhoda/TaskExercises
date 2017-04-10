
public class Runner {
    public static void main(String[] args) {
        Student.StudentBuilder builder = new Student.StudentBuilder();
        Student student =  builder
                .age(10)
                .marks(new int[]{10, 11, 12})
                .name("Alex")
                .build();

        System.out.println(student);

    }
}
