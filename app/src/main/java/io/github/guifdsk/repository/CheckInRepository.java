package io.github.guifdsk.repository;

import io.github.guifdsk.domain.ckeckin.CheckIn;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckInRepository extends JpaRepository<CheckIn, Integer> {
}
