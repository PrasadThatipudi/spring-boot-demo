package com.contentserver.demo.services;

import com.contentserver.demo.data.Topic;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private final List<Topic> topicList = Arrays.asList(
        new Topic(1, "Spring"),
        new Topic(2, "Spring Boot"),
        new Topic(3, "Java Spring Boot")
    );

    public List<Topic> getAllTopics() {
        return topicList;
    }

    public Topic getTopic (int id) {
        return topicList.stream().filter(topic -> topic.getTopicId() == id).findFirst().orElse(null);
    }
}
