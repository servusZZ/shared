package prioritization.data_objects;

import java.util.Set;

import prioritization.evaluation.ProjectEvaluationEntry;

public class FaultyVersion {
	private TestCase[] failures;
	private TestCase[] passedTCs;
	private Set<Fault> faults;
	private ProjectEvaluationEntry projectMetrics;
	
	public FaultyVersion(TestCase[] failures, TestCase[] passedTCs, Set<Fault> faults,
			ProjectEvaluationEntry projectMetrics) {
		this.failures = failures;
		this.passedTCs = passedTCs;
		this.faults = faults;
		this.projectMetrics = projectMetrics;
	}
	public String getFaultyVersionId() {
		return projectMetrics.getId();
	}
	/**	empty Constructor and getters and setters needed for serialization */
	public FaultyVersion() { }
	public TestCase[] getFailures() {
		return failures;
	}
	public void setFailures(TestCase[] failures) {
		this.failures = failures;
	}
	public TestCase[] getPassedTCs() {
		return passedTCs;
	}
	public void setPassedTCs(TestCase[] passedTCs) {
		this.passedTCs = passedTCs;
	}
	public Set<Fault> getFaults() {
		return faults;
	}
	public void setFaults(Set<Fault> faults) {
		this.faults = faults;
	}
	public ProjectEvaluationEntry getProjectMetrics() {
		return projectMetrics;
	}
	public void setProjectMetrics(ProjectEvaluationEntry projectMetrics) {
		this.projectMetrics = projectMetrics;
	}
}
