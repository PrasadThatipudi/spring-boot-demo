package com.contentserver.demo.controllers;

import com.contentserver.demo.data.Topic;
import com.contentserver.demo.services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {
    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable("id") int id) {
        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/topics")
    public boolean addTopic(@RequestBody Topic topic) {
        return topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PATCH,value = "/topics/{id}")
    public Topic updateTopic(@PathVariable("id") int id, @RequestBody Topic newTopic) {
        return topicService.updateTopic(id, newTopic);
    }
}
