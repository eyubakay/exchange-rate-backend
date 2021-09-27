package com.finance.exchangerateservice.app.repository;

import com.finance.exchangerateservice.app.aop.annotation.Loggable;
import com.finance.exchangerateservice.app.entity.ExchangeRate;
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

    @Query(value = "SELECT o FROM ExchangeRate o where o.date=:_date")
    ExchangeRate getExchangeRateByDate(@Param("_date") LocalDate _date);

}
