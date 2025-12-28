package com.springTest.EmailSenderEx1.beans;

import org.springframework.stereotype.Component;

@Component
public class FileDataSource implements DataSource{

    @Override
    public String[] getEmails() {
        return new String[] {
                "FileAdmin@FDS.com",
                "Admin2@FDS.com"
        };
    }
}
