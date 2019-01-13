/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.s.messenger.resources;

import com.s.messenger.model.Message;
import com.s.messenger.service.MessageService;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author device02
 */
@Path("/messages")
public class MessageResource {
    
    MessageService messageService = new MessageService();
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Message> getAllMessages(){
        return messageService.getAll();
    }
    
}