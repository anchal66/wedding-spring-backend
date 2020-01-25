package com.weddings.weddingspring.dao;

import com.weddings.weddingspring.entity.BanquetHalls;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
// below Atnnotation for name of Json entry and path /banquet-halls
@RepositoryRestResource(collectionResourceRel = "banquetHalls", path = "banquet-halls")
public interface BanquetHallsRepo extends JpaRepository<BanquetHalls, Long> {
}
