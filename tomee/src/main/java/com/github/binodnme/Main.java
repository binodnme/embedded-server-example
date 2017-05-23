package com.github.binodnme;

import org.apache.openejb.testing.Application;
import org.apache.openejb.testing.Classes;
import org.apache.tomee.embedded.TomEEEmbeddedApplicationRunner;

/**
 * @author Binod Shrestha <binodshrestha@lftechnology.com> on 5/20/17.
 */
@Application
@Classes(context = "app")
@TomEEEmbeddedApplicationRunner.Configurers(AppConfig.class)
public class Main {
    public static void main(String[] args) {
        TomEEEmbeddedApplicationRunner.run(Main.class);
    }
}