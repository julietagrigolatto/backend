package com.portfolio.MariaJulietaGrigolatto.Repository;

import com.portfolio.MariaJulietaGrigolatto.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {
    
}
