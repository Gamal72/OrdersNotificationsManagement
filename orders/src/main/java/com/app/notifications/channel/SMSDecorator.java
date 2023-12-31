package com.app.notifications.channel;

public class SMSDecorator extends ChannelDecorator{

    public SMSDecorator(Channel wrappee, String address) {
        super(wrappee, address);
    }

    public SMSDecorator() {
        super(null, null);
    }

    @Override
    public void send(String message) {

    }

}