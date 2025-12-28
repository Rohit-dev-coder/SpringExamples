package org.springtest.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MySQLDataSource implements DataSource{

    @Override
    public String[] getEmails() {
        String []emails= {"sachin@gmail.com","afroz@yahoo.co.in","ankit@gmail.com"};
        return emails;
    }
}
