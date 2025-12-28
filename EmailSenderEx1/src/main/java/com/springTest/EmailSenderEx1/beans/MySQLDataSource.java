package com.springTest.EmailSenderEx1.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MySQLDataSource implements DataSource {

    @Override
    public String[] getEmails() {
        return new String[] {
                "alice@gmail.com",
                "bob@gmail.com"
        };
    }
}
