package br.com.agi.core;

import org.asteriskjava.fastagi.AgiChannel;
import org.asteriskjava.fastagi.AgiRequest;

import java.io.Serializable;
import java.util.Objects;


public class ChannelAndRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    private static AgiChannel channel;
    private static AgiRequest request;


    public ChannelAndRequest() {
        throw new AssertionError("Impossível");
    }

    private ChannelAndRequest(ChannelAndRequestBuilder builder) {
        ChannelAndRequest.channel = builder.channel;
        ChannelAndRequest.request = builder.request;

    }

    public static class ChannelAndRequestBuilder {
        private final AgiChannel channel;
        private final AgiRequest request;


        public ChannelAndRequestBuilder(AgiChannel channel, AgiRequest request) {

            this.channel = Objects.requireNonNull(channel, "Channel não pode ser null.");
            this.request = Objects.requireNonNull(request, "Request não pode ser null.");

        }

        public void build() {
            new ChannelAndRequest(this);
        }

    }

    private Object readObject() {
        return this;
    }


    public static AgiChannel getChannel() {
        return channel;
    }

    public static AgiRequest getRequest() {
        return request;
    }

}