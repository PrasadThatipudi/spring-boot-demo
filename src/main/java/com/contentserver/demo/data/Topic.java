package com.contentserver.demo.data;

public class Topic {
    private String topicName;
    private int topicId;

    public Topic(int topicId, String topicName) {
        this.topicId = topicId;
        this.topicName = topicName;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public int getTopicId() {
        return topicId;
    }

    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }
}
