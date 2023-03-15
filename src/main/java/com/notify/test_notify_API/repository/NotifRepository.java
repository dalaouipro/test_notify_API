package com.notify.test_notify_API.repository;

import com.notify.test_notify_API.entity.Notif;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotifRepository extends JpaRepository<Notif, Integer> {
    List<Notif> findByValue(float value);
    List<Notif> findByTitle(String title);
    List<Notif> findByIsCompleteTrue();
    List<Notif> findByIsCompleteFalse();
}
