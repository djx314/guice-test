package net.scalax.guice.test;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class RunMain {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new DemoModule());
        AppFroRun appForRun = injector.getInstance(AppForRunImpl.class);
        appForRun.run();
    }

}