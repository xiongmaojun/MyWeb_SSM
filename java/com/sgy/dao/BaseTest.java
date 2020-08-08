package com.sgy.dao;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:com/sgy/dao/SpringBeans.xml" , "classpath:com/sgy/service/SpringBeans.xml"})
public class BaseTest {

}
