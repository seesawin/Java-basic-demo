package tw.com.seesawin.ex05;


public class Oop1 {
	public static void main(String[] args) {
		Manager manager = new Manager(); 
		manager.writeReport();
		
	}
}

class Manager {
	private Employee employee = new Employee();
	public void writeReport() {
		employee.writeReport();
	}
}
class Employee {
	public void writeReport() {
		
	}
}
