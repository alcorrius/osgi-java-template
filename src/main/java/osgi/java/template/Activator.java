package osgi.java.template;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

    private Library library;

    @Override
    public void start(BundleContext context) throws Exception {
        System.out.println("Hello World started.");
        library = new Library();
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        library = null;
        System.out.println("Hello World stopped.");
    }

}