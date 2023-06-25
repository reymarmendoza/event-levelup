package com.reymar.event_api;

import java.util.List;

interface EventServiceAPI {
	Long createEvent(EventServiceDTO dto);
	Long updateEvent(EventServiceDTO dto);
	EventServiceDTO getEvent(Long id);
	EventServiceDTO deleteEvent(Long id);
	List<EventServiceAPI> getAllEvents();
	List<EventServiceAPI> getAllEventsByTitle(String title);
}
