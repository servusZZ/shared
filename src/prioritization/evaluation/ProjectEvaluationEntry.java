package prioritization.evaluation;

import org.apache.commons.lang3.StringUtils;

public class ProjectEvaluationEntry {
	private String id;
	private String projectName;
	private int faultsCount;
	private int failuresCount;
	private int failuresWithMultipleFaultsCount;
	private int passedTCsCount;
	/**	all relevant tests for D* calculation */
	private int testsCount;
	/**	all relevant methods for D* calculation */
	private int methodsCount;
	private int minTestSize;
	/**	the coveredMethods of the median of all Failures (median according to the TC size) */
	private double medianOfFailuresSize;
	/**	average value of the coveredMethods of all failures */
	private double averageFailureSize;
	private double ddu;
	private int faultsInSameClassPairsCount;
	private int faultsInSamePackagePairsCount;
	
	public ProjectEvaluationEntry() { }
	
	public ProjectEvaluationEntry(int id, String projectName, int faultsCount,
			int failuresCount, int failuresWithMultipleFaultsCount,
			int passedTCsCount, int methodsCount, int minTestSize,
			double medianOfFailuresSize, double averageFailureSize,
			int faultsInSameClassPairsCount, int faultsInSamePackagePairsCount) {
		this.id = projectName + "-" + id;
		this.projectName = projectName;
		this.faultsCount = faultsCount;
		this.failuresCount = failuresCount;
		this.failuresWithMultipleFaultsCount = failuresWithMultipleFaultsCount;
		this.passedTCsCount = passedTCsCount;
		this.testsCount = failuresCount + passedTCsCount;
		this.methodsCount = methodsCount;
		ddu = Double.NaN;
		this.minTestSize = minTestSize;
		this.medianOfFailuresSize = medianOfFailuresSize;
		this.averageFailureSize = averageFailureSize;
		this.faultsInSameClassPairsCount = faultsInSameClassPairsCount;
		this.faultsInSamePackagePairsCount = faultsInSamePackagePairsCount;
	}
	public String getHeader() {
		return "FaultyVersion-ID;ProjectName;#Faults;#Failures;#FailuresWithTwoFaults;#PassedTCs;#Tests;#Methods;DDU;MinTestSize;MedianFailureSize;AvgFailureSize;#FaultPairsSameClass;#FaultPairsSamePackage";
	}
	public String getValues() {
		return id + ";" + projectName +
				";" + faultsCount +
				";" + failuresCount + ";" + failuresWithMultipleFaultsCount +
				";" + passedTCsCount + ";" + testsCount + ";" + methodsCount +
				";" + getGermanRepresentation(ddu) +
				";" + minTestSize +
				";" + getGermanRepresentation(medianOfFailuresSize) +
				";" + getGermanRepresentation(averageFailureSize) +
				";" + faultsInSameClassPairsCount + ";" + faultsInSamePackagePairsCount;
	}
	private String getGermanRepresentation(double val) {
		return StringUtils.replaceChars("" + val, '.', ',');
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public int getFaultsCount() {
		return faultsCount;
	}

	public void setFaultsCount(int faultsCount) {
		this.faultsCount = faultsCount;
	}

	public int getFailuresCount() {
		return failuresCount;
	}

	public void setFailuresCount(int failuresCount) {
		this.failuresCount = failuresCount;
	}

	public int getPassedTCsCount() {
		return passedTCsCount;
	}

	public void setPassedTCsCount(int passedTCsCount) {
		this.passedTCsCount = passedTCsCount;
	}

	public int getTestsCount() {
		return testsCount;
	}

	public void setTestsCount(int testsCount) {
		this.testsCount = testsCount;
	}

	public int getMethodsCount() {
		return methodsCount;
	}

	public void setMethodsCount(int methodsCount) {
		this.methodsCount = methodsCount;
	}

	public int getMinTestSize() {
		return minTestSize;
	}

	public void setMinTestSize(int minTestSize) {
		this.minTestSize = minTestSize;
	}

	public double getDdu() {
		return ddu;
	}

	public void setDdu(double ddu) {
		this.ddu = ddu;
	}

	public int getFailuresWithMultipleFaultsCount() {
		return failuresWithMultipleFaultsCount;
	}

	public void setFailuresWithMultipleFaultsCount(int failuresWithMultipleFaultsCount) {
		this.failuresWithMultipleFaultsCount = failuresWithMultipleFaultsCount;
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

	public int getFaultsInSameClassPairsCount() {
		return faultsInSameClassPairsCount;
	}

	public void setFaultsInSameClassPairsCount(int faultsInSameClassPairsCount) {
		this.faultsInSameClassPairsCount = faultsInSameClassPairsCount;
	}

	public int getFaultsInSamePackagePairsCount() {
		return faultsInSamePackagePairsCount;
	}

	public void setFaultsInSamePackagePairsCount(int faultsInSamePackagePairsCount) {
		this.faultsInSamePackagePairsCount = faultsInSamePackagePairsCount;
	}
	
}
