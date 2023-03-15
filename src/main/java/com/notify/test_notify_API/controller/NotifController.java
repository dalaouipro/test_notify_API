package com.notify.test_notify_API.controller;

import com.notify.test_notify_API.entity.Notif;
import com.notify.test_notify_API.service.NotifService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1")
public class NotifController {
    @Autowired
    NotifService notifService;

    @GetMapping("/listNotifs")
    public List<Notif> listNotifs() {
        return notifService.findAll();
    }

    @GetMapping("/findNotif/{id}")
    public Notif findNotif(@PathVariable int id) {
        return notifService.findById(id).orElse(null);
    }

    @PutMapping("/createNotif")
    public Notif createNotif( @RequestBody Notif notif) {
        Notif notifNew = notif;
        notifService.save(notifNew);
        return notifNew;
    }

    @PostMapping("/updateNotif/{id}")
    public Notif updateNotif(@PathVariable int id, @RequestBody Notif notif) {
        Notif notifNew = findNotif(id);
        notifNew.setValue(notif.getValue());
        notifNew.setTitle(notif.getTitle());
        notifNew.setComplete(notif.isComplete());
        notifService.save(notifNew);
        return notifNew;
    }
    
    @DeleteMapping("/deleteNotif/{id}")
    public Notif deleteNotif(@PathVariable int id) {
        Notif notif = notifService.findById(id).orElse(null);
        notifService.delete(notif);
        return notif;
    }

}
