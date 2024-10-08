package com.ddabong.tripflow.chatbot.service;

import com.ddabong.tripflow.chatbot.dto.UpdateUserStateDTO;
import com.ddabong.tripflow.chatbot.dto.UserStateDTO;
import com.ddabong.tripflow.chatbot.model.ChatLog;

public interface IChatLogService {
    void save(ChatLog chatLog);

    void initState(UserStateDTO userStateDTO);

    UserStateDTO setUserState(Long memberId);

    void updateState(UserStateDTO userStateDTO);

    Long getChatLogId(Long memberId);

    UpdateUserStateDTO setUpdateUserState(Long memberId);
}
