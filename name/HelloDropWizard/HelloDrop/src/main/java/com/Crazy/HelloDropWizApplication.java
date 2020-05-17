package com.Crazy;

import com.Crazy.health.TemplateHealthCheck;
import com.Crazy.resources.HelloResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class HelloDropWizApplication extends Application<HelloDropWizConfiguration> {

    public static void main(final String[] args) throws Exception {
        new HelloDropWizApplication().run(args);
    }

    @Override
    public String getName() {
        return "HellDropWiz";
    }

    @Override
    public void initialize(final Bootstrap<HelloDropWizConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final HelloDropWizConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
        final HelloResource res= new HelloResource(configuration.getTemplate(),configuration.getDefaultName());
        final TemplateHealthCheck healthCheck =
                new TemplateHealthCheck(configuration.getTemplate());
        environment.healthChecks().register("template", healthCheck);
        environment.jersey().register(res);
    }

}
