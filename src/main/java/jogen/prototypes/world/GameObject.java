package jogen.prototypes.world;

import jogen.prototypes.meta.Constituent;
import jogen.prototypes.meta.Position;
import jogen.prototypes.render.RenderClass;

public class GameObject {
  public String name;
  public Constituent[] madeOf;
  public Position position;
  public RenderClass render;
  
  public boolean takeable = true;

  public Gobject(String name, Constituent[] madeOf, RenderClass render, Position position) {
    this.name = name;
    this.madeOf[] = madeOf[];
    this.render = rend;
    this.positionData = positionData;
  }

  public float getVelocity() {
    return average(this.positionData.velocities);
  }
  public float getRotVelocity() {
    return average(this.positionData.rotVelocities);
  }
}
