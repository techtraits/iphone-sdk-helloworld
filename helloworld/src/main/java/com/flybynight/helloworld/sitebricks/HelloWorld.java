package com.flybynight.helloworld.sitebricks;

import com.google.sitebricks.At;

@At("/helloworld")
public class HelloWorld {
    public String getMessage() { 
    	return "HelloWorld!!!!!!";		
	}
}
