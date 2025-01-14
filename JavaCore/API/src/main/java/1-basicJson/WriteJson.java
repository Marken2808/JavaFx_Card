import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class WriteJson {

    public void write() {
        //First Employee
        JSONObject employeeDetails = new JSONObject();
        employeeDetails.put("firstName", "Lokesh");
        employeeDetails.put("lastName", "Gupta");

        JSONObject employeeObject = new JSONObject();
        employeeObject.put("employee", employeeDetails);

        //Second Employee
        JSONObject employeeDetails2 = new JSONObject();
        employeeDetails2.put("firstName", "Tuan");
        employeeDetails2.put("lastName", "Nguyen");

        JSONObject employeeObject2 = new JSONObject();
        employeeObject2.put("employee", employeeDetails2);

        //Add employees to list
        JSONArray employeeList = new JSONArray();
        employeeList.add(employeeObject);
        employeeList.add(employeeObject2);

        //Write JSON file
        try (FileWriter file = new FileWriter("src/main/java/1-basicJson/employees.json")) {
            //We can write any JSONArray or JSONObject instance to the file
            file.write(employeeList.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
