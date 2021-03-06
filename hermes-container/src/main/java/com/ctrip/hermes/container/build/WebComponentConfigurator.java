package com.ctrip.hermes.container.build;

import java.util.ArrayList;
import java.util.List;

import com.ctrip.hermes.container.console.ConsoleModule;

import org.unidal.lookup.configuration.Component;
import org.unidal.web.configuration.AbstractWebComponentsConfigurator;

class WebComponentConfigurator extends AbstractWebComponentsConfigurator {
	@SuppressWarnings("unchecked")
	@Override
	public List<Component> defineComponents() {
		List<Component> all = new ArrayList<Component>();

		defineModuleRegistry(all, ConsoleModule.class, ConsoleModule.class);

		return all;
	}
}
