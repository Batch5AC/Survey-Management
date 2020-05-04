package com.survey.loginservice;

import java.util.Collections;

import javax.ws.rs.core.MediaType;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.survey.loginservice.dao.LoginDao;


@RunWith(SpringRunner.class)
@SpringBootTest
class LoginServiceApplicationTests {
	
	@Autowired
	MockMvc mockMvc;
	
	@MockBean
	LoginDao loginDao;

//	@Test
/*	void contextLoads() throws Exception{
		Mockito.when(loginDao.findAll().thenReturn(
				Collections.emptyList()
				);
		MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/login/user")
				.accept(MediaType.APPLICATION_JSON)
				).andReturn();
		
		Mockito.verify(loginDao.findAll();
	} */

}
