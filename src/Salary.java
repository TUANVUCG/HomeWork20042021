import java.util.Scanner;

public class Salary {

    private double salary;
    private double rewardMoney;
    private double punishMoney;
    public Teacher teacher = new Teacher();

    public Salary() {
    }

    public Salary(double salary, double rewardMoney, double punishMoney, Teacher teacher) {
        this.salary = salary;
        this.rewardMoney = rewardMoney;
        this.punishMoney = punishMoney;
        this.teacher = teacher;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getRewardMoney() {
        return rewardMoney;
    }

    public void setRewardMoney(double rewardMoney) {
        this.rewardMoney = rewardMoney;
    }

    public double getPunishMoney() {
        return punishMoney;
    }

    public void setPunishMoney(double punishMoney) {
        this.punishMoney = punishMoney;
    }

    public double getActualPayment() {
        return (this.salary + this.rewardMoney-this.punishMoney);
    }


    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void inputInfo(){
        teacher.inputTeacherInfo();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập lương cứng : ");
        salary = sc.nextDouble();
        sc.nextLine();
        System.out.print("Nhập tiền thưởng : ");
        rewardMoney = sc.nextDouble();
        sc.nextLine();
        System.out.print("Nhập tiền phạt : ");
        punishMoney = sc.nextDouble();
        sc.nextLine();

    }


    @Override
    public String toString() {
        return  teacher +"   "+
                "Lương cứng : " + salary +"   "+
                "Thưởng : " + rewardMoney +"   "+
                "Phạt : " + punishMoney +"   "+
                "Thực lĩnh : " + getActualPayment();
    }
}
