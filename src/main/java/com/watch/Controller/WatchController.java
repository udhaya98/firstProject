package com.watch.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.watch.Entity.WatchEntity;
import com.watch.Exception.PriceException;
import com.watch.Service.WatchService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@RequestMapping(value="/watch")
public class WatchController {
@Autowired
WatchService ws;
@PostMapping(value="/postall")
public String postall(@RequestBody List<WatchEntity>w) {
    
    return ws.postall(w);
}
@GetMapping("/getall")
public List<WatchEntity> getall() {
    return ws.getall();
}
@GetMapping("/getobj/{price}")
public List<Object> getobj(@PathVariable int price) {
    return ws.getobj(price);
}
@PostMapping("/postprice")
public String postprice(@RequestBody WatchEntity price)throws PriceException {  
    return  ws.postprice(price);
}
@GetMapping("getprice/{a}")
public WatchEntity getprice(@PathVariable int a)throws PriceException {
    return ws.getprice(a);
}
@PostMapping("/postexc")
public String postexc(@RequestBody List<WatchEntity>e)throws PriceException {
    return ws.postexc(e);
}
@GetMapping("getid/{a}")
public String getid(@PathVariable int a) throws PriceException{
    //TODO: process POST request
    
    return ws.getid(a) ;
}




}
