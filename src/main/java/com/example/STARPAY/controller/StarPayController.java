package com.example.STARPAY.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.STARPAY.domain.StarPayUser;
import com.example.STARPAY.dto.Request.RequestAllFeature;
import com.example.STARPAY.dto.Request.RequestRd;
import com.example.STARPAY.dto.Request.RequestRetailerFeature;
import com.example.STARPAY.dto.Request.RequestUserDetails;
import com.example.STARPAY.dto.Response.ResponceRetailerFeature;
import com.example.STARPAY.dto.Response.ResponceUserDetails;
import com.example.STARPAY.dto.generic.GenericResponse;
import com.example.STARPAY.services.StarPayService;

@RestController
@RequestMapping("/starPay")
public class StarPayController {

	@Autowired
	StarPayService starService;

	// ------------------check------------------------------------------------
	@GetMapping("checK")
	public String ckecK() {
		String s1 = Calendar.getInstance().getTimeZone() + ":";
		String s2 = Calendar.getInstance().getTime() + "";
		return "API's Are Working Properly :> Current Date And Time : " + new SimpleDateFormat().format(new Date()) + s1
				+ s2;
	}

	// -------------------Add StarPAy user -------------------------------------

	@PostMapping("/addUser")
	public GenericResponse addUser(@RequestBody RequestUserDetails req) {
//		GenericResponse genericResponse=
		return starService.addUser(req);
	}

	// -------------------------get StrapayUser--------------------------------
	@GetMapping("/getUser")
	public List<ResponceUserDetails> getAllUser() {
		return starService.getAllUser();

	}

	// ------------get Button feature------------------------------
	@PostMapping("/getButton")
	public ResponceRetailerFeature getButtonFeature(@RequestBody RequestRetailerFeature Id) {
		ResponceRetailerFeature rep = new ResponceRetailerFeature();

		return starService.getButtonFeature(Id);
	}

	// ------------Set Button feature------------------

	@PostMapping("/SetButton")
	public GenericResponse setButtonFeature(@RequestBody RequestAllFeature Id) {
		return starService.setButtonFeature(Id);
	}
	
	//-------------------------Set RD --------------------
	@PostMapping("/setRd")
	public GenericResponse setRd(@RequestBody RequestRd rd) {
		return starService.setRd(rd);
		
	}

}
