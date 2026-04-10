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

    public boolean autenticarUsuario(UsuarioDTO usuarioDTO) {
        String usuario = usuarioDTO.getUsuario();
        String senha = usuarioDTO.getSenha();

        return usuario.equals("admin") && senha.equals("1234");
    }
}
