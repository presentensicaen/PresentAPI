/**
 * @author Quentin Debroise <debroise@ecole.ensicaen.fr>
 * @author Coline Smagghe <smagghe@ecole.ensicaen.fr>
 *
 * @version 0.0.1 - Last modified: 21/12/17
 */
package fr.presentapi.dao;


/* TODO: make all models extends this class */
public abstract class Model<T>{
	private QueryBuilder _query;
	
	public Model(){
		_query = new QueryBuilder();
	}
	
	abstract public boolean insert(T obj);
	abstract public boolean exists(Object pk);
	//abstract public boolean get(...);
	//asbstract public boolean delete(...);
}
