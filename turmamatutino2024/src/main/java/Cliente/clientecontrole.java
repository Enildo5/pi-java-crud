/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cliente;

import classeespecial.Dao;


/**
 *
 * @author Senac
 */
public class clientecontrole implements Dao {

    @Override
    public void insert(Object o) {
       clientedao cld = new clientedao();
       cld.insert(o);

    }

    @Override
    public void update(Object o) {
         clientedao cld = new clientedao();
        cld.update(0);
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delet(int cod) {
      clientedao cld = new clientedao();
      cld.delet(cod);
      
        
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void selectAll(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tabelacliente().exebirTabela();
                        
            }
        });
    }
}
