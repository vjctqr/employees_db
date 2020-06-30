package com.example.codeclan.employees_db.repositories;

import com.example.codeclan.employees_db.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
