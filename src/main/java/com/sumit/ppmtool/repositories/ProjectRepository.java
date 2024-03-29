package com.sumit.ppmtool.repositories;

import com.sumit.ppmtool.domain.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {

    Project findByProjectIdentifier(String projectId);

    @Override
    Iterable<Project> findAll();

    @Override
    Iterable<Project> findAllById(Iterable<Long> iterable);
}
