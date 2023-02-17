package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.hibernate.tool.schema.SchemaToolingLogging.LOGGER;

@Service
public class EmployeeFacade {

    private EmployeeDao employeeDao;

    public EmployeeFacade(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public List<Employee> findEmployeeByName(String employeeLastName) throws NoDataException {

        List<Employee> employees = employeeDao.retrieveEmployeeByLastName(employeeLastName);

        if (employees.size() == 0) {
            LOGGER.error(NoDataException.ERROR_EMPLOYEE_NOT_FOUND);
            throw new NoDataException(NoDataException.ERROR_EMPLOYEE_NOT_FOUND);
        } else {
            if (employees.size() == 1) {
                LOGGER.info("Found employee");
            } else {
                LOGGER.info("Found employees");
            }
        }
        return employees;
    }
}

