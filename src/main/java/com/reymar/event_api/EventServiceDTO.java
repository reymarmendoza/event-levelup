package com.reymar.event_api;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Event")
public class EventServiceDTO {
	@Schema(name = "Event ID", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Schema(name = "Title", example = "F1", requiredMode = Schema.RequiredMode.REQUIRED)
	private String title;
	@Schema(name = "Place", example = "Monaco", requiredMode = Schema.RequiredMode.REQUIRED)
	private String place;
	@Schema(name = "Speaker", example = "Verstappen", requiredMode = Schema.RequiredMode.REQUIRED)
	private String speaker;
	@Schema(name = "Event type", example = "Race", requiredMode = Schema.RequiredMode.REQUIRED)
	private String eventType;
	@Schema(name = "Date event", example = "2023-12-31", requiredMode = Schema.RequiredMode.REQUIRED, pattern = "YYYY-MM-DD")
	private LocalDate dateEvent;

	public EventServiceDTO(String title, String place, String speaker, String eventType, LocalDate dateEvent) {
		this.title = title;
		this.place = place;
		this.speaker = speaker;
		this.eventType = eventType;
		this.dateEvent = dateEvent;
	}
}
