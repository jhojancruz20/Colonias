/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Estudiante;
import modelo.EstudianteDAO;
import vista.EstudianteVista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class EstudianteControlador {
    private EstudianteDAO estudianteDAO;
    private EstudianteVista vistaEstudiante;

    public EstudianteControlador(EstudianteDAO estudianteDAO, EstudianteVista vistaEstudiante) {
        this.estudianteDAO = estudianteDAO;
        this.vistaEstudiante = vistaEstudiante;
        this.vistaEstudiante.addGuardarListener(new GuardarEstudianteListener());
    }

    class GuardarEstudianteListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                Estudiante estudiante = new Estudiante(
                    vistaEstudiante.getCodigo(),
                    vistaEstudiante.getNombre(),
                    vistaEstudiante.getEmail(),
                    1, // Valores temporales
                    1
                );
                estudianteDAO.registrarEstudiante(estudiante);
                vistaEstudiante.mostrarMensaje("Estudiante registrado con éxito");
            } catch (SQLException ex) {
                vistaEstudiante.mostrarMensaje("Error: " + ex.getMessage());
            }
        }
    }
}

