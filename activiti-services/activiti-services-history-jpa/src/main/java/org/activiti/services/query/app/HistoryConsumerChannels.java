package org.activiti.services.query.app;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface HistoryConsumerChannels {

    String HISTORY_CONSUMER = "historyConsumer";

    @Input(HISTORY_CONSUMER)
    SubscribableChannel historyConsumer();
}