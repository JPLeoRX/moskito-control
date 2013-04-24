package org.anotheria.moskito.control.config;

import org.configureme.annotations.Configure;
import org.configureme.annotations.ConfigureMe;

/**
 * Configuration of the application.
 *
 * @author lrosenberg
 * @since 26.02.13 01:33
 */
@ConfigureMe
public class ApplicationConfig {
	/**
	 * Name of the application.
	 */
	@Configure private String name;

	/**
	 * Components.
	 */
	@Configure private ComponentConfig[] components;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ComponentConfig[] getComponents() {
		return components;
	}

	public void setComponents(ComponentConfig[] components) {
		this.components = components;
	}
}
