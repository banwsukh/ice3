package ice3;

public class SalesAssociate extends Employee {
    
    private double _vacationPay;

        
        public SalesAssociate(String name, int numHours, double wages, double vacationPay) {
            super(name, numHours, wages);
            _vacationPay = vacationPay;
        }
        
        @Override
        public double calculatePay() {
            return this.get_numHours()* this.get_wages() + _vacationPay;
        }
        
        
	public double get_vacationPay() {
		return _vacationPay;
	}

	public void set_vacationPay(double vPay) {
		_vacationPay = vPay;
	}
        
        
}