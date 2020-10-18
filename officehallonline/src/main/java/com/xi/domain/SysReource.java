package com.xi.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class SysReource implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    @Column(nullable = true)
    private int reourceId;
    private String reourceName;
    private String resourceType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getReourceId() {
        return reourceId;
    }

    public void setReourceId(int reourceId) {
        this.reourceId = reourceId;
    }

    public String getReourceName() {
        return reourceName;
    }

    public void setReourceName(String reourceName) {
        this.reourceName = reourceName;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }
}
