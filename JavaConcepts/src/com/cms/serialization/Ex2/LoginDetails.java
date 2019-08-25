package com.cms.serialization.Ex2;

import java.io.Serializable;

public class LoginDetails implements Serializable{
	String userId;
	transient String password;
}
