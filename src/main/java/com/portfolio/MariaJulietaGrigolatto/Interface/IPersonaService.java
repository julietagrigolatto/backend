package com.portfolio.MariaJulietaGrigolatto.Interface;

import com.portfolio.MariaJulietaGrigolatto.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    public List<Persona> getPersona() ;
    
    public void savePersona(Persona persona);
    public void deletePersona(Long id);
    public Persona findPersona(Long id);
    
}
