
package com.survey.loginservice;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.survey.loginservice.dao.AdminLoginDao;
import com.survey.loginservice.dao.LoginDao;
import com.survey.loginservice.entity.AdminLoginEntity;
import com.survey.loginservice.entity.LoginEntity;
import com.survey.loginservice.pojo.AdminDataPojo;
import com.survey.loginservice.pojo.AdminLoginPojo;
import com.survey.loginservice.pojo.LoginPojo;
import com.survey.loginservice.service.LoginServiceImpl;
@RunWith(SpringRunner.class)
@SpringBootTest
public class LoginServiceApplicationTests {
	@Autowired
private LoginServiceImpl loginservice;
	
@MockBean
private LoginDao dao;

@MockBean
private AdminLoginDao admindao;

	@Test
	void testInput() throws Exception {
		
		LoginEntity inputEntity = new LoginEntity(125,"ram","ram125");
		LoginPojo inputPojo = new LoginPojo(0,"ram","ram125");
		
		
		when(dao.findByUsernameAndPassword("ram","ram125")).thenReturn(inputEntity);
		ResponseEntity<LoginPojo> result=loginservice.checkUser(inputPojo);
		assertEquals(200, result.getStatusCodeValue());
	    assertEquals(true, result.hasBody());
	}
	/*	@Test
void AdmintestInput() throws Exception {
		
		AdminLoginEntity inputEntity = new AdminLoginEntity(44,"xyz","123");
		AdminLoginPojo inputPojo = new AdminLoginPojo(0,"xyz","123");
		
		
		when(admindao.findByUsernameAndPassword("xyz","123")).thenReturn(inputEntity);
		ResponseEntity<List<AdminDataPojo>> result=loginservice.checkAdmin(inputPojo);
		assertEquals(200, result.getStatusCodeValue());
	    assertEquals(true, result.hasBody());
	}*/

}
