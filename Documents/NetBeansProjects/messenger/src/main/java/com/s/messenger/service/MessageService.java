/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.s.messenger.service;

import com.s.messenger.database.DatabaseClass;
import com.s.messenger.model.Message;
import com.s.messenger.util.DateUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author device02
 */
public class MessageService {
    
    private static Map<Long, Message> messages = new DatabaseClass().getMessages();
    
    public MessageService(){
        messages.put(1L, new Message(1L, "Hello from Koushik", DateUtil.getDate(2018, 12, 6), "Koushik"));
        messages.put(2L, new Message(2L, "Hello from Navin", DateUtil.getDate(2018, 12, 6), "Navin"));
    }
    
    public List<Message> getAll(){        
        return new ArrayList<Message>(messages.values());
    }    
    
    public Message getMessage(long id){
        return messages.get(id);
    }
    
    public Message addMessage(Message m){
        m.setId(messages.size()+1);
        messages.put(m.getId(), m);
        return m;
    }
    
    public Message updateMessage(Message m){        
        if(!messages.containsKey(m.getId()))return null;
        messages.get(m.getId()).setMessage(m.getMessage());
        return m;
    }
    
    public Message removeMessage(long id){
        return messages.remove(id);
    }
    
}
