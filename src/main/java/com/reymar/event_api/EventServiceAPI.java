package com.reymar.event_api;

import java.util.List;

interface EventServiceAPI {
	Long createEvent(EventServiceDTO dto);
	Long updateEvent(Long id, EventServiceDTO dto);
	EventServiceDTO getEvent(Long id);
	boolean deleteEvent(Long id);
	List<EventServiceDTO> getAllEvents();
	List<EventServiceDTO> getAllEventsByTitle(String title);
}
