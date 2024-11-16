/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import javax.swing.*;
import java.awt.event.ActionListener;

public class EstudianteVista extends JFrame {
    private JTextField txtCodigo, txtNombre, txtEmail;
    private JComboBox<String> comboColonia, comboCarrera;
    private JButton btnGuardar, btnActualizar, btnEliminar, btnBuscar;

    public EstudianteVista() {
        setTitle("Gestión de Estudiantes");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblCodigo = new JLabel("Código:");
        lblCodigo.setBounds(20, 20, 80, 25);
        add(lblCodigo);

        txtCodigo = new JTextField();
        txtCodigo.setBounds(100, 20, 150, 25);
        add(txtCodigo);

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(20, 50, 80, 25);
        add(lblNombre);

        txtNombre = new JTextField();
        txtNombre.setBounds(100, 50, 150, 25);
        add(txtNombre);

        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setBounds(20, 80, 80, 25);
        add(lblEmail);

        txtEmail = new JTextField();
        txtEmail.setBounds(100, 80, 150, 25);
        add(txtEmail);

        btnGuardar = new JButton("Guardar");
        btnGuardar.setBounds(50, 200, 100, 30);
        add(btnGuardar);
    }

    public String getCodigo() { return txtCodigo.getText(); }
    public String getNombre() { return txtNombre.getText(); }
    public String getEmail() { return txtEmail.getText(); }

    public void addGuardarListener(ActionListener listener) {
        btnGuardar.addActionListener(listener);
    }
}

