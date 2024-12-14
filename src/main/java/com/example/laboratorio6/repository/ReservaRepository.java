/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.laboratorio6.repository;

import com.example.laboratorio6.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author LAB-SISE-PP
 */
@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Long> {
}
