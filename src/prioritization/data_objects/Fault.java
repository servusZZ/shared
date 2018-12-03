package prioritization.data_objects;

import java.util.List;

public class Fault implements Comparable<Fault>{
	public List<String> failures;
	public String id;
	
	public Fault() { }
	
	public Fault(String name, List<String> failures) {
		this.id = name;
		this.failures = failures;
	}
	@Override
	public String toString() {
		return id;
	}
	public String getClassName() {
		return id.split(":")[0];
	}
	public String getPackageName() {
		return getClassName().substring(0, getClassName().lastIndexOf('.'));
	}
	@Override
	public int compareTo(Fault f) {
		if (f == null) {
			return 1;
		}
		if (failures.size() > f.failures.size()) {
			return 1;
		} 
		if (failures.size() == f.failures.size()) {
			return 0;
		}
		return -1;
	}
}
