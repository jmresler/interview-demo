package org.jmresler.jpa.model.dao;

import org.jmresler.jpa.model.Agencies;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AgenciesRepository extends JpaRepository<Agencies, Integer> {

    public List<Agencies> findByOri(final String ori);
}
