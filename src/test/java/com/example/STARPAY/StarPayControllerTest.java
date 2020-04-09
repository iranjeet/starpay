package com.example.STARPAY;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.example.STARPAY.controller.StarPayController;
import com.example.STARPAY.dto.Request.RequestUserDetails;
import com.example.STARPAY.dto.generic.GenericResponse;
import com.example.STARPAY.services.StarPayService;

import junit.framework.Assert;

@RunWith(MockitoJUnitRunner.class)
public class StarPayControllerTest {
	
	@InjectMocks
	StarPayController controller;
	
	@Mock
	StarPayService starService;  
	
//	@Mock
//	RequestUserDetails req;
	@Test
	public void testAddUser() {
		GenericResponse genriResponse=new GenericResponse();
		genriResponse.setApiMessage("Done");
		genriResponse.setApiSucessStatus(true);
		RequestUserDetails req=new RequestUserDetails();
		req.setFirstName("jhgkjh");
		Mockito.when(starService.addUser(req)).thenReturn(genriResponse);
		
		Assert.assertEquals(genriResponse, controller.addUser(req));
//		
//		req.setFirstName();
//		Mockito.when(req);
	}
	

}
