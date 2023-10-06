package com.github.tadayosi.samples.quarkus3;

import jakarta.enterprise.context.ApplicationScoped;

import org.apache.camel.builder.endpoint.EndpointRouteBuilder;

@ApplicationScoped
public class SampleCamelRoute extends EndpointRouteBuilder {

    @Override
    public void configure() {
        from(timer("sample")).routeId("timer")
            .setBody().constant("Hello Camel!")
            .log("${body}");
    }

}
