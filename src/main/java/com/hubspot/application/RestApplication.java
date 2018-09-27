package com.hubspot.application;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.hubspot.rest.JSONService;
import com.hubspot.rest.PService;

@ApplicationPath("/rs")
public class RestApplication extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> resources = new HashSet<>();
		resources.add(JSONService.class);
		resources.add(PService.class);
		return resources;
	}
}
