package com.example.Springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Springboot.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long>{

}
