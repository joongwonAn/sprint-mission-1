package com.sprint.mission.discodeit.entity;

import java.util.UUID;

public class BaseEntitiy {

    // 각 속성은 캡슐화를 위해 private로 선언
    private UUID id;
    private long createdAt;
    private long updatedAt;

    // Constructor
    // final 처럼 사용
    public BaseEntitiy() {
        this.id = UUID.randomUUID();
        this.createdAt = System.currentTimeMillis();
        this.updatedAt = System.currentTimeMillis();
    }

    // setter & getter
    public UUID getId() {
        return id;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }
}
