/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import com.mz.sidraTech.controller.ReadFile;
import com.mz.sidraTech.controller.SaveFile;
import com.mz.sidraTech.model.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author celso
 */
public class Teste {
    
    public static void main(String[] args) {
        List<Usuario> usuarios=new ArrayList();
        usuarios=ReadFile.lerUsuarios();
        
        Usuario usuario=new Usuario("Andre", "Mavie", 23,null);
        usuarios.add(usuario);
        SaveFile.guardarListaUsuarios(usuarios);
        System.out.println(ReadFile.lerUsuarios().size());
        
    }
    
}
