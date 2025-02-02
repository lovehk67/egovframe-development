package net.java.amateras.uml.activitydiagram.model;

import net.java.amateras.uml.model.AbstractUMLEntityModel;
import net.java.amateras.uml.model.ICloneableModel;

import org.eclipse.draw2d.geometry.Rectangle;

/**
 * 
 * @author Naoki Takezoe
 */
public class InitialStateModel extends AbstractUMLEntityModel implements ICloneableModel {
	private static final long serialVersionUID = -7642772640483776512L;

	public Object clone(){
		InitialStateModel model = new InitialStateModel();
		model.setParent(getParent());
		model.setConstraint(new Rectangle(getConstraint()));
		return model;
	}
}
