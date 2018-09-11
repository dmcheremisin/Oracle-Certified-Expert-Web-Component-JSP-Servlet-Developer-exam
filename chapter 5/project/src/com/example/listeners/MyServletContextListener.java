package com.example.listeners;


import com.example.models.Dog;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by Dmitrii on 11.09.2018.
 */
public class MyServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent event) {
        ServletContext servletContext = event.getServletContext();
        String dogBreed = servletContext.getInitParameter("dogBreed");
        Dog dog = new Dog(dogBreed);
        servletContext.setAttribute("dog", dog);
    }

    @Override
    public void contextDestroyed(ServletContextEvent event) {

    }
}
