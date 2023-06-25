package com.reymar.event_api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class EventServiceRest {

	private final EventServiceAPI eventServiceAPI;

	@ResponseStatus(HttpStatus.OK)
	@GetMapping("/event")
	public EventServiceDTO getEvent(@RequestParam Long id) {
		return eventServiceAPI.getEvent(id);
	}
}
