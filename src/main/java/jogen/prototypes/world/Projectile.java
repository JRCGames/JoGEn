package jogen.prototypes.world;

public class Projectile extends GameObject {
    public int initialVelocity;
    public int maximumVelocity;
    public int acceleration;
    
    public Projectile(String name, Constituent[] madeOf, RenderClass render, Position position, int initialVelocity, int maximumVelocity, int acceleration) {
      this.name = name;
      this.madeOf[] = madeOf[];
      this.render = render;
      this.position = position;
      this.initialVelocity = initialVelocity;
      this.maximumVelocity = maximumVelocity;
      this.acceleration = acceleration;
    }
    public Projectile(Gobject g, int initialVelocity, int maximumVelocity, int acceleration) {
      this.name = g.name;
      this.madeOf[] = g.madeOf[];
      this.render = g.render;
      this.position = g.position;
      this.initialVelocity = initialVelocity;
      this.maximumVelocity = maximumVelocity;
      this.acceleration = acceleration;
    }
}
