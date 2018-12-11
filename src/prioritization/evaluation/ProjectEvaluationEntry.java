package prioritization.evaluation;

public class ProjectEvaluationEntry {
	private String id;
	private String projectName;
	private int faultsCount;
	
	// general size metrics
	private int failuresCount;
	private int passedTCsCount;
	/**	all relevant methods for D* calculation */
	private int methodsCount;
	
	//fault specific metrics
	private int failuresWithMultipleFaultsCount;
	private int faultsInSameClassPairsCount;
	private int faultsInSamePackagePairsCount;
	
	//test suite metrics
	private TestSuiteEvaluationEntry testSuiteMetrics;
	
	public ProjectEvaluationEntry(int id, String projectName, int faultsCount,
			int failuresCount, int failuresWithMultipleFaultsCount,
			int passedTCsCount, int methodsCount,
			int faultsInSameClassPairsCount, int faultsInSamePackagePairsCount) {
		this.id = projectName + "-" + id;
		this.projectName = projectName;
		this.faultsCount = faultsCount;
		this.failuresCount = failuresCount;
		this.failuresWithMultipleFaultsCount = failuresWithMultipleFaultsCount;
		this.passedTCsCount = passedTCsCount;
		this.methodsCount = methodsCount;
		this.faultsInSameClassPairsCount = faultsInSameClassPairsCount;
		this.faultsInSamePackagePairsCount = faultsInSamePackagePairsCount;
	}
	public String getHeader() {
		return "FaultyVersion-ID;ProjectName;#Faults;#Failures;#FailuresWithTwoFaults;#PassedTCs;#Methods;#FaultPairsSameClass;#FaultPairsSamePackage" +
				";" + testSuiteMetrics.getHeader();
	}
	public String getValues() {
		return id + ";" + projectName +
				";" + faultsCount +
				";" + failuresCount + ";" + failuresWithMultipleFaultsCount +
				";" + passedTCsCount + ";" + methodsCount +
				";" + faultsInSameClassPairsCount + ";" + faultsInSamePackagePairsCount +
				";" + testSuiteMetrics.getValues();
	}
	

	public void setTestSuiteMetrics(TestSuiteEvaluationEntry testSuiteMetrics) {
		this.testSuiteMetrics = testSuiteMetrics;
	}
	
	/**	ONLY NEEDED FOR SERIALIZATION */
	public ProjectEvaluationEntry() { }
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

	public int getMethodsCount() {
		return methodsCount;
	}

	public void setMethodsCount(int methodsCount) {
		this.methodsCount = methodsCount;
	}

	public int getFailuresWithMultipleFaultsCount() {
		return failuresWithMultipleFaultsCount;
	}

	public void setFailuresWithMultipleFaultsCount(int failuresWithMultipleFaultsCount) {
		this.failuresWithMultipleFaultsCount = failuresWithMultipleFaultsCount;
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

	public TestSuiteEvaluationEntry getTestSuiteMetrics() {
		return testSuiteMetrics;
	}
}
