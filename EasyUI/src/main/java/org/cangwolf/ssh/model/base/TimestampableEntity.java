package org.cangwolf.ssh.model.base;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Sun
 * Date: 13-11-19
 * Time: 下午8:56
 * To change this template use File | Settings | File Templates.
 */
@MappedSuperclass
public abstract class TimestampableEntity extends AbstractEntity {
    private static final long serialVersionUID = -6424390221196885401L;
    private Date createDate;
    private Date updateDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="CREATE_DATE",updatable = false)
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
