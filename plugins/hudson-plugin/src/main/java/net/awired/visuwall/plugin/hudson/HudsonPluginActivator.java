package net.awired.visuwall.plugin.hudson;

import java.util.Properties;

import net.awired.visuwall.api.plugin.VisuwallPlugin;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class HudsonPluginActivator implements BundleActivator {

	private HudsonPlugin HudsonPlugin;
	private ServiceRegistration registration;
	
	public HudsonPluginActivator() {
		HudsonPlugin = new HudsonPlugin();
	}
	
	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("salut!");
		registration = context.registerService(VisuwallPlugin.class.getName(), HudsonPlugin, new Properties());
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		registration.unregister();
		HudsonPlugin = null;
	}
}
