package com.watch.Repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.watch.Entity.WatchEntity;

public interface WatchRepositry extends JpaRepository<WatchEntity, Integer>{
	@Query(value="select brand,color from watch_details where price >?",nativeQuery = true)
	public List<Object>getobj(int price);

}
