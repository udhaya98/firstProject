package com.watch.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.watch.DAO.WatchDAO;
import com.watch.Entity.WatchEntity;
import com.watch.Exception.PriceException;
@Service
public class WatchService {
@Autowired
WatchDAO wd;
//
	public String postall(List<WatchEntity> w) {
		return wd.postall(w);
	}
	public List<WatchEntity> getall() {
		// TODO Auto-generated method stub
		return wd.getall();
	}
	public List<Object> getobj(int price) {
		// TODO Auto-generated method stub
		return getobj(price);
	}
	public String postprice(WatchEntity price)throws PriceException {
		if(price.getPrice()>3000) {
			 throw new PriceException("Invalide Price");
			
		}
		else {
			return wd.postprice(price);
			
		}
	}
	public WatchEntity getprice(int a)throws PriceException {
		if(wd.getall().get(a).getPrice()>3000) {
			throw new PriceException("Invalide Price ID");
		}
		else {
			return  wd.getall().get(a);
		}
		
	}
	public String postexc(List<WatchEntity> e)throws PriceException {
		for(WatchEntity x : e) {
			if(x.getPrice()>3000) {
				throw new PriceException("Invalide price");
			}
		
		}
				return wd.postexc(e);
			
		}
	public String getid(int a)throws PriceException {
		if(wd.getall().get(a).getPrice()<2500) {
			throw new PriceException("Price Invalid");
		}
		else {
			return wd.getall().get(a).getBrand();
		}
	}
		
	}



