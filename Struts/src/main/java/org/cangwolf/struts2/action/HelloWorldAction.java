package org.cangwolf.struts2.action;

import com.opensymphony.xwork2.ActionSupport;
import org.cangwolf.struts2.model.MessageStore;

/**
 * Created with IntelliJ IDEA.
 * User: Sun
 * Date: 13-11-28
 * Time: 下午4:34
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorldAction extends ActionSupport {

    private MessageStore messageStore;

    @Override
    public String execute() throws Exception {
        messageStore = new MessageStore();
        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }

    public void setMessageStore(MessageStore messageStore) {
        this.messageStore = messageStore;
    }
}
