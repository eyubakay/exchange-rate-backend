package com.integratedfinance.exchangerateservice.app.repository;

import com.integratedfinance.exchangerateservice.app.aop.annotation.Loggable;
import com.integratedfinance.exchangerateservice.app.entity.ExchangeRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

/**
 * @author Eyüp Akay
 */
@Loggable
@Repository
public interface ExchangeRepository extends JpaRepository<ExchangeRate, Long> {

    @Query(value = "SELECT o FROM ExchangeRate o where o.date=:today_date")
    ExchangeRate getLatest(@Param("today_date") LocalDate localDate);

}
