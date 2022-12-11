package net.scalax.guice.test;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class NameResources {

    @Inject
    public NameResources() {
        this.names.add("Tom");
        this.names.add("Mary");
        this.names.add("Peter");
    }

    public List<String> names = new ArrayList<>();

}