package org.cangwolf.ssh.model.base;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

/**
 * Created with IntelliJ IDEA.
 * User: Sun
 * Date: 13-11-19
 * Time: 下午9:21
 * To change this template use File | Settings | File Templates.
 */
@MappedSuperclass
public abstract class VersionableEntity extends FounderEntity {
    private static final long serialVersionUID = 3656756785750135538L;
    private Long version = Long.valueOf(0);

    @Version
    @Column(name = "VERSION")
    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
}
