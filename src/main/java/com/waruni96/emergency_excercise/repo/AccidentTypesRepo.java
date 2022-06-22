package com.waruni96.emergency_excercise.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.waruni96.emergency_excercise.model.AccidentTypes;

public interface AccidentTypesRepo extends JpaRepository<AccidentTypes,Integer >{

	List<AccidentTypes> findByTcIdAndLvIdAndLcId(int tcId, int lvId, int lcId);
	List<AccidentTypes> findByAccName(String accName);
	@Query(value= "{call search(:tcId,:lvId,:lcId)}" , nativeQuery = true)
	List<AccidentTypes> search(
			@Param("tcId") int tcId,
			@Param("lvId") int lvId,
			@Param("lcId") int lcId
			);
}
