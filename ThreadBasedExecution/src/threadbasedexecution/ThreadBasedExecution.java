/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadbasedexecution;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NIIT CR
 */
public class ThreadBasedExecution implements Runnable{
    @Override
    public void run()
    {
        System.out.println("child function executing..");
        for (int i = 0; i < 10; i++) {
            try {
                
                System.out.println("Good Morning");
                Thread.sleep(500);
            } catch (InterruptedException ex) {
               // Logger.getLogger(ThreadBasedExecution.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Thread Interrupted"+ex);
            }
            
        }
        
    }
    public static void main(String[] args) {
        System.out.println("Main executing..");
        Thread th=new Thread(new ThreadBasedExecution());
        System.out.println("Thread invoking child function");
        th.start();
        try {
            Thread.sleep(3000);
            //th.interrupt();
            th.stop();
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadBasedExecution.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Main finished..");
        
    }
    
}
