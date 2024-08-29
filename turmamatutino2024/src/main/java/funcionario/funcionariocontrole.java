/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionario;

import classeespecial.Dao;
import java.util.ArrayList;

/**
 *
 * @author Senac
 */
public class funcionariocontrole implements Dao {

    @Override
    public void insert(Object o) {
        funcionrioDao fd = new funcionrioDao();
        fd.insert(o);
        
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Object o) {
        funcionrioDao fd = new funcionrioDao();
        fd.update(o);
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delet(int cod) {
        funcionrioDao fd = new funcionrioDao();
       fd.delet(cod);
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
