import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TeacherManager teacherManager = new TeacherManager();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập lựa chọn của bạn");
        int choice = -1;
        do{
            menu();
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1 : {
                    teacherManager.inputTeacherInfo();
                    break;
                }
                case 2 : {
                    teacherManager.showTeacherInfo();
                    break;
                }
                case 3 : {
                    findInfoByName(teacherManager, sc);
                    break;
                }
                case 4: {
                    findSalaryByName(teacherManager, sc);
                    break;
                }
                case 5: {
                    teacherManager.showSalaryEqualsOrMoreThan8();
                }
            }

        }while ( choice !=0);
    }

    private static void findSalaryByName(TeacherManager teacherManager, Scanner sc) {
        System.out.print("Nhập tên giáo viên : ");
        String name = sc.nextLine();
        teacherManager.findActualPayment(name);
    }

    private static void findInfoByName(TeacherManager teacherManager, Scanner sc) {
        System.out.print("Nhập tên giáo viên cần tìm : ");
        String name = sc.nextLine();
        teacherManager.showTeacherInfoByName(name);
    }

    private static void menu() {
        System.out.println("1. Thêm thông tin một giáo viên mới");
        System.out.println("2. Hiển thị thông tin toàn bộ giáo viên ");
        System.out.println("3. Tìm giáo viên theo tên ");
        System.out.println("4. Tìm lương thực lĩnh của giáo viên theo tên");
        System.out.println("5. Danh sách giáo viên có lương thực lĩnh từ 8 triệu trở lên ");
        System.out.println("0. Thoát chương trình ");
        System.out.println("------------------------");
    }
}
