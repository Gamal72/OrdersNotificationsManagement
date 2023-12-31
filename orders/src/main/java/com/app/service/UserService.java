package com.app.service;

import com.app.model.User;
import com.app.repo.Database;

import java.nio.channels.Channel;
import java.util.Map;

public class UserService {
    private final Database database;
    private static UserService instance;


    private UserService() {
        database = Database.getInstance();
    }

    public Boolean createUser(String username, String password, double balance) {
        if (database.userExist(username)) {
            return false;
        }
        User user = new User(username, password, balance);
        database.addUser(user);
        return true;
    }

    public Boolean setChannel(String username, Map<String, Boolean> channels) {
        if (!database.userExist(username)) {
            return false;
        }
        Channel channel = new concreteChannel();
        for (var entry : channels.entrySet()) {
            Channel tmpChannel = ChannelFactory.createChannel(entry);
            if(tmpChannel == null)continue;
            tmpChannel.setWrappee(channel);
            channel = tmpChannel;
        }
        User user = getUserByUsername(username);
        user.setChannel(channel);
        return true;
    }
}