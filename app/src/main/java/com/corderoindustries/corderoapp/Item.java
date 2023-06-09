package com.corderoindustries.corderoapp;
import java.time.LocalDate;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;



public class Item extends Cordero  { // Declaro la clase Item, que es tiene numero unico, nombre, costo prioridad e intervalo

    private String name;

    private float cost;

    private int priority;

    private int interval;

    private String lastRefilled;

    private String addedDate;


    public Item(String name, float cost, int priority, int interval, String lastRefilled, String addedDate){ // declaro la funcion additem, que es una funcion de la clase (funcion) AppCordero, que es la principal.
        this.name=name;
        this.cost=cost;
        this.priority=priority;
        this.interval=interval;
        this.lastRefilled=String.valueOf(java.time.LocalDate.now());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }
}
