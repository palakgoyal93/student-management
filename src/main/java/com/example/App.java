package com.example;

import com.example.data_access.StudentDao;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigFileName.class);
        StudentDao studentDao = context.getBean(StudentDao.class);

    }
}
