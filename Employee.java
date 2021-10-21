package Employee;
import java.util.Scanner;

public class Employee {
	int salary;
	int age;
	public void getinfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hey hello whatsup: ");
		salary = sc.nextInt();
		age = sc.nextInt();
	}
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.getinfo();
	}

}
