package com.example.lyclebackend.Member.repository;

import com.example.lyclebackend.Member.entity.ConfirmationToken;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface ConfirmationTokenRepository extends JpaRepository<ConfirmationToken,String> {
    Optional<ConfirmationToken> findByIdAndExpirationDateAfterAndExpired(String confirmationTokenId, LocalDateTime now, boolean expired);

    Optional<List<ConfirmationToken>> findAllByReceiverEmail(String receiverEmail);
    Boolean existsByReceiverEmail(String receiverEmail);
}