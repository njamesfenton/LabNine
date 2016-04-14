import java.text.DecimalFormat;

public class Circle {
	private double Radius;
	
	private String formatNumber(double x)
	{
		DecimalFormat df= new DecimalFormat("#.00");
		
		return (df.format(x));
	}
	
	public double getRadius() {
		return Radius;
	}
	public void setRadius(double radius) {
		Radius = radius;
	}
	public double getCircumference() {
		return 2 * Math.PI * Radius;
	}
	
	public double getArea() {
		return Math.PI * Radius * Radius;
	}
	
	public String getFormattedCircumference() {
		return formatNumber(getCircumference());
	}
	
	public String getFormattedArea() {
		DecimalFormat df = new DecimalFormat("#.00");
		return(df.format(getArea()));
	}


}
