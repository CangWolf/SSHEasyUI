package org.cangwolf.ssh.model.base;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Created with IntelliJ IDEA.
 * User: Sun
 * Date: 13-11-19
 * Time: 下午9:18
 * To change this template use File | Settings | File Templates.
 */
@MappedSuperclass
public abstract class FounderEntity extends TimestampableEntity {
    private static final long serialVersionUID = 6330093336034452347L;
    private String createdBy;
    private String updatedBy;

    @Column(name = "CREATE_BY",updatable = false)
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Column(name = "UPDATE_BY")
    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
}
