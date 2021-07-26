package ua.casten.bowling.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.casten.bowling.model.Frame;

import java.util.List;

@Repository
public interface FrameRepository extends JpaRepository<Frame, Long> {
}