package com.flybynight.helloworld;

import com.flybynight.helloworld.sitebricks.HelloWorld;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;
import com.google.sitebricks.SitebricksModule;

public class GuiceCreator extends GuiceServletContextListener {

	@Override
	protected Injector getInjector() {
		Injector injector = Guice.createInjector ( 
				new SitebricksModule() {
			         protected void configureSitebricks() {
			                // scan class Example's package and all descendants
			                scan(HelloWorld.class.getPackage());
			            }
				}
		);
		return injector;
	}

}
