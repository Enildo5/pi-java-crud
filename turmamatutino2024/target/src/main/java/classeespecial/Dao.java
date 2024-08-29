/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classeespecial;

import java.util.ArrayList;

/**
 *
 * @author Senac
 */
public interface Dao {
    public void insert(Object o);
    public void update(Object o);
    public void delet(int cod);
    public ArrayList<Object> SelectAll();
    
    
}
