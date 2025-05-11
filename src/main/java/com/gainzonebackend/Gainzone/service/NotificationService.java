package com.gainzonebackend.Gainzone.service;

import com.gainzonebackend.Gainzone.model.Notification;

import java.util.List;

public interface NotificationService {
    List<Notification> getAAllNotifications();
    Notification getNotificationById(Long id);
    Notification saveNotification(Notification notification);
    Notification updateNotification(Long id, Notification notification);
    void removeById(Long id);
}
