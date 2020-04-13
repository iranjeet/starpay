package com.example.STARPAY;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.example.STARPAY.controller.StarPayController;
import com.example.STARPAY.dao.RetailerFeatureDao;
import com.example.STARPAY.domain.RetailerFeature;
import com.example.STARPAY.domain.StarPayUser;
import com.example.STARPAY.dto.Request.RequestRetailerFeature;
import com.example.STARPAY.dto.Request.RequestUserDetails;
import com.example.STARPAY.dto.Response.ResponceRetailerFeature;
import com.example.STARPAY.dto.Response.ResponceUserDetails;
import com.example.STARPAY.dto.generic.GenericResponse;
import com.example.STARPAY.services.StarPayService;

import junit.framework.Assert;

@RunWith(SpringRunner.class) // (MockitoJUnitRunner.class)
@SpringBootTest
public class StarPayControllerTest {

	@InjectMocks
	StarPayController controller;

	private MockMvc mockMvc;

	@Mock
	StarPayService starService;

//	@Mock
//	RequestUserDetails req;

	@Test
	public void testCheck() {
		String s1 = Calendar.getInstance().getTimeZone() + ":";
		String s2 = Calendar.getInstance().getTime() + "";
		String s3 = "API's Are Working Properly :> Current Date And Time : " + new SimpleDateFormat().format(new Date())
				+ s1 + s2;
		String s4;
		// Mockito.when(s3).thenReturn(new String());
		Assert.assertEquals(s3, "API's Are Working Properly :> Current Date And Time : "
				+ new SimpleDateFormat().format(new Date()) + s1 + s2);
	}

	@Test
	public void testAddUser() {
		GenericResponse genriResponse = new GenericResponse();
		genriResponse.setApiMessage("Sucess");
		genriResponse.setApiSucessStatus(false);
		RequestUserDetails req = new RequestUserDetails();
		req.setFirstName("jhgkjh");
		req.setCompanyName("cdjoajdd");
		req.setLastName("dhgafjahuodilk");
		req.setGender("agfiukdsjhbo");
		req.setMobileNumber("i2u39828739");
		req.setStatus("Active");
		Mockito.when(starService.addUser(req)).thenReturn(genriResponse);

		Assert.assertEquals(genriResponse, controller.addUser(req));
//		
//		req.setFirstName();
//		Mockito.when(req);
	}

	@Test
	public void testGetAllUser() {
		ResponceUserDetails res = new ResponceUserDetails();
		List<ResponceUserDetails> rlist = new ArrayList<ResponceUserDetails>();
		List<StarPayUser> starpayUsers = new ArrayList<>();
		for (StarPayUser s : starpayUsers) {
			res.setId(2L);
			res.setFirstName("Ranjeet");
			res.setLastName("Kumar");
			res.setMobileNumber("uy3iui3y2o2");
			res.setGender("male");
			res.setStatus("Active");
			rlist.add(res);

		}
		Mockito.when(starService.getAllUser()).thenReturn(rlist);
		Assert.assertEquals(rlist, controller.getAllUser());

	}
	
	@Test
	public void testGetButtonFeature() {
		RetailerFeatureDao rDao=new RetailerFeatureDao();
		RequestRetailerFeature id=new RequestRetailerFeature();
		ResponceRetailerFeature feature=new ResponceRetailerFeature();
		List<ResponceRetailerFeature.Buttons> b1=new ArrayList<>();
//		RetailerFeature rFeature=rDao.getById(id);
		List<RetailerFeature> rList=new ArrayList<RetailerFeature>();
		for(RetailerFeature ref:rList) {
			ResponceRetailerFeature.Buttons b=new ResponceRetailerFeature.Buttons();
			b.setFeatureName("kajshdiak");
			b.setIsActive(true);
			b.setStatus("Done");
			b.setId(1L);
			b1.add(b);
		}
		Mockito.when(starService.getButtonFeature(id)).thenReturn(feature);
		Assert.assertEquals(feature, controller.getButtonFeature(id));
	}

}
