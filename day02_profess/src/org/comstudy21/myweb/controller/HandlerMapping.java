package org.comstudy21.myweb.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.comstudy21.myweb.bbs.BoardController;
import org.comstudy21.myweb.member.MemberController;
import org.comstudy21.myweb.shop.ShopController;

public class HandlerMapping {
	private static final Map<String, MyController> ctrlMap = new HashMap<String, MyController>();
	static {
		// 생성자 보다 먼저 실행된다.
		ctrlMap.put("", new HomeController());
		ctrlMap.put("/member", new MemberController());
		ctrlMap.put("/bbs", new BoardController());
		ctrlMap.put("/shop", new ShopController());
	}
	
	public static void appendController(String key, MyController newCtrl) {
		ctrlMap.put(key, newCtrl);
	}
	
	public HandlerMapping() {
		// TODO Auto-generated constructor stub
	}
	
	public HandlerMapping(Map<String, MyController> ctrlMap) {
		if(ctrlMap != null) {
			Iterator<String> iter = ctrlMap.keySet().iterator();
			this.ctrlMap.clear();
			while(iter.hasNext()) {
				String key = iter.next();
				this.ctrlMap.put(key, ctrlMap.get(key));
			}
			//this.ctrlMap.putAll(ctrlMap);
		}
	}

	public MyController getController(String key) {
		return ctrlMap.get(key);
	}
}
