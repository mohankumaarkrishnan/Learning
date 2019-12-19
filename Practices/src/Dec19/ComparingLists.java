package Dec19;

import java.util.ArrayList;

public class ComparingLists {

	public static boolean compareEmployeeLists(ArrayList<Employee> employees1, ArrayList<Employee> employees2) {
		if (employees1.size() != employees2.size()) {
			return false;
		}

		return employees1.containsAll(employees2) && employees2.containsAll(employees1);
	}

}
