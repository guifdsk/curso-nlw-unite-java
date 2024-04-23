package io.github.guifdsk.repository;

import io.github.guifdsk.domain.attendee.Attendee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendeeRepository extends JpaRepository<Attendee, String> {
}
