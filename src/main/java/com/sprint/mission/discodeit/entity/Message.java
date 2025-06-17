package com.sprint.mission.discodeit.entity;

import java.util.UUID;

public class Message extends BaseEntitiy {

    private String content;
    private UUID userId;
    private UUID channelId;

    // Constructor
    public Message(String content, UUID userId, UUID channelId) {
        super();
        this.content = content;
        this.userId = userId;
        this.channelId = channelId;
    }

    // getter & setter
    public String getContent() {
        return content;
    }

    public UUID getUserId() {
        return userId;
    }

    public UUID getChannelId() {
        return channelId;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
