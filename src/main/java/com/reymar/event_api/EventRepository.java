package com.reymar.event_api;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface EventRepository extends JpaRepository<EventServiceDTO, Long> {
	@Transactional
	@Modifying
	@Query(
			value = "UPDATE Event e SET e.title = ?1, e.place = ?2, e.speaker = ?3, e.event_type = ?4, e.date_event = ?5 where e.id = ?6",
			nativeQuery = true)
	void updateEventById(String title, String place, String speaker, String type, LocalDate date, Long id);
	List<EventServiceDTO> findAllByTitle(String title);
}
