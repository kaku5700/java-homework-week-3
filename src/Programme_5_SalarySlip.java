import java.util.Scanner;

public class Programme_5_SalarySlip {
    static int empID, basic;
    static String name;
    static float hra, ta, da, pf, gross;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//scanner declaration
        System.out.println("Please Enter Employee ID : ");
        empID = scan.nextInt();
        System.out.println("Please Enter Employee Name : ");
        name = scan.next();
        System.out.println("Please enter Basic Salary : ");
        basic = scan.nextInt();
        scan.close();//closing scanner
        calculation();
    }

    // Static method calculating different values
    public static void calculation() {
        hra = (basic * 10) / 100;
        da = (basic * 8) / 100;
        ta = (basic * 9) / 100;
        pf = (basic * 20) / 100;
        gross = ((basic + hra + ta + da) - pf);
        System.out.println("-----------------------------------------");
        System.out.println("|              SALARY SLIP               ");
        System.out.println("-----------------------------------------");
        System.out.println("| Employee ID     :" + empID);
        System.out.println("| Employee Name   :" + name);
        System.out.println("-----------------------------------------");
        System.out.println("| Basic Salary    :" + basic);
        System.out.println("| HRA 10%         :" + hra);
        System.out.println("| TA 8%           :" + ta);
        System.out.println("| DA 9%           :" + da);
        System.out.println("| PF -20&         :" + pf);
        System.out.println("-----------------------------------------");
        System.out.println("| Gross Salary    :" + gross);
        System.out.println("========================================");
    }
}


