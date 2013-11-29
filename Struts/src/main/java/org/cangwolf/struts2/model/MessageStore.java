package org.cangwolf.struts2.model;

/**
 * Created with IntelliJ IDEA.
 * User: Sun
 * Date: 13-11-28
 * Time: 下午4:32
 * To change this template use File | Settings | File Templates.
 */
public class MessageStore {
    private String message;

    public MessageStore() {
        this.message = "Hello World ,Struts2";
    }

    public String getMessage() {

        return message;
    }

    public void setMessage(String message) {

        this.message = message;
    }
}
