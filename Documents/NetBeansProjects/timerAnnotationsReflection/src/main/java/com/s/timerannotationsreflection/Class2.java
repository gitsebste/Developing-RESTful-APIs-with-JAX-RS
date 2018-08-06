/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.s.timerannotationsreflection;

/**
 *
 * @author device02
 */
public class Class2 {

    public Class2() {
    }
    @Scheduled(period = 2000)
     public void method1(){
         System.out.println("Once per 2 sec");
        //System.out.println("Called: com.s.timerannotationsreflection.Class2.method1()");
    }
     @Scheduled(period = 3000)
        public void method2(){
            System.out.println("Once per 3 sec");
            //System.out.println("Called: com.s.timerannotationsreflection.Class2.method2()");
    }   
}
