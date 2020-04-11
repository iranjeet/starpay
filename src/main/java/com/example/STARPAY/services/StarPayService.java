package com.example.STARPAY.services;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.STARPAY.dao.AddressDao;
import com.example.STARPAY.dao.Assn_User_AddressDao;
import com.example.STARPAY.dao.Assn_User_FeaturesDao;
import com.example.STARPAY.dao.RetailerFeatureDao;
import com.example.STARPAY.dao.StarPayUserDao;
import com.example.STARPAY.domain.History;
import com.example.STARPAY.domain.RetailerFeature;
import com.example.STARPAY.domain.StarPayUser;
import com.example.STARPAY.dto.Request.RequestAllFeature;
import com.example.STARPAY.dto.Request.RequestRetailerFeature;
import com.example.STARPAY.dto.Request.RequestUserDetails;
import com.example.STARPAY.dto.Request.RequestUserDetails.Address;
import com.example.STARPAY.dto.Response.ResponceAddress;
import com.example.STARPAY.dto.Response.ResponceRetailerFeature;
import com.example.STARPAY.dto.Response.ResponceRetailerFeature.Buttons;
import com.example.STARPAY.dto.Response.ResponceUserDetails;
import com.example.STARPAY.dto.generic.GenericResponse;

@Service
@Transactional
public class StarPayService {
	@Autowired
	AddressDao aDao;

	@Autowired
	RetailerFeatureDao rDao;

	@Autowired
	StarPayUserDao uDao;

	@Autowired
	Assn_User_AddressDao assn_User_AddressDao;

	@Autowired
	Assn_User_FeaturesDao assn_User_FeaturesDao;

	private final Logger log = LoggerFactory.getLogger(StarPayService.class);

	public GenericResponse addUser(RequestUserDetails req) {
		// TODO Auto-generated method stub
		GenericResponse genericResponse = new GenericResponse();
		StarPayUser user = new StarPayUser();
		user.setFirstName(req.getFirstName());
		user.setLastName(req.getLastName());
		user.setGender(req.getGender());
		user.setStatus(req.getStatus());
		user.setMobileNumber(req.getMobileNumber());
		user.setCompanyName(req.getCompanyName());

//		List<RequestUserDetails.Address> rAddress=new ArrayList<RequestUserDetails.Address>();dele
//		Set<RequestUserDetails.Address> add=req.getAddress();
////		RequestUserDetails ad2=new RequestUserDetails();dele
//		Set<com.example.STARPAY.domain.Address> domainAdd = new HashSet<com.example.STARPAY.domain.Address>();
//		for(Address a: add) {
////			RequestUserDetails.Address ad1=new RequestUserDetails.Address();dele
//			com.example.STARPAY.domain.Address ad1=new com.example.STARPAY.domain.Address();
////			ad1.setId(a.getId());
//			ad1.setFullAddress(a.getFullAddress());
//			ad1.setCity(a.getCity());
//			ad1.setZipCode(a.getZincode());
//			ad1.setProvince(a.getProvince());
//			ad1.setAddressType(a.getAddressType());
////			ad1.setStarPayUser(user.setId(a.getUserId()));dele
//			domainAdd.add(ad1);
//			
//		}
//		user.setAddress(domainAdd);

//		user.setAddress(req.getAddress());

//		List<Address> address=new ArrayList<RequestUserDetails.Address>();
//		for(Address a:address) {
//			RequestUserDetails.Address ad1=new RequestUserDetails.Address();
//			ad1.setFullAddress(a.getFullAddress());
//			ad1.setCity(a.getCity());
//			ad1.setZincode(a.getZincode());
//			ad1.setProvince(a.getProvince());
//			ad1.setAddressType(a.getAddressType());
//			address.add(ad1);
//			
//		}
//		user.setAddress(address);
		uDao.create(user);
		genericResponse.setApiSucessStatus(true);
		genericResponse.setApiMessage("User-Added sucessfully");
		log.info("User Added sucessfully");
		return genericResponse;
	}

	public List<ResponceUserDetails> getAllUser() {
		ResponceUserDetails responce = new ResponceUserDetails();
		List<ResponceUserDetails> rlist = new ArrayList<ResponceUserDetails>();
		List<StarPayUser> starPayUser = uDao.getAllUser();
		for (StarPayUser s : starPayUser) {
			ResponceUserDetails res = new ResponceUserDetails();
			res.setId(s.getId());
			res.setFirstName(s.getFirstName());
			res.setLastName(s.getLastName());
			res.setGender(s.getGender());
			res.setMobileNumber(s.getMobileNumber());
			res.setStatus(s.getStatus());
//			res.setAddress(s.getAddress());			
			rlist.add(res);
		}

		return rlist;
	}

	public ResponceRetailerFeature getButtonFeature(RequestRetailerFeature id) {
		// TODO Auto-generated method stub
		ResponceRetailerFeature feature = new ResponceRetailerFeature();
		List<Buttons> b1 = new ArrayList<ResponceRetailerFeature.Buttons>();
		RetailerFeature kFeature = rDao.getById(id);
		List<RetailerFeature> bList = new ArrayList<RetailerFeature>();
		for (RetailerFeature ref : bList) {
			Buttons b = new ResponceRetailerFeature.Buttons();
			b.setId(ref.getId());
			b.setFeatureName(ref.getFeatureName());
			b.setStatus(ref.getStatus());
			b.setIsActive(ref.getIsActive());
			b1.add(b);
		}

		return feature;
	}

	public GenericResponse setButtonFeature(RequestAllFeature Id) {
		// TODO Auto-generated method stub
		List<RequestAllFeature> allFeatures=new ArrayList<RequestAllFeature>();
//		RetailerFeature feature=rDao.getAllRetailerFeature();
		
		
		GenericResponse genericResponse=new GenericResponse();
		genericResponse.setApiSucessStatus(true);
		genericResponse.setApiMessage("User-Added sucessfully");
		log.info("User Added sucessfully");
		return genericResponse;
	}

}
