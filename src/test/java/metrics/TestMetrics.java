package metrics;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class TestMetrics {
	@Test
	public void testToCheckXCmEqualsToXCm() {
		double scaleValue1=1;
		double scaleValue2=1;
		boolean expectedValue=true;
		
		Metrics metric1=new Metrics(scaleValue1,MetricTypes.Centimeter);
		Metrics metric2=new Metrics(scaleValue2,MetricTypes.Centimeter);
		boolean actualValue=metric1.equals(metric2);
		
		assertEquals(expectedValue,actualValue);
		
	}
	
	@Test
	public void testToCheckXCmNotEqualsToYCm() {
		double scaleValue1=1;
		double scaleValue2=2;
		boolean expectedValue=false;
		
		Metrics metric1=new Metrics(scaleValue1,MetricTypes.Centimeter);
		Metrics metric2=new Metrics(scaleValue2,MetricTypes.Centimeter);
		boolean actualValue=metric1.equals(metric2);
		
		assertEquals(expectedValue,actualValue);
		
	}
	
	@Test
	public void testThrowsExceptionForZeroValue() {
		double scaleValue1=0;
		double scaleValue2=0;
		String expectedExceptionMessage="Value of Length cannot be Zero";
		Metrics metric1=new Metrics(scaleValue1,MetricTypes.Centimeter);
		Metrics metric2=new Metrics(scaleValue2,MetricTypes.Centimeter);
		metric1.equals(metric2);
		String actualExceptionMessage=metric1.getActualExceptionMessage();
		
		assertEquals(expectedExceptionMessage,actualExceptionMessage);
	}
	
	@Test
	public void testThrowsExceptionForNegativeValue() {
		double scaleValue1=-1;
		double scaleValue2=-2;
		String expectedExceptionMessage="Value of Length cannot be Negative";
		Metrics metric1=new Metrics(scaleValue1,MetricTypes.Centimeter);
		Metrics metric2=new Metrics(scaleValue2,MetricTypes.Centimeter);
		metric1.equals(metric2);
		String actualExceptionMessage=metric1.getActualExceptionMessage();
		
		assertEquals(expectedExceptionMessage,actualExceptionMessage);
	}
	
	@Test
	public void testToCheckXMetersEqualsToYCentimeters() {
		double scaleValue1=1;
		double scaleValue2=100;
		boolean expectedValue=true;
		
		Metrics metric1=new Metrics(scaleValue1,MetricTypes.Meter);
		Metrics metric2=new Metrics(scaleValue2,MetricTypes.Centimeter);
		boolean actualValue=metric2.compareTwoDifferentDimensions(metric1,metric2);
		
		assertEquals(expectedValue,actualValue);
	}
	@Test
	public void testToCheckXMetersNotEqualsToYCentimeters() {
		double scaleValue1=1;
		double scaleValue2=10;
		boolean expectedValue=false;
		
		Metrics metric1=new Metrics(scaleValue1,MetricTypes.Meter);
		Metrics metric2=new Metrics(scaleValue2,MetricTypes.Centimeter);
		boolean actualValue=metric1.compareTwoDifferentDimensions(metric1,metric2);
		
		assertEquals(expectedValue,actualValue);
	}
	
	@Test
	public void testToCheckXKilometersEqualsToYCentimeters() {
		double scaleValue1=0.001;
		double scaleValue2=100;
		boolean expectedValue=true;
		
		Metrics metric1=new Metrics(scaleValue1,MetricTypes.Kilometer);
		Metrics metric2=new Metrics(scaleValue2,MetricTypes.Centimeter);
		boolean actualValue=metric2.compareTwoDifferentDimensions(metric1,metric2);
		
		assertEquals(expectedValue,actualValue);
	}
	@Test
	public void testToCheckXKilometersNotEqualsToYCentimeters() {
		double scaleValue1=1;
		double scaleValue2=10;
		boolean expectedValue=false;
		
		Metrics metric1=new Metrics(scaleValue1,MetricTypes.Kilometer);
		Metrics metric2=new Metrics(scaleValue2,MetricTypes.Centimeter);
		boolean actualValue=metric1.compareTwoDifferentDimensions(metric1,metric2);
		
		assertEquals(expectedValue,actualValue);
	}
}

