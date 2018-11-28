package pit.data_objects;

public class PitMethodUtils {
	private final static String METHOD_ID_SEPARATOR_CHAR = ":";
	public static String getMethodId(String className, String methodName, String methodTypeSignature) {
		return className + METHOD_ID_SEPARATOR_CHAR + methodName + METHOD_ID_SEPARATOR_CHAR + methodTypeSignature;
	}
}
