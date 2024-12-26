import java.util.*;
public class Student  implements Feature {

    public String name;
    public int dob;
    public int standard;
    public String fathername;
    public String mothername;
    public String add;

    @Override
    public void addDetail() {

        System.out.println("Name="+name);
        System.out.println("Father Name="+fathername);
        System.out.println("Mother Name="+mothername);
        System.out.println("Date Of Birth="+dob);
        System.out.println("Class="+standard);
        System.out.println("Address="+add);
    }

    @Override
    public void getDetail() {
        System.out.println("-----------ENTER THE STUDENTS DETAILS-----------");
        System.out.println();
        System.out.println();
        System.out.println("Enter The Student Name=");
        Scanner sc=new Scanner(System.in);
        name=sc.nextLine();
        System.out.println("Enter The Father Name=");
        fathername=sc.nextLine();
        System.out.println("Enter The Mother Name=");
        mothername=sc.nextLine();
        System.out.println("Enter The Age=");
        dob=sc.nextInt();
        System.out.println("Enter The Class ");
        standard=sc.nextInt();
        System.out.println("Enter The Address");
        add=sc.nextLine();


    }
}
