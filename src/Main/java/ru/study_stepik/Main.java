package ru.study_stepik;

/**
 * Created by 092GoncharVV on 29.06.2017.
 */
public class Main {
    public static void main(String[] args) throws Exception{
        Frontend frontend = new Frontend();
        Server server =new Server(8080);
        ServletContextHandler context = new  ServletContextHandler( ServletContextHandler.SESSIONS);
        server.setHandler(context);
        context.addServlet(new ServletHendler(frontend),'/authform');
        server.start();
        server.join();
    }
}
