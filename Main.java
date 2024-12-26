import java.util.*;
interface Feature
{
    public void addDetail();
    public void getDetail();
}

class Main {
    static void menu() {
        System.out.println();
        System.out.println("");
        System.out.println("            ----------WELCOME TO XYZ SCHOOL----------");
        System.out.println("");
        System.out.println("-----------------    PERFORM YOUR OPERATIONS    ------------------");
        System.out.println("");
        System.out.println("");
        System.out.print("1]  Add Students");
        System.out.print("     2]  Add Teachers");
        System.out.println("");
        System.out.println("");
        System.out.print("3]  Get Students");
        System.out.print("     4]  Get Teachers");
        System.out.println();
        System.out.println();
        System.out.println("----------EXIT FOR 0----------");

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        Student student[] = new Student[5];
        Teacher teacher[] = new Teacher[5];
        int student_counter = 0;
        int teacher_counter = 0;
        int choice=1002;
        while (choice!= 0) {
            menu();
            choice = sc.nextInt();
            while (choice != 9 && choice != 0) {
                switch (choice) {

                    case 1:
                        student[student_counter] = new Student();
                        student[student_counter].getDetail();
                        student_counter++;
                        System.out.println();
                        System.out.println("1].ADD NEW Student");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 2:
                        teacher[teacher_counter] = new Teacher();
                        teacher[teacher_counter].getDetail();
                        teacher_counter++;
                        System.out.println();
                        System.out.println("2].ADD NEW Teacher");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 3:
                        for (int i = 0; i < student_counter; i++) {
                            student[i].addDetail();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    case 4:
                        for (int i = 0; i < teacher_counter; i++) {
                            teacher[i].addDetail();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    default:
                        System.out.println("ENTER VALID CHOICE: ");
                        break;
                }
            }
        }
    }
}