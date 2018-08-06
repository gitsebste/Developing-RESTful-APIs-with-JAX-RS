/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.s.timerannotationsreflection;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

/**
 *
 * @author device02
 */



public class App {
    
    public static void main(String[] args) throws Exception{
        Class c1 = Class.forName(args[0]);
        Class c2 = Class.forName(args[1]);
        
        Object obj1 = c1.newInstance();
        Object obj2 = c2.newInstance();
        Method[] methods1 = c1.getMethods();
        Method[] methods2 = c2.getMethods();
        
        for(Method m : methods1)
            for (Annotation a :m.getAnnotations())
                if(a.toString().contains(".Scheduled(period="))schedule(m, obj1, a);
        for(Method m : methods2)
            for (Annotation a :m.getAnnotations())
                if(a.toString().contains(".Scheduled(period="))schedule(m, obj2, a);

    }

    private static void schedule(Method m, Object obj1, Annotation a) throws NumberFormatException {
        new java.util.Timer().schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        try {
                            m.invoke(obj1, null);
                        } catch (IllegalAccessException ex) {
                            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IllegalArgumentException ex) {
                            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (InvocationTargetException ex) {
                            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }, 0,
                Integer.valueOf(a.toString().split("=|[)]")[1])//5000
        );  }
    
}
