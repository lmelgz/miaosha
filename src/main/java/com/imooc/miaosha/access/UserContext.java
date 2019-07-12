package com.imooc.miaosha.access;

import com.imooc.miaosha.domain.MiaoshaUser;

public class UserContext {
	
	private static ThreadLocal<MiaoshaUser> userHolder=new ThreadLocal<MiaoshaUser>();
	
	@SuppressWarnings("unused")
	public static void setUser(MiaoshaUser user){
		userHolder.set(user);
	}
	
	@SuppressWarnings("unused")
	public static MiaoshaUser getUser(){
		return userHolder.get();
	}
}
