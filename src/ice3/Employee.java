package ice3;

public class Employee {

	private String _name;
	private int _numHours;
	private double _wages;

        public Employee(String name, int numHours, double wages) {
            _name = name;
            _numHours = numHours;
            _wages = wages;
        }
        
        public double calculatePay() {
            return _numHours * _wages;
        }
        
	public String get_name() {
		return _name;
	}


	public int get_numHours() {
		return _numHours;
	}

	/**
	 * 
	 * @param _hours
	 */
	public void set_numHours(int _hours) {
		_numHours = _hours;
	}

	public double get_wages() {
		return _wages;
	}

	/**
	 * 
	 * @param _wages
	 */
	public void set_wages(double _wages) {
		_wages = _wages;
	}
        
        
}