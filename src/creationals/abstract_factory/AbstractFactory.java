package creationals.abstract_factory;

public interface AbstractFactory<T> {

    T create(String type);
    
}
