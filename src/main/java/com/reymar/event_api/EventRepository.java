package com.reymar.event_api;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<EventServiceDTO, Long> {}
