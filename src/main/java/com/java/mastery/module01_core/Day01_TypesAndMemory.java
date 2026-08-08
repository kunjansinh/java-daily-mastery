package com.java.mastery.module01_core;

public class Day01_TypesAndMemory 
{
    
    public static void main(String[] args) 
    {
        
        // 1. Primitive Data Types (Stored directly on the Stack)
        int maxSpeed = 120;
        double fuelCapacity = 45.5;
        boolean isEngineOn = true;
        char grade = 'A';

        // 2. Reference Types (Stored on the Heap, Garbage Collector managed)
        String vehicleModel = "Cyberpunk 2077 Quadra";

        // 3. Output to Console
        System.out.println("--- Vehicle Status ---");
        System.out.println("Model: " + vehicleModel);
        System.out.println("Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel: " + fuelCapacity + "L");
        System.out.println("Engine Running: " + isEngineOn);
    }
}