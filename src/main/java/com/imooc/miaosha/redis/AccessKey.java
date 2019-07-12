package com.imooc.miaosha.redis;

public class AccessKey extends BasePrefix{

	private AccessKey(Integer expireSeconds, String prefix) {
		super(expireSeconds,prefix);
	}
	
	public static AccessKey withExpire(int expireSeconds){
		return new AccessKey(expireSeconds, "access");
	}
	

}
