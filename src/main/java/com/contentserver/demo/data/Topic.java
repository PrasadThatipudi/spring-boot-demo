package com.contentserver.demo.data;

public class Topic {
    private String topicName;
    private int topicId;

    public Topic(int topicId, String topicName) {
        this.topicId = topicId;
        this.topicName = topicName;
    }

    @Override
    public String toString() {
        return "Topic [topicName=" + topicName + ", topicId=" + topicId + "]";
    }

    public String getTopicName() {
        return topicName;
    }

    public int getTopicId() {
        return topicId;
    }
}
