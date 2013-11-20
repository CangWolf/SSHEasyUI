package org.cangwolf.ssh.model;

import org.cangwolf.ssh.model.base.VersionableEntity;
import org.hibernate.annotations.Cache;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: Sun
 * Date: 13-11-18
 * Time: 上午10:52
 * System Menu Table Entity
 */
@Entity
@Table(name = "TS_MENU",uniqueConstraints = @UniqueConstraint(columnNames = {"NO"}))
public class TsMenu extends VersionableEntity {
    private static final long serialVersionUID = 6248947743827175514L;

    private Long id;
    private String no;
    private String name;
    private String url;
    private TsMenu parent;
    private Long parentId;
    private Set<TsMenu> menus = new HashSet<TsMenu>(0);

    @Override
    @Id
    @Column(name = "TS_MENU_ID",unique = true,nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "NO")
    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "URL")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PARENT_ID")
    public TsMenu getParent() {
        return parent;
    }

    public void setParent(TsMenu parent) {
        this.parent = parent;
    }

    @Column(name = "PARENT_ID")
    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "parent")
    public Set<TsMenu> getMenus() {
        return menus;
    }

    public void setMenus(Set<TsMenu> menus) {
        this.menus = menus;
    }
}
