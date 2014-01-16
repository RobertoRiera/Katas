package Kata5;

public interface AttributeExtractor<Entity, Attribute> {

    public Attribute extract(Entity entity);
    
}