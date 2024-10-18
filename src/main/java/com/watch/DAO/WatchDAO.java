package com.watch.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.watch.Entity.WatchEntity;
import com.watch.Repositry.WatchRepositry;
@Repository
public class WatchDAO {
	@Autowired
	WatchRepositry wr;
	public String postall(List<WatchEntity> w){
		wr.saveAll(w);
		return "Successfully Posted";
	}
	public List<WatchEntity> getall() {
		return wr.findAll();
	}
	public List<Object> getobj(int price) {
		return wr.getobj(price);
	}
	public String postprice(WatchEntity price) {
		wr.save(price);
		return "Successfully posted";
	}
	public WatchEntity getprice(int a) {
		return wr.findById(a).get();
	}
	public String postexc(List<WatchEntity> e) {
		wr.saveAll(e);
		return "success";
	}
	public String getid(int a) {
	return  wr.findById(a).get().getBrand();               
	
	}

}
