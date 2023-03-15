package com.notify.test_notify_API.service;

import com.notify.test_notify_API.entity.Notif;
import com.notify.test_notify_API.repository.NotifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotifService {
    @Autowired
    NotifRepository notifRepository;

    public List<Notif> findAll() {return notifRepository.findAll();}
    public Optional<Notif> findById(int id) {return notifRepository.findById(id);}
    List<Notif> findByValue(float value) {return notifRepository.findByValue(value);}
    public List<Notif> findByTitle(String title) {return notifRepository.findByTitle(title);}
    List<Notif> findByIsCompleteTrue() {return notifRepository.findByIsCompleteTrue();}
    List<Notif> findByIsCompleteFalse() {return notifRepository.findByIsCompleteFalse();}
    public void save (Notif todo) {notifRepository.save(todo);}
    public void delete (Notif todo) {notifRepository.delete(todo);}
}
