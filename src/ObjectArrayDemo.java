import java.util.Arrays;

//create an array of Student objects, print the array
//, sort the array
public class ObjectArrayDemo {
    public static void main(String[] args) {
        int[] arr = new int[]{10,200,30};
        System.out.println(Arrays.toString(arr));
        String[] srr = new String[5];
        System.out.println(Arrays.toString(srr));
        Student[] array = new Student[3];
        Student s1 = new Student();
        System.out.println(s1.getName());
        System.out.println(s1.getRollNo());
        s1.setName("Vaibhav");
        s1.setRollNo(11);
        System.out.println(s1.getName());
        System.out.println(s1.getRollNo());
        Student s2 = new Student();
        s2.setName("Ramesh");
        s2.setRollNo(5);
        Student s3 = new Student();
        s3.setRollNo(3);
        s3.setName("Amar");
        array[0] = s1;
        array[1] = s2;
        array[2] = s3;
        s1.toString();
        System.out.println(Arrays.toString(array));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(array);
    }
}
