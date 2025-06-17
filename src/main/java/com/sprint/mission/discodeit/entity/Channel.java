package com.sprint.mission.discodeit.entity;

import java.util.UUID;

public class Channel extends BaseEntitiy {

    private String name;
    private String description;

    // Constructor
    public Channel(String name, String description) {
        super();
        this.name = name;
        this.description = description;
    }

    // setter & getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
