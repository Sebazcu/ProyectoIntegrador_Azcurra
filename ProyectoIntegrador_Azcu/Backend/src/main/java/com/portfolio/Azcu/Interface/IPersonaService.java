package com.portfolio.Azcu.Interface;

import com.portfolio.Azcu.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    //traer una lista de persona
    public List<Persona> getPersona();

    //Guardar un objeto de tipo persona
    public void savePersona (Persona persona);
    
    //eliminar un objeto pero lo buscamos por ID
    public void deletePersona (Long id);
    
    //buscar una persona por ID
    public Persona findPersona(Long id);
}
