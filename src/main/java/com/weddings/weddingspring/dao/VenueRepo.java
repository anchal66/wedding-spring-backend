package com.weddings.weddingspring.dao;

import com.weddings.weddingspring.entity.Venue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VenueRepo extends JpaRepository<Venue, Long> {
}
