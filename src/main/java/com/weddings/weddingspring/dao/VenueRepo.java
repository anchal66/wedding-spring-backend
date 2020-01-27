package com.weddings.weddingspring.dao;

import com.weddings.weddingspring.entity.Venue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface VenueRepo extends JpaRepository<Venue, Long> {
}
