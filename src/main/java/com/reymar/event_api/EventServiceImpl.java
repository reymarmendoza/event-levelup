package com.reymar.event_api;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class EventServiceImpl implements EventServiceAPI{

	private final EventRepository eventRepository;

	@Override
	public Long createEvent(EventServiceDTO dto) {
		return eventRepository.save(dto).getId();
	}

	@Override
	public Long updateEvent(Long id, EventServiceDTO dto) {
		eventRepository.updateEventById(
				dto.getTitle(),
				dto.getPlace(),
				dto.getSpeaker(),
				dto.getEventType(),
				dto.getDateEvent(),
				id);
		return id;
	}

	@Override
	public EventServiceDTO getEvent(Long id) {
		return eventRepository.findById(id).orElseThrow();
	}

	@Override
	public boolean deleteEvent(Long id) {
		Optional<EventServiceDTO> exist = eventRepository.findById(id);
		if (exist.isPresent()) {
			eventRepository.deleteById(id);
			return true;
		} else return false;
	}

	@Override
	public List<EventServiceDTO> getAllEvents() {
		return eventRepository.findAll();
	}

	@Override
	public List<EventServiceDTO> getAllEventsByTitle(String title) {
		return eventRepository.findAllByTitle(title);
	}
}
