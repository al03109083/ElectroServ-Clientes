package com.clientes.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.clientes.modelo.Cliente;

public class ClienteDAO {

    // 🔹 MÉTODO GUARDAR (YA LO TENÍAS)
    public boolean guardar(Cliente c) {

        try {
            Connection con = Conexion.getConexion();

            String sql = "INSERT INTO clientes(nombre, empresa, telefono, correo) VALUES(?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, c.getNombre());
            ps.setString(2, c.getEmpresa());
            ps.setString(3, c.getTelefono());
            ps.setString(4, c.getCorreo());

            ps.executeUpdate();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // 🔥 MÉTODO NUEVO: LISTAR CLIENTES
    public ArrayList<Cliente> listar() {

        ArrayList<Cliente> lista = new ArrayList<>();

        try {
            Connection con = Conexion.getConexion();

            String sql = "SELECT * FROM clientes";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Cliente c = new Cliente();

                c.setNombre(rs.getString("nombre"));
                c.setEmpresa(rs.getString("empresa"));
                c.setTelefono(rs.getString("telefono"));
                c.setCorreo(rs.getString("correo"));

                lista.add(c);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }
}