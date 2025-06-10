package com.contentserver.demo.services;

import com.contentserver.demo.data.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private final List<Topic> topicList = new ArrayList<>(Arrays.asList(
        new Topic(1, "Spring"),
        new Topic(2, "Spring Boot"),
        new Topic(3, "Java Spring Boot")
    ));

    public List<Topic> getAllTopics() {
        return topicList;
    }

    public Topic getTopic (int id) {
        return topicList.stream().
                filter(topic -> topic.getTopicId() == id)
                .findFirst()
                .orElse(null);
    }

    public boolean addTopic(Topic topic) {
        return topicList.add(topic);
    }

    public Topic updateTopic(int id, Topic newTopic) {
        Topic targetTopic = getTopic(id);

        if (targetTopic != null) {
            topicList.set(topicList.indexOf(targetTopic), newTopic);

            return targetTopic;
        }

        return null;
    }

    public Topic deleteTopic(int id) {
        Topic targetTopic = getTopic(id);

        return topicList.remove(targetTopic) ? targetTopic : null;
    }
}
