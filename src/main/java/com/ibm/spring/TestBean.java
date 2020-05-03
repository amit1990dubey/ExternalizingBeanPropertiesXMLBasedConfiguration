package com.ibm.spring;

import javax.annotation.Resource;
import javax.annotation.Resources;


public class TestBean {

  @Resource(name = "oracleDS")
    DataSource oracleDataSource;

    public void show()
    {
        System.out.println(oracleDataSource);
    }
}
