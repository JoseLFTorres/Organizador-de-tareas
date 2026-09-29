/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package organizadortareas;

/**
 * Representa una tarea del organizador.
 * Guarda su titulo, prioridad y estado.
 * 
 * @author Jose Luis Fayad Torres
 */
public class Tarea {
    private String titulo;
    private String prioridad;
    private boolean completada;  
    
    public Tarea(String titulo, String prioridad) {

        // Valida que el titulo no este vacio
        if (titulo == null || titulo.trim().isEmpty()) {
            this.titulo = "Sin titulo";
        } 
        else 
        {
            this.titulo = titulo.trim();
        }

        // Valida que exista una prioridad
        if (prioridad == null || prioridad.trim().isEmpty()) {
            this.prioridad = "Baja";
        } 
        else 
        {
            this.prioridad = prioridad.trim();
        }

        // Toda tarea nueva comienza pendiente
        this.completada = false;
    }
    
    // Devuelve el titulo de la tarea
    public String getTitulo(){
        return titulo;
    }
    
    // Permite cambiar el titulo
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    // Devuelve la prioridad
    public String getPrioridad(){
        return prioridad;
    }
    
    // Permite cambiar la prioridad
    public void setProridad(String prioridad){
        this.prioridad = prioridad;
    }
    
    // Devuelve si la tarea esta completada
    public boolean getCompletada(){
        return completada;
    }
    
    // Cambia manualmente el estado de la tarea
    public void setCompletada(boolean completada){
        this.completada = completada;
    }
    
    // Marca la tarea como completada
    public void marcarCompletada(){
        this.completada = true;
    }
    
    // Vuelve a marcar la tarea como pendiente
    public void marcarPendiente(){
        this.completada = false;
    }
    
    // Cambia la prioridad de la tarea
    public void cambiarPrioridad(String nuevaPrioridad){
        this.prioridad = nuevaPrioridad;
    }
    
    // Comprueba si la prioridad es alta
    public boolean esPrioridadAlta(){
        
        if (prioridad.equals("Alta")){
            return true;
        }
        else
        {
            return false;
        }
    }
    
}
