package com.reymar.event_api;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EventServiceImpl implements EventServiceAPI{

	private final EventRepository eventRepository;

	@Override
	public Long createEvent(EventServiceDTO dto) {
		return null;
	}

	@Override
	public Long updateEvent(EventServiceDTO dto) {
		return null;
	}

	@Override
	public EventServiceDTO getEvent(Long id) {
		System.out.println("si senor " + id);
		EventServiceDTO x = eventRepository.findById(id).orElseThrow();
		System.out.println("raush " + x);
		return x;
	}

	@Override
	public EventServiceDTO deleteEvent(Long id) {
		return null;
	}

	@Override
	public List<EventServiceAPI> getAllEvents() {
		return null;
	}

	@Override
	public List<EventServiceAPI> getAllEventsByTitle(String title) {
		return null;
	}
}
