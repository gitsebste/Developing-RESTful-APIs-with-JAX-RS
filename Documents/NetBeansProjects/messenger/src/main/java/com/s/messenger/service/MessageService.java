/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.s.messenger.service;

import com.s.messenger.model.Message;
import com.s.messenger.util.DateUtil;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author device02
 */
public class MessageService {
    
    public List<Message> getAll(){
        List<Message> ret = new ArrayList<>();
        
        ret.add(new Message(1L, "Hello from Koushik", DateUtil.getDate(2018, 12, 6), "Koushik"));
        ret.add(new Message(2L, "Hello from Navin", DateUtil.getDate(2018, 12, 6), "Navin"));
        
        return ret;        
    }    
}
