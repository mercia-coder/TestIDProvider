import java.util.ArrayList;
import java.util.List;

import identity.ApplicationException;
import identity.IdentityDataStore;
import identity.ResultSet;

public class Test {

	public static void main(String[] args) throws ApplicationException {


		List<ResultSet> dataSet = new ArrayList<ResultSet>();
		ResultSet data;

		// Test1
		data = new ResultSet("abc12","I1","D1");
		dataSet.add(data);

		String searchString = "abc12";
		IdentityDataStore idStore = new IdentityDataStore();
		ResultSet resultSet = idStore.getIdentity("validUser", "validPassword", searchString, dataSet);
		System.out.println("Test(1): Employee Details for ID = : " +searchString);
		System.out.println("\t\tName:  "+resultSet.getName());
		System.out.println("\t\tID:  "+resultSet.getId());
		System.out.println("\t\tDepartment:  "+resultSet.getDepartment());
		System.out.println("\t\tSubDepartment:  "+resultSet.getSubDepartment());

		// Test 2 and 3
		dataSet = new ArrayList<ResultSet>();
		data = new ResultSet("efg12","I1","D1","S-D1");
		dataSet.add(data);
		
		data = new ResultSet("abc12","I1","D1","Sub-D1");
		dataSet.add(data);

		
		searchString = "efg12";
		idStore = new IdentityDataStore();
		resultSet = idStore.getIdentity("validUser", "validPassword", searchString, dataSet);
		System.out.println("\nTest(2): Employee Details for ID = : " +searchString);
		System.out.println("\t\tName:  "+resultSet.getName());
		System.out.println("\t\tID:  "+resultSet.getId());
		System.out.println("\t\tDepartment:  "+resultSet.getDepartment());
		System.out.println("\t\tSubDepartment:  "+resultSet.getSubDepartment());

		searchString = "abc12";
		idStore = new IdentityDataStore();
		resultSet = idStore.getIdentity("validUser", "validPassword", searchString, dataSet);
		System.out.println("\nTest(3): Employee Details for ID = : " +searchString);
		System.out.println("\t\tName:  "+resultSet.getName());
		System.out.println("\t\tID:  "+resultSet.getId());
		System.out.println("\t\tDepartment:  "+resultSet.getDepartment());
		System.out.println("\t\tSubDepartment:  "+resultSet.getSubDepartment());

	}

}
