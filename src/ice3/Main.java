package ice3;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee emp = new Employee("John", 40, 30.0);
        Manager mgr = new Manager("Paul", 40, 25.0, 2000);
        SalesAssociate assoc = new SalesAssociate("George", 40, 20.0, 1000);
        
        System.out.println("Employee pay based on 40hrs: " + emp.calculatePay());
        System.out.println("Manager pay based on 40hrs: " + mgr.calculatePay());
        System.out.println("Associate pay based on 40hrs: " + assoc.calculatePay());
    }
}