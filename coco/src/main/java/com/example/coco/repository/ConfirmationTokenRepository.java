/*package com.example.coco.repository;

import com.example.coco.token.ConfirmationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Optional;

@Repository
public interface ConfirmationTokenRepository
        extends JpaRepository<ConfirmationToken,Long> {

     Optional<ConfirmationToken> findByToken(String token);
     Optional<ConfirmationToken> findConfirmationTokenByUserUserId(Long id);

     @Transactional
     @Modifying
     @Query("UPDATE ConfirmationToken c " +
             "SET c.confirmAt = ?2 " +
             "WHERE c.token = ?1")
     int updateConfirmedToken(String token, LocalDateTime localDateTime);
}
*/