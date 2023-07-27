package com.matz.domain.model.location;

import java.util.Objects;

/*
This class is used to represent a location where smart home gadgets are located
 */
public final class Location {
  private final int id;
  private final String name;

  public Location(int id, String name) {
    this.id = id;
    this.name = name;
  }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
  public boolean equals(Object obj) {
    if (obj == this) return true;
    if (obj == null || obj.getClass() != this.getClass()) return false;
    var that = (Location) obj;
    return this.id == that.id && Objects.equals(this.name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    return "Location[" + "id=" + id + ", " + "name=" + name + ']';
  }
}
