import java.util.ArrayList;
import java.util.List;

public class TeacherManager {

    List<Salary> salaries = new ArrayList<>();

    // Nhap thong tin ca nhan cua giao vien
    public void inputTeacherInfo() {
        Salary salary = new Salary();
        salary.inputInfo();
        salaries.add(salary);
    }

    // Hien thi thong tin giao vien
    public void showTeacherInfo() {
        for (Salary salary : salaries) {
            System.out.println(salary.toString());
        }
    }

    // Hiển thị thông tin giáo viên theo tên
    public void showTeacherInfoByName(String name){
        boolean k = false;
        for(Salary salary : salaries){
            if(salary.getTeacher().getName().equals(name)){
                k = true;
                System.out.println(salary);
            }
        }
        if(!k){
            System.out.println("Không tìm thấy tên giáo viên phù hợp !");
        }
    }

    // Tinh thuc linh theo ten
    public void findActualPayment(String name) {
        double actualPayment = 0;
        boolean k = false;
        for (Salary salary : salaries) {
            if (salary.getTeacher().getName().equals(name)) {
                k = true;
               actualPayment = salary.getActualPayment();
                System.out.println("Lương thực lĩnh của giáo viên " + name + " là : "+ actualPayment);
            }
        }
        if(!k){
            System.out.println("Không tìm thấy tên giáo viên phù hợp !");
        }
    }

    // In ra danh sach nhung can bo co luong thuc linh lon hon hoac bang 8 trieu
    public void showSalaryEqualsOrMoreThan8(){
        for(Salary salary: salaries){
            if(salary.getActualPayment()>=8){
                System.out.println(salary);;
            }
        }
    }
}
