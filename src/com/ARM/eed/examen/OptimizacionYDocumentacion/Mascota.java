package com.ARM.eed.examen.OptimizacionYDocumentacion;


/**
 * <p>
 * Clase mascota.
 * @author andres
 *
 */
public class Mascota {

  private int age;
  protected String name;

  public Mascota() {
    super();
  }

  public void setAge(int age) throws EdadErroneaException {
  	if (age < 0)
  		throw new EdadErroneaException("La edad no puede ser negativa");
  	this.age = age;
  }

  public int getAge() {
  	return this.age;
  }

  public String ladrar() {
  	String string = "GUAUUUUUUUUUU";
    return string;
  }

  public String getName() {
  	return name;
  }

}
