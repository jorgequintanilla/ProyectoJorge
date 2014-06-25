/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.jorge.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import pe.edu.upeu.jorge.config.Conexion;
import pe.edu.upeu.jorge.modelo.Distrito;

/**
 *
 * @author alum.fial7
 */
public class DistritoDAO {
    private Connection cx;
    private Statement st;
    private ResultSet rs;
    private String sql;
     ArrayList<Distrito> lista =null;
    public ArrayList<Distrito> listarDistrito(){
        lista = new  ArrayList();
        sql ="select * form distrito";
        try {
        cx = Conexion.getConex;
        st=(Statement) cx.createStatement();
        rs=st.executeQuery(sql); 
        while(rs.next()){
         Distrito d  = new Distrito();
         d.setIdd(rs.getInt("iddistrito"));
         d.setIdr(rs.getInt("idregion"));
         d.setDisc(rs.getString("distrito"));
         d.setEstado(rs.getString("estado"));
         lista.add(d);
        }
        } catch (Exception e) {
        }
        return lista;
    }
    public int idDistrito(String nom){
    int id =0;
    sql = "Select * from distrito where distrito = '"+nom+"'";
     try {
        cx = Conexion.getConex;
        st=(Statement) cx.createStatement();
        rs=st.executeQuery(sql); 
        while(rs.next()){
         id = rs.getInt("iddistrito");
        }
        } catch (Exception e) {
        }
    return id;
    }
}
