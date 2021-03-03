package org.acme.logging.json.gql.schema;

import java.util.List;

/**
 * @author Ivan Ou
 * @since 3/3/21
 */
public class Department {

    private String name;

    private String code;

    private Department parent;

    private List<Employee> emplyees;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Department getParent() {
        return parent;
    }

    public void setParent(Department parent) {
        this.parent = parent;
    }

    public List<Employee> getEmplyees() {
        return emplyees;
    }

    public void setEmplyees(List<Employee> emplyees) {
        this.emplyees = emplyees;
    }
}
