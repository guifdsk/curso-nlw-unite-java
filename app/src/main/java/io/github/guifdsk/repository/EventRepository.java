package io.github.guifdsk.repository;

import io.github.guifdsk.domain.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, String> {
}
