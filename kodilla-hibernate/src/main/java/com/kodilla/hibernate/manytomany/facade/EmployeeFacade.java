package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.hibernate.tool.schema.SchemaToolingLogging.LOGGER;

@Service
public class EmployeeFacade {
    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    public EmployeeFacade(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public List<Employee> findEmployeeByName(String employeeName) throws NoDataException {

        List<Employee> employees = employeeDao.findEmployeeByFirstname(employeeName);

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

