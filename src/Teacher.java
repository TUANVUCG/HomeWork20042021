import java.util.Scanner;

public class Teacher {
    private String name;
    private String dateOfBirth;
    private String homeTown;

    public Teacher() {
    }

    public Teacher(String name, String dateOfBirth, String homeTown) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.homeTown = homeTown;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public void inputTeacherInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên giáo viên : ");
        name = sc.nextLine();
        System.out.print("Nhập ngày sinh : ");
        dateOfBirth = sc.nextLine();
        System.out.print("Nhập quê hương : ");
        homeTown = sc.nextLine();

    }

    @Override
    public String toString() {
        return "Tên giáo viên : " + name + "    " +
                "Ngày sinh : " + dateOfBirth + "    " +
                "Quê quán : " + homeTown + "    ";
    }
}
