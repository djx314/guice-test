package net.scalax.guice.test;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class LinksResources {

    @Inject
    public LinksResources() {
        this.links.add("http://aa.bb.com");
        this.links.add("http://cc.dd.com");
    }

    public List<String> links = new ArrayList<>();

}