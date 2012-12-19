package com.emotive.jetty;


import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

/**
 */
public class Main
{
    public static void main(String[] args) throws Exception
    {
        String jetty_home = System.getProperty("jetty.home","..");

        Server server = new Server(9090);

        WebAppContext webapp = new WebAppContext();
        webapp.setContextPath("/axis2");
        webapp.setWar("./webapps/axis2");
        server.setHandler(webapp);

        server.start();
        server.join();
    }
}
