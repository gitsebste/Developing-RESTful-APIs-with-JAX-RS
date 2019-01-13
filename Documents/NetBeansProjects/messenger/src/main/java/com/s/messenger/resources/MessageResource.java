/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.s.messenger.resources;

import com.s.messenger.model.Message;
import com.s.messenger.service.MessageService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author device02
 */
@Path("/messages")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MessageResource {
    
    MessageService messageService = new MessageService();
    
    @GET    
    public List<Message> getAllMessages(){
        return messageService.getAll();
    }
    
    @GET    
    @Path("/{msgId}")
    public Message getMessage(@PathParam("msgId") long msgId){
        return messageService.getMessage(msgId);
    }
    
    @POST    
    public Message addMessage(Message m){
        return messageService.addMessage(m);
    }
    
    @PUT
    @Path("/{msgId}")
    public Message updateMessage(@PathParam("msgId") long msgId,Message m){
        m.setId(msgId);
        return messageService.updateMessage(m);
    }
    
    @DELETE
    @Path("/{msgId}")
    public boolean deleteMessage(@PathParam("msgId") long msgId){
        if(null!=messageService.removeMessage(msgId))return true;
        return false;
    }
    
}
