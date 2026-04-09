/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.UsuarioDTO;

/**
 *
 * @author aluno.saolucas
 */
public class UsuarioDAO {
    public void salvarUsuario(UsuarioDTO usuarioDTO) {
        // Captura o usuario do DTO
        String usuario = usuarioDTO.getUsuario();
        
        //Captura a senha do usuario;
        String senha = usuarioDTO.getSenha();
    }
}
