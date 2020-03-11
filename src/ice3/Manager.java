package ice3;

public class Manager extends Employee {

	private double _bonus;

        
        public Manager(String name, int numHours, double wages, double bonus) {
            super(name, numHours, wages);
            _bonus = bonus;
        }
        
        @Override
        public double calculatePay() {
            return this.get_numHours()* this.get_wages() + _bonus;
        }
        
        
	public double get_bonus() {
		return _bonus;
	}

	public void set_bonus(double bonus) {
		_bonus = bonus;
	}

}