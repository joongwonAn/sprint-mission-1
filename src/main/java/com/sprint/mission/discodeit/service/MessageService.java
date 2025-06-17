package com.sprint.mission.discodeit.service;

import com.sprint.mission.discodeit.entity.Message;

import java.util.List;
import java.util.UUID;

public interface MessageService {

    Message createMessage(String content, UUID userId, UUID channelId);
    Message getMessageById(UUID messageId);
    List<Message> getAllMessages();
    Message updateMessage(UUID messageId, String content);
    void deleteMessage(UUID messageId);
}
