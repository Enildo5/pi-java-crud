/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aluno;

import classeespecial.Dao;
import java.util.ArrayList;

/**
 *
 * @author Senac
 */
public class alunocontrole  implements Dao {

    @Override
    public void insert(Object o) {
        alunosDao ad = new alunosDao();
        ad.insert(o);
    }

    @Override
    public void update(Object o) {
        alunosDao ad = new alunosDao();
        ad.update(0);
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delet(int cod) {
        alunosDao ad = new alunosDao();
        ad.delet(cod);
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void SelectAll(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tabelaaluno().exebirTabela();
            } 
        });
        
    }
}
