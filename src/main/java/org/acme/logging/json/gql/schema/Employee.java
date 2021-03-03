package org.acme.logging.json.gql.schema;

/**
 * @author Ivan Ou
 * @since 3/3/21
 */
public class Employee {

    private Integer workerId;

    private String name;

    public Integer getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
