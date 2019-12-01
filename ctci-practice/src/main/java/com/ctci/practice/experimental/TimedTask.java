package com.ctci.practice.experimental;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Hello world!
 *
 */
public class TimedTask 
{
    private Timer timer;

    private class tmpDisableFirewall extends TimerTask {

        @Override
        public void run() {
            System.out.println("Hey fired through scheduler!!!!");
            timer.cancel();
        }   

    }

    public void cancel() {
        try {
            timer.cancel();
            timer.purge();
        } catch (Exception e) {

        }
        
    }

    public void status() {
        if (timer != null) {
            System.out.println("running");
        } else {
            System.out.println("not running");
        }
    }
    
    public void tmpFirewallDisable() {
        cancel();
        timer = new Timer("setupFirewall");
        timer.schedule(new tmpDisableFirewall(), 2000);
    }
    public void testing() {
        Timer timer = new Timer("testing");
        class testing extends TimerTask {

            @Override
            public void run() {
                tmpFirewallDisable();
                timer.cancel();
            }

        }
        timer.schedule(new testing(), 3000);
    }

    public static void main( String[] args )
    {
        TimedTask timedTask = new TimedTask();
        timedTask.tmpFirewallDisable();
        timedTask.testing();
        timedTask.status();
    }
}
