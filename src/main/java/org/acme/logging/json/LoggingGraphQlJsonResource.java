package org.acme.logging.json;

import java.util.List;
import javax.inject.Inject;
import org.acme.logging.json.gql.schema.Department;
import org.acme.logging.json.service.EmployeeService;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;

/**
 * @author Ivan Ou
 * @since 3/3/21
 */
@GraphQLApi
public class LoggingGraphQlJsonResource {

    @Inject
    EmployeeService employeeService;

    @Query("allDepartments")
    @Description("get all department details")
    public List<Department> get() {
        return employeeService.allDepartment();

    }
}
