/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.andy.pf.tfsim.simulator;

import javax.ejb.Schedule;
import javax.ejb.Singleton;
import org.primefaces.push.PushContext;
import org.primefaces.push.PushContextFactory;

/**
 *
 * @author a.bailey
 */
@Singleton
public class AsynchDirectionChangeSimulator {

    final static String[] DIRS = {
        "North",
        "Northeast",
        "East",
        "Southeast",
        "South",
        "Southwest",
        "West",
        "Northwest"
    };
    
    
    @Schedule(minute = "*", second = "*/1", hour = "*")
    public void myTimer() {
        String nextDirection = DIRS[(int)(Math.random()*DIRS.length)];
        PushContext ctx = PushContextFactory.getDefault().getPushContext();
        if( ctx != null ) {
            ctx.push("/tfSim", nextDirection);
        }
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
