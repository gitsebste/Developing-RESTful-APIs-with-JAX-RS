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
public class Class1 {

    public Class1() {
    }
    @Scheduled(period=1000)
    public void method1(){
        System.out.println("Once a sec.");
        //System.out.println("Called: com.s.timerannotationsreflection.Class1.method1()");
    }
    @Scheduled(period=500)
        public void method2(){
            System.out.println("Twice a sec.");
            //System.out.println("Called: com.s.timerannotationsreflection.Class1.method2()");
    }
}
