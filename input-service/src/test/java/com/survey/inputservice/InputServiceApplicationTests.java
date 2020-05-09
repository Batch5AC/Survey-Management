package com.survey.inputservice;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import com.survey.inputservice.dao.InputDao;
import com.survey.inputservice.entity.InputEntity;
import com.survey.inputservice.pojo.InputPojo;
import com.survey.inputservice.service.InputServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InputServiceApplicationTests {
	@Autowired
	private InputServiceImpl inputservice;

	@MockBean
	private InputDao dao;

	@Test
	void testInput() throws Exception {

		InputEntity inputEntity = new InputEntity(0, 123, 3, 3, 2, 4, 5, 4);
		InputPojo inputPojo = new InputPojo(0, 123, 3, 3, 2, 4, 5, 4);
		when(dao.save(inputEntity)).thenReturn(inputEntity);
		assertEquals(inputPojo, inputservice.addInput(inputPojo));

	}

}