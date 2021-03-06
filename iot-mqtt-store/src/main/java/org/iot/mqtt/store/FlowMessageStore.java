package org.iot.mqtt.store;

import java.util.Collection;

import org.iot.mqtt.common.bean.Message;


public interface FlowMessageStore {

    void clearClientFlowCache(String clientId);

    Message getRecMsg(String clientId, int msgId);

    boolean cacheRecMsg(String clientId,Message message);

    Message releaseRecMsg(String clientId,int msgId);

    boolean cacheSendMsg(String clientId,Message message);

    Collection<Message> getAllSendMsg(String clientId);

    boolean releaseSendMsg(String clientId,int msgId);

    boolean containSendMsg(String clientId,int msgId);

	int getAllSendMsgCount(String clientId);

	Collection<Message> getSendMsg(String clientId, int nums);

}
