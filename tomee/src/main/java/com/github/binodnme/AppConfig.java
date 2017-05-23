package com.github.binodnme;

import org.apache.tomee.embedded.Configuration;
import org.apache.tomee.embedded.TomEEEmbeddedApplicationRunner;

/**
 * @author Binod Shrestha <binodshrestha@lftechnology.com> on 5/21/17.
 */
public class AppConfig implements TomEEEmbeddedApplicationRunner.Configurer {
    @Override
    public void configure(Configuration configuration) {
        configuration.setHttpPort(8181);
    }
}
