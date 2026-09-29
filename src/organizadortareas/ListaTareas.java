/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package organizadortareas;
import java.util.ArrayList;

/**
 * Administra las tareas del organizador.
 * Utiliza un ArrayList para almacenar objetos de tipo Tarea.
 * 
 * @author Jose Luis Fayad Torres
 */
public class ListaTareas {
    private ArrayList<Tarea> tareas;
    private String nombreLista;
    
    public ListaTareas(String nombreLista) {
        
        // Valida el nombre de la lista
        if (nombreLista == null || nombreLista.trim().isEmpty()) {
            this.nombreLista = "Mis tareas";
        } 
        else 
        {
        this.nombreLista = nombreLista.trim();
        }

        // Crea la lista vacia donde se guardaran las tareas
        this.tareas = new ArrayList<>();
    }
    
    // Agrega una nueva tarea a la lista
    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }
    
    // Devuelve la cantidad total de tareas
    public int cantidadTareas() {
        return tareas.size();
    }
    
    // Comprueba si la lista no contiene tareas
    public boolean estaVacia() {
        return tareas.isEmpty();
    }
    
    // Busca una tarea por su titulo ignorando mayusculas y minusculas
    public Tarea buscarTarea(String tituloBuscado) {

        for (Tarea tarea : tareas) {
            if (tarea.getTitulo().trim().equalsIgnoreCase(tituloBuscado.trim())) {
                return tarea;
            }
        }
        return null;
    }
    
    // Elimina una tarea utilizando su titulo
    public boolean eliminarTarea(String tituloBuscado) {

        Tarea tarea = buscarTarea(tituloBuscado);

        if (tarea != null) {
            tareas.remove(tarea);
            return true;
        }

        return false;
    }
    
    // Muestra las tareas con su prioridad y estado
    public String mostrarTareas() {
        String resultado = "";

        for (Tarea tarea : tareas) {

            String estado;

            if (tarea.getCompletada()) {
                estado = "Completada";
            } 
            else 
            {
                estado = "Pendiente";
            }

            resultado += tarea.getTitulo() + " - " + tarea.getPrioridad() + " - " + estado + "\n";
        }

        return resultado;    
    }
    
    // Cuenta las tareas pendientes utilizando recursividad.
    // El caso base ocurre cuando el indice llega al final de la lista.
    // En cada llamada se avanza a la siguiente tarea con indice + 1.
    public int contarPendientesRecursivo(int indice) {

        if (indice >= tareas.size()) {
            return 0;
        }

        int pendiente = 0;

        if (!tareas.get(indice).getCompletada()) {
            pendiente = 1;
        }

        return pendiente + contarPendientesRecursivo(indice + 1);
    }
    
}


