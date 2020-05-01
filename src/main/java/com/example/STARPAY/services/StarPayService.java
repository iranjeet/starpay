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
import com.example.STARPAY.dao.BayaditoDao;
import com.example.STARPAY.dao.BillPaymentTransactionDao;
import com.example.STARPAY.dao.EMoneySetLimitDao;
import com.example.STARPAY.dao.EmoneyServiceDao;
import com.example.STARPAY.dao.HistoryDao;
import com.example.STARPAY.dao.PdDao;
import com.example.STARPAY.dao.PortalUserHistoryDao;
import com.example.STARPAY.dao.RdDao;
import com.example.STARPAY.dao.RetailerFeatureDao;
import com.example.STARPAY.dao.StarPayUserDao;
import com.example.STARPAY.dao.WalletDao;
import com.example.STARPAY.domain.RetailerFeature;
import com.example.STARPAY.domain.StarPayUser;
import com.example.STARPAY.domain.Wallet;
import com.example.STARPAY.dto.Request.RequestAllFeature;
import com.example.STARPAY.dto.Request.RequestPortalUserManagement;
import com.example.STARPAY.dto.Request.RequestRd;
import com.example.STARPAY.dto.Request.RequestRetailerFeature;
import com.example.STARPAY.dto.Request.RequestUserDetails;
import com.example.STARPAY.domain.AccessType;
import com.example.STARPAY.domain.Address;
import com.example.STARPAY.domain.Bayadito;
import com.example.STARPAY.domain.BillPaymentTransaction;
import com.example.STARPAY.domain.EMoneyService;
import com.example.STARPAY.domain.EMoneySetLimit;
import com.example.STARPAY.domain.PD;
import com.example.STARPAY.domain.PortalUserHistory;
import com.example.STARPAY.domain.Rd;
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
	RetailerFeatureDao fDao;

	@Autowired
	StarPayUserDao uDao;
	
//	@Autowired//XXX No mapping placed till date 1-5-2020 11:45 pm
//	BayaditoDao bayaditoDao;
	
	@Autowired
	BillPaymentTransactionDao billPaymentTransactionDao;
	
	@Autowired
	EmoneyServiceDao emoneyServiceDao;
	
	@Autowired
	EMoneySetLimitDao eMoneySetLimitDao;
	
	@Autowired
	HistoryDao historyDao;
	
	@Autowired
	PdDao pdDao;
	
	@Autowired
	PortalUserHistoryDao portalUserHistoryDao;
	
	@Autowired
	RdDao rdDao;
	
	@Autowired
	RetailerFeatureDao retailerFeatureDao;
	
	@Autowired
	WalletDao walletDao;		


	private final Logger log = LoggerFactory.getLogger(StarPayService.class);

	public GenericResponse addUser(RequestUserDetails req) {
		// TODO Auto-generated method stub
		GenericResponse genericResponse = new GenericResponse();
		StarPayUser user = new StarPayUser();
		Address address = new Address();
		user.setFirstName(req.getFirstName());
		user.setLastName(req.getLastName());
		user.setGender(req.getGender());
//		 user.setStatus(req.getStatus());
		user.setAccess(req.getUserAccess());
		user.setMobileNumber(req.getMobileNumber());
		user.setCompanyName(req.getCompanyName());
		uDao.create(user);
		log.info("User Added sucessfully");
		address.setCity(req.getCity());
		address.setAddressType(req.getAddressType());
		address.setZipCode(req.getZipcode());
		address.setProvince(req.getProvince());
		address.setFullAddress(req.getFullAddress());
		address.setAcess(req.getAddressAccess());
		address.setStarPayUser(user);// Pasiing all the Obect The Orm automaticall Understand About we are talking
										// about Key
										// which is in our case Id Of the User is being set to the address
		aDao.create(address);
		log.info("User-Address Added sucessfully");
		genericResponse.setApiSucessStatus(true);
		genericResponse.setApiMessage("User-Added sucessfully");

		return genericResponse;
	}
//---------------------------------------PORTAL USER MANAGEMENT ADD USER WITH ACCESS---------	
	public GenericResponse portalUserManagement(RequestPortalUserManagement req) {
		StarPayUser user=new StarPayUser();
		Address address=new Address();
		Bayadito bayadito=new Bayadito();
		BillPaymentTransaction billPaymentTransaction=new BillPaymentTransaction();
		EMoneyService eMoneyService=new EMoneyService();
		EMoneySetLimit eMoneySetLimit=new EMoneySetLimit();
		PD pd=new PD();
		PortalUserHistory portalUserHistory=new PortalUserHistory();
		Rd rd=new Rd();
		Wallet wallet=new Wallet();
		rd.setAcess(req.getRdAccess());
		pd.setAcess(req.getPdAccess());
		portalUserHistory.setAcess(req.getPortalUserHistoryAccess());
		pd.setAcess(req.getPdAccess());
		wallet.setAcess(req.getWalletAccess());
		eMoneyService.setAcess(req.geteMoneyServiceAccess());
		eMoneySetLimit.setAcess(req.geteMoneySetLimitAccess());
		billPaymentTransaction.setAcess(req.getBillPaymentAccess());
//		bayadito.setAcess(req.getBayaditoAccess());//TODO as the Domain mapping is not set anywhere for bayadito 
		user.setFirstName(req.getFirstName());
		user.setLastName(req.getLastName());
		user.setMobileNumber(req.getMobileNumber());
		user.setCompanyName(req.getCompanyName());
		user.setGender(req.getGender());
		address.setAddressType(req.getAddressType());
		address.setFullAddress(req.getFullAddress());
		address.setCity(req.getCity());
		address.setZipCode(req.getZipcode());
		address.setStarPayUser(user);
		
		
		
		
		
		GenericResponse genericResponse= new GenericResponse();
		genericResponse.setApiSucessStatus(true);
		genericResponse.setApiMessage("User-Added sucessfully");
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
			if (s.getIsActive())
				res.setIsAdmin(s.getIsActive());
//			res.setAddress(s.getAddress());			
			rlist.add(res);
		}

		return rlist;
	}

	public ResponceRetailerFeature getButtonFeature(RequestRetailerFeature id) {
		// TODO Auto-generated method stub
		ResponceRetailerFeature feature = new ResponceRetailerFeature();
		List<Buttons> b1 = new ArrayList<ResponceRetailerFeature.Buttons>();
		RetailerFeature kFeature = fDao.getById(id);
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

	public GenericResponse setButtonFeature(RequestRetailerFeature ref) {
		RetailerFeature feature = new RetailerFeature();
		feature.setFeatureName(ref.getFeatureName());
		feature.setStatus(ref.getStatus());
		fDao.create(feature);
		GenericResponse genericResponse = new GenericResponse();
		genericResponse.setApiSucessStatus(true);
		genericResponse.setApiMessage("User-Added sucessfully");
		log.info("User Added sucessfully");
		return genericResponse;
	}



//------------------------Re-Usable Methods-----------------------------------------
	void getPortalUserManagenment() {

	}

	void getEmoneyService() {

	}

	void getBillPaymentTransactions() {

	}

	void getEmoneySetlimit() {

	}

	void portalUserOptionHistory() {

	}

}
