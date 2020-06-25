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
//import com.example.STARPAY.dao.HistoryDao;
import com.example.STARPAY.dao.PdDao;
import com.example.STARPAY.dao.PortalUserHistoryDao;
import com.example.STARPAY.dao.RdDao;
import com.example.STARPAY.dao.RetailerFeatureDao;
import com.example.STARPAY.dao.StarPayUserDao;
import com.example.STARPAY.dao.WalletDao;
import com.example.STARPAY.domain.RetailerFeature;
import com.example.STARPAY.domain.StarPayUser;
import com.example.STARPAY.domain.UserStatus;
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

	@Autowired // XXX No mapping placed till date 1-5-2020 11:45 pm
	BayaditoDao bayaditoDao;

	@Autowired
	BillPaymentTransactionDao billPaymentTransactionDao;

	@Autowired
	EmoneyServiceDao emoneyServiceDao;

	@Autowired
	EMoneySetLimitDao eMoneySetLimitDao;

//	@Autowired
//	HistoryDao historyDao;

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
	
	UserStatus status;

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
	public GenericResponse setPortalUserManagement(RequestPortalUserManagement req) {
		StarPayUser user = new StarPayUser();
		Address address = new Address();
//		Bayadito bayadito=new Bayadito();
		BillPaymentTransaction billPaymentTransaction = new BillPaymentTransaction();
		EMoneyService eMoneyService = new EMoneyService();
		EMoneySetLimit eMoneySetLimit = new EMoneySetLimit();
		PD pd = new PD();
		PortalUserHistory portalUserHistory = new PortalUserHistory();
		Rd rd = new Rd();
		Wallet wallet = new Wallet();
		if(req.getRdAccess()!=null)
		rd.setAcess(req.getRdAccess());
		if(req.getPdAccess()!=null)
		pd.setAcess(req.getPdAccess());
		if(req.getPortalUserHistoryAccess()!=null)
		portalUserHistory.setAcess(req.getPortalUserHistoryAccess());
		if(req.getWalletAccess()!=null)
		wallet.setAcess(req.getWalletAccess());
		if(req.geteMoneyServiceAccess()!=null)
		eMoneyService.setAcess(req.geteMoneyServiceAccess());
		if(req.geteMoneySetLimitAccess()!=null)
		eMoneySetLimit.setAcess(req.geteMoneySetLimitAccess());
		if(req.getBillPaymentAccess()!=null)
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
		user.setRd(rd);
		user.setPd(pd);
		portalUserHistory.setStarPayUser(user);
		eMoneyService.setStarPayUser(user);
		eMoneySetLimit.setStarPayUser(user);
		billPaymentTransaction.setStarPayUser(user);
		wallet.setStarPayUser(user);
		pdDao.create(pd);
		log.info("Pd AccessCreated for the User");
		rdDao.create(rd);
		log.info("rd Access Craeted for the user");
		uDao.create(user);
		log.info("User Created For The Portal User Manament With Access");
		aDao.create(address);
		log.info("Address Created for Id ", user.getId());
		
		portalUserHistoryDao.create(portalUserHistory);
		log.info("PoralUser Access Setted For UserAccessHistory");
		emoneyServiceDao.create(eMoneyService);
		log.info("emoneyService access created");
		eMoneySetLimitDao.create(eMoneySetLimit);
		log.info("Emoney set limit acces Given");
		billPaymentTransactionDao.create(billPaymentTransaction);
		log.info("Acces for bill transaction setted");
		walletDao.create(wallet);
		log.info("Wallet Access Setted for the User");

		GenericResponse genericResponse = new GenericResponse();
		genericResponse.setApiSucessStatus(true);
		genericResponse.setApiMessage("User-Added sucessfully with Id { }");
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
