package ru.acs.fst.router;

import org.apache.camel.spring.Main;
import org.tanukisoftware.wrapper.WrapperListener;
import org.tanukisoftware.wrapper.WrapperManager;

/**
 * Created by IntelliJ IDEA.
 * User: fmv
 * Date: 12.04.2010
 * Time: 14:17:20
 * To change this template use File | Settings | File Templates.
 */
public class RouterWrapperService implements WrapperListener {

    public static void main(String[] args) {
        WrapperManager.start(new RouterWrapperService(), args);
    }

    public Integer start(final String[] args) {
        new Thread(new Runnable() {
            public void run() {
                try {
                    Main.main(args);
                } catch (Exception e) {
                    e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                    throw new RuntimeException(e);
                }
            }
        }
        ).start();


        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public int stop(int i) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public void controlEvent(int i) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
