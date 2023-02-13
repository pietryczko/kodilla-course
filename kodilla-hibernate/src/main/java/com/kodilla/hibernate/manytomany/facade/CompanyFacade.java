package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.hibernate.tool.schema.SchemaToolingLogging.LOGGER;

@Service
public class CompanyFacade {
    @Autowired
    private CompanyDao companyDao;

    @Autowired
    public CompanyFacade(CompanyDao companyDao){
        this.companyDao = companyDao;
    }

    public List<Company> findCompanyByName(String companyName) throws NoDataException {

        List<Company> companies = companyDao.findCompanyByNameFragment(companyName);

        if (companies.size()==0){
            LOGGER.error(NoDataException.ERROR_COMPANY_NOT_FOUND);
            throw new NoDataException(NoDataException.ERROR_COMPANY_NOT_FOUND);
        } else {
            if (companies.size() == 1) {
                LOGGER.info("Found company");
            } else {
                LOGGER.info("Found companies");
            }
        }
        return companies;
    }
}
