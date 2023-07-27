package com.matz.domain.model;

/*
This class is used to represent a location where smart home gadgets are located
 */
public record Location(int id, String name) {
    public static LocationBuilder builder() {
        return new LocationBuilder();
    }

    public static class LocationBuilder {
        private int id;
        private String name;

        public LocationBuilder id(int id) {
            this.id = id;
            return this;
        }

        public LocationBuilder name(String name) {
            this.name = name;
            return this;
        }

        public Location build() {
            return new Location(id, name);
        }
    }
}
