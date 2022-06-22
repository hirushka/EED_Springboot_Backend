package com.waruni96.emergency_excercise.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.waruni96.emergency_excercise.model.Instructions;

public interface InstructionRepo extends JpaRepository<Instructions,Integer >{

	Instructions findByAccId(int accId);
}
