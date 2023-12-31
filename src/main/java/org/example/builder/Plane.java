package org.example.builder;

import lombok.Getter;

@Getter
public class Plane {
    private final String model;
    private final String type;
    private final Double length;
    private final Double weight;
    private final String engineType;
    private final Integer engineCount;
    private final Integer maxSpeed;

    private Plane(builder builder) {
        this.model = builder.model;
        this.type = builder.type;
        this.length = builder.length;
        this.weight = builder.weight;
        this.engineType = builder.engineType;
        this.engineCount = builder.engineCount;
        this.maxSpeed = builder.maxSpeed;
    }

    public static class builder {
        private String model;
        private String type;
        private Double length;
        private Double weight;
        private String engineType;
        private Integer engineCount;
        private Integer maxSpeed;

        public builder model(String model) {
            this.model = model;
            return this;
        }

        public builder type(String type) {
            this.type = type;
            return this;
        }

        public builder length(Double length) {
            this.length = length;
            return this;
        }

        public builder weight(Double weight) {
            this.weight = weight;
            return this;
        }

        public builder engineType(String engineType) {
            this.engineType = engineType;
            return this;
        }

        public builder engineCount(Integer engineCount) {
            this.engineCount = engineCount;
            return this;
        }

        public builder maxSpeed(Integer maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
