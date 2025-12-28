package org.springtest.beans;

import org.springframework.stereotype.Component;

@Component
public class FileDataSource implements DataSource{
    @Override
    public String[] getEmails() {
        String []emails= {"abc@gmail.com","efg@yahoo.co.in","xyz@gmail.com"};
        return emails;
    }
}
