package org.example;

import org.example.builder.Plane;

public class App {
    public static void main(String[] args) {
        Plane plane = new Plane.builder()
                .model("Vector")
                .type("Reactive")
                .length(13.5)
                .build();
        System.out.println(plane.getType());
        System.out.println(plane.getLength());
        System.out.println(plane.getMaxSpeed());
    }
}
