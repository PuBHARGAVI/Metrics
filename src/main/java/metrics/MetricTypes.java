package metrics;
public enum MetricTypes {
	Centimeter("centimeter"),
    Meter("meter"),
    Kilometer("kilometer");
    private final String dimension;
    private MetricTypes(String dimension) {
        this.dimension = dimension;
    }
    public String getDimension() {
        return dimension;
    }
}
