//package com.example.STARPAY;
//
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Date;
//
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.junit.MockitoJUnitRunner;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//
//import com.example.STARPAY.controller.StarPayController;
//import com.example.STARPAY.dto.Request.RequestUserDetails;
//import com.example.STARPAY.dto.generic.GenericResponse;
//import com.example.STARPAY.services.StarPayService;
//
//import junit.framework.Assert;
//
//@RunWith(SpringRunner.class)//(MockitoJUnitRunner.class)
//@SpringBootTest
//public class StarPayControllerTest {
//	
//	@InjectMocks
//	StarPayController controller;
//	
//	private MockMvc mockMvc;
//	
//	@Mock
//	StarPayService starService;  
//	
////	@Mock
////	RequestUserDetails req;
//	@Test
//	public void testCheck() {
//		String s1=Calendar.getInstance().getTimeZone()+":";
//		String s2=Calendar.getInstance().getTime()+"";
//		String s3="API's Are Working Properly :> Current Date And Time : " + new SimpleDateFormat().format(new Date())
//				+ s1 + s2;
//		String s4;
//		Mockito.when(s3).thenReturn(new String());
//		Assert.assertEquals(new String(), controller.ckecK());
//	}
//	
//	
//	
//	
//	@Test
//	public void testAddUser() {
//		GenericResponse genriResponse=new GenericResponse();
//		genriResponse.setApiMessage("Done");
//		genriResponse.setApiSucessStatus(true);
//		RequestUserDetails req=new RequestUserDetails();
//		req.setFirstName("jhgkjh");
//		Mockito.when(starService.addUser(req)).thenReturn(genriResponse);
//		
//		Assert.assertEquals(genriResponse, controller.addUser(req));
////		
////		req.setFirstName();
////		Mockito.when(req);
//	}
//	
//
//}
