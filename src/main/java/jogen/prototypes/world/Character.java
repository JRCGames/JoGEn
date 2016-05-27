package jogen.prototypes.world;

import jogen.prototypes.world.GameObject;
import jogen.attribs.world.Alive;
import jogen.prototypes.meta.item.Inventory;
import jogen.prototypes.render.RenderClass;

public class Character extends GameObject implements Alive {
  public GameObject[] armor;
  public Inventory hands;
  public Inventory inventory;

  public Character(String name, RenderClass render, Attributes attrib) {
    this.name = name;
    this.madeOf = {{Substance_Human, 100}};
    this.render = render;

    this.Attributes.set(attrib);
  }

  public void tick() {
    this.life += (life < maxLife)?1;
    this.life = (life > maxLife)?maxLife;
    this.dead = (life < 1)?true:false;
  }

  public class Attributes {
    public float agility;
    public float dexterity;
    public float flexability;
    public float speed;
    public float strength;

    public int height;
    public int weight;

    public void set(Attributes a) {
      this.agility = a.agility;
      this.dexterity = a.dexterity;
      this.flexability = a.flexability;
      this.speed = a.speed;
      this.strength = a.strength;
      this.height = a.height;
      this.weight = a.weight;
    }
  }
}
