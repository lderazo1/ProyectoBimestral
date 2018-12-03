package ProyectoBimestre;

import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public abstract class PruebaGestion extends GestionFacultad {

    public static ArrayList<GestionFacultad> Facultad = new ArrayList<GestionFacultad>();

    public static void main(String[] args) {

        String pedir, nombre, apellido, id, anio, numDes = null, opcion = null, tipo;

        Empleado emp = new Empleado() {
            @Override
            public void generaSueldo() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        Estudiante est = new Estudiante() {
            @Override
            public void generaSueldo() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        Profesor prf = new Profesor() {
            @Override
            public void generaSueldo() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        JOptionPane.showMessageDialog(null, "Bienvenido al programa");
        do {
                pedir = JOptionPane.showInputDialog(null, "Seleccione su Usuario\n1. Empleado\n2.Estudiante\n3.Profesor\n4.Salir");
                switch (Integer.parseInt(pedir)) {
                    case 1: {
                        do {
                            opcion = JOptionPane.showInputDialog(null, "Empleado\n1. Registro Empleado\n2. Cambio Despacho\n3. Calculo Salario \n4. Presentación Dato\n5. Salir");
                            switch (Integer.parseInt(opcion)) {
                                case 1: {
                                    id = JOptionPane.showInputDialog(null, "Su Cédula: ");
                                    emp.setId(id);
                                    nombre = JOptionPane.showInputDialog(null, "Su Nombre: ");
                                    emp.setNombre(nombre);
                                    apellido = JOptionPane.showInputDialog(null, "Su Apellido: ");
                                    emp.setApellido(apellido);
                                    anio = JOptionPane.showInputDialog(null, "Año en el que empezó a laborar en la empresa: ");
                                    emp.setAnioincorporacion(Integer.parseInt(anio));
                                    numDes = JOptionPane.showInputDialog(null, "Ingrese el número de su cubículo: ");
                                    emp.setAnioincorporacion(Integer.parseInt(numDes));
                                    break;
                                }
                                case 2: {
                                    numDes = JOptionPane.showInputDialog(null, "Ingrese su nuevo número de Despacho:");
                                    emp.cambioDespacho(Integer.parseInt(numDes));
                                    JOptionPane.showMessageDialog(null, "Despacho cambiado con exito");
                                    break;
                                }
                                case 3: {
                                    emp.generaSueldo(Integer.parseInt(numDes));
                                    JOptionPane.showMessageDialog(null, "Salario Generado con éxito");
                                    break;
                                }
                                case 4: {
                                    JOptionPane.showMessageDialog(null, emp.toString());
                                    break;
                                }
                            }
                        } while (Integer.parseInt(opcion) != 4);
                        break;
                    }
                    case 2: {
                        do {
                            opcion = JOptionPane.showInputDialog(null, "Estudiante\n1. Registro Estudiante\n2. Matrícula nuevo ciclo\n3. Salario por Beca \n4. Presentación Dato\n5. Salir");
                            switch (Integer.parseInt(opcion)) {
                                case 1: {
                                    id = JOptionPane.showInputDialog(null, "Su Cédula: ");
                                    est.setId(id);
                                    nombre = JOptionPane.showInputDialog(null, "Su Nombre: ");
                                    est.setNombre(nombre);
                                    apellido = JOptionPane.showInputDialog(null, "Su Apellido: ");
                                    est.setApellido(apellido);
                                    anio = JOptionPane.showInputDialog(null, "Ciclo académico: ");
                                    est.setCiclo(Integer.parseInt(anio));
                                    break;
                                }
                                case 2: {
                                    numDes = JOptionPane.showInputDialog(null, "Ingrese el ciclo a matricularse:");
                                    est.matricular(Integer.parseInt(numDes));
                                    JOptionPane.showMessageDialog(null, "Matriculado con exito");
                                    break;
                                }
                                case 3: {
                                    numDes = JOptionPane.showInputDialog(null, "¿Usted posee Beca\n1. Si\n2. No?");
                                    if (Integer.parseInt(numDes) == 1) {
                                        est.generaSueldo(1);
                                        JOptionPane.showMessageDialog(null, "Proceso Generado con éxito");
                                    } else {
                                        est.generaSueldo(2);
                                        JOptionPane.showMessageDialog(null, "Proceso Generado con éxito");
                                    }
                                    break;
                                }
                                case 4: {
                                    JOptionPane.showMessageDialog(null, est.toString(Integer.parseInt(numDes)));
                                    break;
                                }
                            }
                        } while (Integer.parseInt(opcion) != 4);
                        break;
                    }
                    case 3: {
                        do {
                            opcion = JOptionPane.showInputDialog(null, "Profesor\n1. Registro Profesor\n2. Registro Area Trabajo\n3. Cálculo Salario \n4. Presentación Dato\n5. Salir");
                            switch (Integer.parseInt(opcion)) {
                                case 1: {
                                    id = JOptionPane.showInputDialog(null, "Su Cédula: ");
                                    prf.setId(id);
                                    nombre = JOptionPane.showInputDialog(null, "Su Nombre: ");
                                    prf.setNombre(nombre);
                                    apellido = JOptionPane.showInputDialog(null, "Su Apellido: ");
                                    prf.setApellido(apellido);
                                    break;
                                }
                                case 2: {
                                    numDes = JOptionPane.showInputDialog(null, "Seleccione Area\n1.Area Técnica\n2.Area SocioHumanística\n3. Area Biológica\n4. Area Idiomas");
                                    prf.asignArea(Integer.parseInt(numDes));
                                    opcion = JOptionPane.showInputDialog(null, "Seleccione Tipo Trabajador\n1.Tiempo Completo\n2.Tiempo Parcial");
                                    JOptionPane.showMessageDialog(null, "Registrado con exito");
                                    break;
                                }
                                case 3: {
                                    if (Integer.parseInt(opcion) == 1) {
                                        prf.generaSueldo(1);
                                        JOptionPane.showMessageDialog(null, "Salario Generado con éxito");
                                    } else {
                                        prf.generaSueldo(2);
                                        JOptionPane.showMessageDialog(null, "Salario Generado con éxito");
                                    }
                                    break;
                                }
                                case 4: {
                                    if (Integer.parseInt(opcion) == 1) {
                                        prf.generaSueldo(1);
                                    JOptionPane.showMessageDialog(null, prf.toString(1));
                                    } else {
                                        prf.generaSueldo(2);
                                    JOptionPane.showMessageDialog(null, prf.toString(2));
                                    }
                                    break;
                                }
                            }
                        } while (Integer.parseInt(opcion) != 4);
                        break;
                    }
                    case 4: {
                        JOptionPane.showMessageDialog(null,"Gracias por usar el sistema...");

                    }
                }
         } while (Integer.parseInt(pedir) != 4);
    }
}
