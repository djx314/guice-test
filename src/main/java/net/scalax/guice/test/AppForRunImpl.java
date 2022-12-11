package net.scalax.guice.test;

import javax.inject.Inject;
import java.util.List;

public class AppForRunImpl extends AppFroRun {

    public List<String> names;
    public List<String> links;
    public List<Integer> counts;

    public List<String> names() {
        return names;
    }

    public List<String> links() {
        return links;
    }

    public List<Integer> counts() {
        return counts;
    }

    @Inject
    public AppForRunImpl(LinksResources linksResources, NameResources nameResources, CountsResources countsResources) {
        this.names = nameResources.names;
        this.links = linksResources.links;
        this.counts = countsResources.counts;
    }


}