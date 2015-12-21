//package pl.learning;
//
//import javax.servlet.ServletContext;
//import javax.servlet.ServletException;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.WebApplicationInitializer;
//import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
//
//@Configuration
//public class RestWebInitializer implements WebApplicationInitializer {
// 
//    @Override
//    public void onStartup(ServletContext servletContext)
//            throws ServletException {
//        AnnotationConfigWebApplicationContext rootCtx = new AnnotationConfigWebApplicationContext();
//        rootCtx.register(ApplicationConfig.class);
// 
//        servletContext.addListener(new ContextLoaderListener(rootCtx));
// 
//        AnnotationConfigWebApplicationContext webCtx = new AnnotationConfigWebApplicationContext();
//        webCtx.register(RepositoryRestMvcConfiguration.class);
// 
//        DispatcherServlet dispatcherServlet = new DispatcherServlet(webCtx);
//        ServletRegistration.Dynamic reg = servletContext.addServlet(
//                "rest-exporter", dispatcherServlet);
//        reg.setLoadOnStartup(1);
//        reg.addMapping("/*");
// 
//    }
// 
//}
