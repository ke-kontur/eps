package ru.acs.fst.router.support.broker.domain;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: fmv
 * Date: 09.04.2010
 * Time: 15:59:08
 * To change this template use File | Settings | File Templates.
 */
public class Table {
    List<Router> routers = new ArrayList<Router>();
    public void add(Router router){
        routers.add(router);
    }
    public List<Router> getRouters(){
        return routers;
    }
}
