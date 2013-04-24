package org.anotheria.moskito.control.config;

import org.apache.log4j.Logger;
import org.configureme.ConfigurationManager;
import org.configureme.annotations.Configure;
import org.configureme.annotations.ConfigureMe;

/**
 * TODO comment this class
 *
 * @author lrosenberg
 * @since 26.02.13 18:50
 */
@ConfigureMe (name="moskitocontrol", allfields = true)
public class MoskitoControlConfiguration {

	@Configure
	private ApplicationConfig[] applications;

	private static Logger log = Logger.getLogger(MoskitoControlConfiguration.class);

	public ApplicationConfig[] getApplications() {
		return applications;
	}

	public void setApplications(ApplicationConfig[] applications) {
		this.applications = applications;
	}

	public static final MoskitoControlConfiguration getConfiguration(){
		//TODO reuse instance later.
		return loadConfiguration();
	}

	static final MoskitoControlConfiguration loadConfiguration(){
		MoskitoControlConfiguration config = new MoskitoControlConfiguration();
		try {
			ConfigurationManager.INSTANCE.configure(config);
		}catch(IllegalArgumentException e){
			log.warn("can't find configuration - ensure you have moskitocontrol.json in the classpath");
		}
		return config;
	}
}
