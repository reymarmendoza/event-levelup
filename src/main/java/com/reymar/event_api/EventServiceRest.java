package com.reymar.event_api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springdoc.core.annotations.RouterOperation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Event API")
@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class EventServiceRest {

	private final EventServiceAPI eventServiceAPI;

	@Operation(
			summary = "Get all events",
			description = "Retrieve all events"
	)
	@ApiResponses(
			value = {
					@ApiResponse(
							description = "Success",
							responseCode = "200"
					),
					@ApiResponse(
							description = "Error",
							responseCode = "400"
					)
			})
	@ResponseStatus(HttpStatus.OK)
	@GetMapping("/event/all")
	public List<EventServiceDTO> getAllEvent() {
		return eventServiceAPI.getAllEvents();
	}

	@Operation(
			summary = "Get all events that match a given title",
			description = "Retrieve all events that match the title"
	)
	@ApiResponses(
			value = {
					@ApiResponse(
							description = "Success",
							responseCode = "200"
					),
					@ApiResponse(
							description = "Error",
							responseCode = "400"
					)
			})
	@ResponseStatus(HttpStatus.OK)
	@GetMapping("/event/title")
	public List<EventServiceDTO> getAllEventsByTitle(@RequestParam String title) {
		return eventServiceAPI.getAllEventsByTitle(title);
	}

	@Operation(
			summary = "Get event",
			description = "Retrieve event by Id"
	)
	@ApiResponses(
			value = {
					@ApiResponse(
							description = "Success",
							responseCode = "200"
					),
					@ApiResponse(
							description = "Error",
							responseCode = "400"
					)
			})
	@ResponseStatus(HttpStatus.OK)
	@GetMapping("/event")
	public EventServiceDTO getEvent(@RequestParam Long id) {
		return eventServiceAPI.getEvent(id);
	}

	@Operation(
			summary = "Create event",
			description = "Add a new event"
	)
	@ApiResponses(
			value = {
					@ApiResponse(
							description = "Success",
							responseCode = "200"
					),
					@ApiResponse(
							description = "Error",
							responseCode = "400"
					)
			})
	@ResponseStatus(HttpStatus.OK)
	@PostMapping("/event")
	public Long createEvent(@RequestBody EventServiceDTO event) {
		return eventServiceAPI.createEvent(event);
	}

	@Operation(
			summary = "Update event",
			description = "Update an existing event"
	)
	@ApiResponses(
			value = {
					@ApiResponse(
							description = "Success",
							responseCode = "200"
					),
					@ApiResponse(
							description = "Error",
							responseCode = "400"
					)
			})
	@ResponseStatus(HttpStatus.OK)
	@PutMapping("/event")
	public Long updateEvent(
			@RequestParam Long id,
			@RequestBody EventServiceDTO event
	) {
		return eventServiceAPI.updateEvent(id, event);
	}

	@Operation(
			summary = "Delete event",
			description = "Remove an event"
	)
	@ApiResponses(
			value = {
					@ApiResponse(
							description = "Success",
							responseCode = "200"
					),
					@ApiResponse(
							description = "Error",
							responseCode = "400"
					)
			})
	@ResponseStatus(HttpStatus.OK)
	@DeleteMapping("/event")
	public Boolean deleteEvent(@RequestParam Long id) {
		return eventServiceAPI.deleteEvent(id);
	}
}
