package com.gainzonebackend.Gainzone.service;

import com.gainzonebackend.Gainzone.model.Notification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationServiceImplementation implements NotificationService{
    @Override
    public List<Notification> getAAllNotifications() {
        return null;
    }

    @Override
    public Notification getNotificationById(Long id) {
        return null;
    }

    @Override
    public Notification saveNotification(Notification notification) {
        return null;
    }

    @Override
    public Notification updateNotification(Long id, Notification notification) {
        return null;
    }

    @Override
    public void removeById(Long id) {

    }
}
