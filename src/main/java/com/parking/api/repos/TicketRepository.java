package com.parking.api.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parking.api.models.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

}
