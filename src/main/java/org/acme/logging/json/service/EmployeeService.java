package org.acme.logging.json.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import org.acme.logging.json.gql.schema.Department;
import org.acme.logging.json.gql.schema.Employee;

/**
 * @author Ivan Ou
 * @since 3/3/21
 */
@ApplicationScoped
public class EmployeeService {
    
    public List<Department> allDepartment(){
        Employee e1 = new Employee();
        e1.setWorkerId(1);
        e1.setName("ivan");
        Employee e2 = new Employee();
        e2.setWorkerId(2);
        e2.setName("qmo");
        Employee e3 = new Employee();
        e3.setWorkerId(3);
        e3.setName("gary");
        Department d = new Department();
        d.setCode("HQ");
        d.setName("總部");
        d.setEmplyees(Collections.singletonList(e1));
        Department d1 = new Department();
        d1.setCode("RD");
        d1.setName("研發");
        d1.setParent(d);
        d1.setEmplyees(Arrays.asList(e2,e3));
        return Arrays.asList(d,d1);
    }
}
