package com.example.demojpa.repository;

import com.example.demojpa.domain.Subscription;
import org.springframework.data.repository.CrudRepository;

public interface SubscriptionRepository extends CrudRepository<Subscription, Long> {
    //@Query("select u from Teacher u where u.name like %?1")
    // List<Teacher> findByName(String name);

}

