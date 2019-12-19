package Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import org.junit.Test;
import Dec19.ComparingLists;
import Dec19.Employee;

public class TestComparingLists {

	@Test
	public void compare_equalLists() {
		Employee emp1 = new Employee();
		emp1.setId(1);
		emp1.setName("madan");
		Employee emp2 = new Employee();
		emp2.setId(2);
		emp2.setName("madssan");
		Employee emp3 = new Employee();
		emp3.setId(1);
		emp3.setName("madan");
		ArrayList<Employee> employees1 = new ArrayList<Employee>();
		employees1.add(emp1);
		employees1.add(emp2);
		ArrayList<Employee> employees2 = new ArrayList<Employee>();
		employees2.add(emp2);
		employees2.add(emp3);
		boolean result = ComparingLists.compareEmployeeLists(employees1, employees2);
		assertTrue(result);
	}

	@Test
	public void compare_unequalLists() {
		Employee emp1 = new Employee();
		emp1.setId(1);
		emp1.setName("madan");
		Employee emp2 = new Employee();
		emp2.setId(2);
		emp2.setName("madssan");
		ArrayList<Employee> employees1 = new ArrayList<Employee>();
		employees1.add(emp1);
		employees1.add(emp2);
		ArrayList<Employee> employees2 = new ArrayList<Employee>();
		employees2.add(emp2);
		employees2.add(emp2);
		boolean result = ComparingLists.compareEmployeeLists(employees1, employees2);
		assertFalse(result);
	}
}
