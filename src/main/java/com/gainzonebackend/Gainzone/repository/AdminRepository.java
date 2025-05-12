package com.gainzonebackend.Gainzone.repository;

import com.gainzonebackend.Gainzone.model.Admin;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository <Admin, Long> {

    Admin findByUsername(String username);

    @Transactional
    @Modifying
    @Query("DELETE FROM Admin a WHERE a.username = :username")
    void removeByUsername(@Param("username") String username);

}
