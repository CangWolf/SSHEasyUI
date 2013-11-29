package org.cangwolf.ssh.model.base;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: Sun
 * Date: 13-11-19
 * Time: 下午8:37
 * To change this template use File | Settings | File Templates.
 */

public abstract class AbstractEntity implements Serializable {
    private static final long serialVersionUID = -8242284195152574461L;
    protected Log log = LogFactory.getLog(super.getClass());

    public abstract Long getId();

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AbstractEntity) {
            return (getId() == null) ? super.equals(obj) : getId().equals(((AbstractEntity) obj).getId());
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return getId()==null?super.hashCode():getId().intValue();
    }
}
