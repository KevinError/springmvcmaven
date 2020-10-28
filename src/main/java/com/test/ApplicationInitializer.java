package com.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer; // springframework web package; provide API to register the DispatcherServlet
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class ApplicationInitializer implements WebApplicationInitializer {

    // serletContext: servlet jsp api
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        //bootstrap dispatcherservlet
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(ApplicationConfig.class); // tie up SpringConfig class with AnnotationConfigWebAppContext
        ServletRegistration.Dynamic servletRegistration =
                servletContext.addServlet( "mvc", new DispatcherServlet(context));
        servletRegistration.setLoadOnStartup(1); // default number is -1 and it may initialize this as a lazy loading procedure
        servletRegistration.addMapping("/"); // define URL patterns with the addMapping API

    }
}
