package me.facemoktak;
//
//import org.apache.catalina.Context;
//import org.apache.catalina.LifecycleException;
//import org.apache.catalina.startup.Tomcat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Application.class);
//        application.setWebApplicationType(WebApplicationType.NONE);
        application.run(args);
//        String docBase = Files.createTempDirectory("tomcat-basedir").toString();
//        Tomcat tomcat = new Tomcat();
//        tomcat.setPort(8080);
//
//        Context context = tomcat.addContext("/", docBase);
//
//        HttpServlet servlet = new HttpServlet() {
//            @Override
//            protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//                PrintWriter writer = resp.getWriter();
//                writer.println("<html><head><title>");
//                writer.println("Hey, Tomcat");
//                writer.println("</title></head>");
//                writer.println("<body><h1>Hello Tomcat</h1></body>");
//                writer.println("</html>");
//            }
//        };
//
//        String servletName = "helloServlet";
//        tomcat.addServlet("/", servletName, servlet);
//        context.addServletMappingDecoded("/hello", servletName);
//
//
//        tomcat.getConnector();
//        tomcat.start();
//        tomcat.getServer().await();

    }
}
