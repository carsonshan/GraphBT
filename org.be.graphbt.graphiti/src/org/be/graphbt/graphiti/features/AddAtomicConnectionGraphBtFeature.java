package org.be.graphbt.graphiti.features;

import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddConnectionContext;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.IColorConstant;

import org.be.graphbt.graphiti.GraphBTUtil;
import org.be.graphbt.model.graphbt.Link;

/**
 * Class AddAtomicConnectionGraphBtFeature is for adding atomic edge between
 * two connected nodes
 * @author GraphBT Team
 *
 */
public class AddAtomicConnectionGraphBtFeature extends AbstractAddFeature implements
		IAddFeature {

	public AddAtomicConnectionGraphBtFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canAdd(IAddContext context) {
		
		if (context instanceof IAddConnectionContext && 
				context.getNewObject() instanceof Link) {
			return true;
		}
		return false;
	}

	@Override
	public PictogramElement add(IAddContext context) {
		IAddConnectionContext addConContext = (IAddConnectionContext) context;
		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		IGaService gaService = Graphiti.getGaService();
		
		Connection connection = peCreateService.createFreeFormConnection(getDiagram());
		connection.setStart(addConContext.getSourceAnchor());
		connection.setEnd(addConContext.getTargetAnchor());

		Polyline polyline = gaService.createPlainPolyline(connection);
		
		gaService.setLocation(polyline, addConContext.getX(), addConContext.getY());
		polyline.setForeground(manageColor(IColorConstant.BLACK));

		Link addedLink = (Link) context.getNewObject();
		link(connection, addedLink);
		GraphBTUtil.applyTreeLayout(getDiagram());
		return connection;
	}
}
