package net.scalax.guice.test;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class CountsResources {

    @Inject
    public CountsResources() {
        this.counts.add(2);
        this.counts.add(3);
    }

    public List<Integer> counts = new ArrayList<>();

}