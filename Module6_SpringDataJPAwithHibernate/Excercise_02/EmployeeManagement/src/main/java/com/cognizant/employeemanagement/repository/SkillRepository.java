package com.cognizant.employeemanagement.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.employeemanagement.entity.Skill;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer> {

}
