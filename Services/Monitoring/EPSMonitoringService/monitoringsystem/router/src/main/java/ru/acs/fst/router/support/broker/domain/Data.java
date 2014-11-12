package ru.acs.fst.router.support.broker.domain;

/**
 * Created by IntelliJ IDEA.
 * User: fmv
 * Date: 09.04.2010
 * Time: 15:58:47
 * To change this template use File | Settings | File Templates.
 */
public class Data {
    RouteRule routeRule;
    Table table;

    public Data(RouteRule routeRule) {
        this.routeRule = routeRule;
    }

    public Data(Table table) {
        this.table = table;
    }

    public Data(RouteRule routeRule, Table table) {
        this.routeRule = routeRule;
        this.table = table;
    }

    public Data() {
    }

    public RouteRule getRouteRule() {
        return routeRule;
    }

    public void setRouteRule(RouteRule routeRule) {
        this.routeRule = routeRule;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }
}
