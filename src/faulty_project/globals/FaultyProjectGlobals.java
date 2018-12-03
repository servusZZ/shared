package faulty_project.globals;

import prioritization.data_objects.FaultyVersion;

public class FaultyProjectGlobals {
	/**	must be set for every faulty version */
	
	//TODO: wieder nach ma-clustering verschieben, werden nur dort verwendet z.B. während Clustering Evaluation
	public static int methodsCount = 0;
	public static int failuresCount = 0;
//	public static int passedTestsCount = 0;
//	public static int testsCount = 0;
	
	public static void init(FaultyVersion faultyVersion) {
		FaultyProjectGlobals.methodsCount = faultyVersion.getProjectMetrics().getMethodsCount();
		FaultyProjectGlobals.failuresCount = faultyVersion.getFailures().length;
	}
}
