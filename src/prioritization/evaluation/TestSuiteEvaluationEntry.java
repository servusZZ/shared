package prioritization.evaluation;

import org.apache.commons.lang3.StringUtils;

public class TestSuiteEvaluationEntry {
	/**	all relevant tests for D* calculation */
	private int testsCount;
	private int minTestSize;
	/**	the coveredMethods of the median of all Failures (median according to the TC size) */
	private double medianOfFailuresSize;
	/**	average value of the coveredMethods of all failures */
	private double averageFailureSize;
	private double ddu;
	private double normalizedDensity;
	private double diversity;
	private double uniqueness;

	public TestSuiteEvaluationEntry(int testsCount, int minTestSize, double medianOfFailuresSize,
			double averageFailureSize, double ddu, double normalizedDensity, double diversity, double uniqueness) {
		this.testsCount = testsCount;
		this.minTestSize = minTestSize;
		this.medianOfFailuresSize = medianOfFailuresSize;
		this.averageFailureSize = averageFailureSize;
		this.ddu = ddu;
		this.normalizedDensity = normalizedDensity;
		this.diversity = diversity;
		this.uniqueness = uniqueness;
	}
	public String getHeader() {
		return "#Tests;minTestSize;MedianFailuresSize;AvgFailuresSize;DDU;nDensity;Diversity;Uniqueness";
	}
	public String getValues() {
		return testsCount + ";" + minTestSize +
				";" + getGermanRepresentation(medianOfFailuresSize) + 
				";" + getGermanRepresentation(averageFailureSize) + 
				";" + getGermanRepresentation(ddu) + 
				";" + getGermanRepresentation(normalizedDensity) + 
				";" + getGermanRepresentation(diversity) + 
				";" + getGermanRepresentation(uniqueness);
	}
	
	private String getGermanRepresentation(double val) {
		return StringUtils.replaceChars("" + val, '.', ',');
	}
	
	/**	ONLY NEEDED FOR SERIALIZATION */
	public TestSuiteEvaluationEntry() { }
	public int getMinTestSize() {
		return minTestSize;
	}
	public void setMinTestSize(int minTestSize) {
		this.minTestSize = minTestSize;
	}
	public double getMedianOfFailuresSize() {
		return medianOfFailuresSize;
	}
	public void setMedianOfFailuresSize(double medianOfFailuresSize) {
		this.medianOfFailuresSize = medianOfFailuresSize;
	}
	public double getAverageFailureSize() {
		return averageFailureSize;
	}
	public void setAverageFailureSize(double averageFailureSize) {
		this.averageFailureSize = averageFailureSize;
	}
	public double getDdu() {
		return ddu;
	}
	public void setDdu(double ddu) {
		this.ddu = ddu;
	}
	public int getTestsCount() {
		return testsCount;
	}
	public void setTestsCount(int testsCount) {
		this.testsCount = testsCount;
	}
	public double getNormalizedDensity() {
		return normalizedDensity;
	}
	public void setNormalizedDensity(double normalizedDensity) {
		this.normalizedDensity = normalizedDensity;
	}
	public double getDiversity() {
		return diversity;
	}
	public void setDiversity(double diversity) {
		this.diversity = diversity;
	}
	public double getUniqueness() {
		return uniqueness;
	}
	public void setUniqueness(double uniqueness) {
		this.uniqueness = uniqueness;
	}
}

