package io.pivotal.pal.tracker.sevices;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class EmployeeService {
    public Map<String,String> getEmployeeList(){
        Map<String,String> employeeList=new HashMap<>();
        employeeList.put("Krishna","Vamsi");
        employeeList.put("Pallavi","Rai");
        employeeList.put("Upesh","Sai");
        employeeList.put("Mohit","Agarwal");
        return employeeList;
    }
}
