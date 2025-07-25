package com.miguelbarroso.hrworker.repository;

import com.miguelbarroso.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
