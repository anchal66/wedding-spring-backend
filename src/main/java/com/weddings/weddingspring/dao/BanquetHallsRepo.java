package com.weddings.weddingspring.dao;

        import com.weddings.weddingspring.entity.BanquetHalls;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.data.rest.core.annotation.RepositoryRestResource;
        import org.springframework.web.bind.annotation.CrossOrigin;

// below Atnnotation for name of Json entry and path /banquet-halls
@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "banquetHalls", path = "banquet_halls")
public interface BanquetHallsRepo extends JpaRepository<BanquetHalls, Long> {
}
