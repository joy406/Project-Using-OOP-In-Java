import java.util.*;
public class Teacher  implements Feature {

    public String name;
    public String qualification;
    public String subject;
    public String add;

    @Override
    public void addDetail() {
        System.out.println("Name="+name);
        System.out.println("Teacher Qualifications="+qualification);
        System.out.println("Prefer Subject="+subject);
        System.out.println("Address="+add);
    }


    @Override
    public void getDetail() {
        System.out.println("Enter The Teacher Details=");
        System.out.println();
        System.out.println();
        System.out.println("Enter The Teacher Name=");
        Scanner sc=new Scanner(System.in);
        name=sc.nextLine();
        System.out.println("Enter The Teacher Qualification=");
        qualification=sc.nextLine();
        System.out.println("Enter The Prefer Subject=");
        subject=sc.nextLine();
        System.out.println("Enter The Address=");
        add=sc.nextLine();
    }


}
