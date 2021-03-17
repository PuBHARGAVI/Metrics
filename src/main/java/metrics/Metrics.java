package metrics;

import metrics.ZeroValueException;

public class Metrics<MetricTypes> {
	private double scaleValue;
	private MetricTypes dimension;
	private String actualExceptionMessage;
	
	public String getActualExceptionMessage() {
		return actualExceptionMessage;
	}
	public void setActualExceptionMessage(String actualExceptionMessage) {
		this.actualExceptionMessage = actualExceptionMessage;
	}
	public Metrics(double value,MetricTypes centimeter) {
		this.scaleValue=value;
		this.dimension=centimeter;
	}
	private void checkForZeroValueException() throws ZeroValueException {
		setActualExceptionMessage("Value of Length cannot be Zero");
        throw new ZeroValueException("Value of Length cannot be Zero");
    }
	private void checkForNegativeValueException() throws NegativeValueException {
		setActualExceptionMessage("Value of Length cannot be Negative");
        throw new NegativeValueException("Value of Length cannot be Negative");
    }
	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		Metrics metricobj=(Metrics)o;
		if(scaleValue==0 || metricobj.scaleValue==0) {
			try {
				checkForZeroValueException();
			} catch (ZeroValueException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
		else if(scaleValue<0 || metricobj.scaleValue<0) {
			try {
				checkForNegativeValueException();
			} catch (NegativeValueException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(dimension==metricobj.dimension && scaleValue==metricobj.scaleValue)
			return true;
		return false;
	}
	
	
}
