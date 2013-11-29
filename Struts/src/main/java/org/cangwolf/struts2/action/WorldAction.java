package org.cangwolf.struts2.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.cangwolf.struts2.model.MessageStore;


/**
 * Created by Sun on 13-11-29.
 */
//@Action(value = "world",results = {@Result(location = "helloworld.jsp")})
public class WorldAction extends ActionSupport{
    private MessageStore messageStore;

    @Override
    public String execute() throws Exception {
        messageStore = new MessageStore();
        messageStore.setMessage("World,Struts2");
        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }

    public void setMessageStore(MessageStore messageStore) {
        this.messageStore = messageStore;
    }
}
