/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.MariaJulietaGrigolatto.Security.Service;

import com.portfolio.MariaJulietaGrigolatto.Security.Entity.Usuario;
import com.portfolio.MariaJulietaGrigolatto.Security.Repository.iUsuarioRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    iUsuarioRepository iusuarioRepository;
    public Optional <Usuario> getByNombreUsuario(String nombreUsuario){
        return iusuarioRepository.findByNombreUsuario (nombreUsuario);
    }
    public boolean exustByNombreUsuario (String nombreUsuario){
        return iusuarioRepository.existsByNombreUsuario (nombreUsuario);
    }
    public boolean existsByEmail (String email){
        return iusuarioRepository.existsByEmail(email);
    }
    public void save (Usuario usuario){
        iusuarioRepository.save(usuario);
    }

    public boolean existByNombreUsuario(String nombreUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}   
