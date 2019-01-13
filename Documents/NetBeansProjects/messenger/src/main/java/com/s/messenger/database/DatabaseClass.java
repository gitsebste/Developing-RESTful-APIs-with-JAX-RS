/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.s.messenger.database;

import com.s.messenger.model.Message;
import com.s.messenger.model.Profile;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author device02
 */
public class DatabaseClass {
    
    private static Map<Long, Message> messages = new HashMap<>();
    private static Map<Long, Profile> profiles = new HashMap<>();
    
    public Map<Long, Message> getMessages(){
        return messages;
    }
    public Map<Long, Profile> getProfiles(){
        return profiles;
    }
}
