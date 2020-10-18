package com.xi.repository;

import com.xi.domain.SysOrganization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SysOrganizationRepository extends JpaRepository<SysOrganization, Integer> {
}
