package org.be.graphbt.graphiti.features;

import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

import org.be.graphbt.model.graphbt.Composition;
import org.be.graphbt.model.graphbt.Edge;
import org.be.graphbt.graphiti.GraphBTUtil;
import org.be.graphbt.model.graphbt.Link;
import org.be.graphbt.model.graphbt.StandardNode;

/**
 * Class CreateAtomicConnectionGraphBtFeature is for creating atomic edge model 
 * of two connected BT node
 * @author GraphBT Team
 *
 */
public class CreateAtomicConnectionGraphBtFeature 
		extends AbstractCreateConnectionFeature
		implements ICreateConnectionFeature {

	public CreateAtomicConnectionGraphBtFeature(IFeatureProvider fp) {
		super(fp, "Atomic", "Creates a new atomic " +
				"composition edge between nodes");
	}

	@Override
	public boolean canStartConnection(ICreateConnectionContext context) {
		if (getStandardNode(context.getSourceAnchor()) != null) {
			StandardNode md = getStandardNode(context.getSourceAnchor());
			if(md.getEdge()==null)
            return true;
			
        }
        return false;
	}

	@Override
	public boolean canCreate(ICreateConnectionContext context) {
		StandardNode source = getStandardNode(context.getSourceAnchor());
		StandardNode target = getStandardNode(context.getTargetAnchor());
        
		if (source != null && target != null && source != target && target != source) {
			if(!target.isLeaf())
            return true;
        }
        
        return false;
	}

	@Override
	public Connection create(ICreateConnectionContext context) {
		Connection newConnection = null; 

        // get EClasses which should be connected
        StandardNode source = getStandardNode(context.getSourceAnchor());
        StandardNode target = getStandardNode(context.getTargetAnchor());

        if (source != null && target != null) {
            // create new business object
            Link l = createLink(source, target);
            if(l==null) {
            	return null;
            }
            // add connection for business object
            AddConnectionContext addContext =
                new AddConnectionContext(context.getSourceAnchor(), 
                		context.getTargetAnchor());
            addContext.setNewObject(l);
            newConnection = (Connection) getFeatureProvider().
            		addIfPossible(addContext);
            
            PictogramElement pes = context.getSourcePictogramElement();
            PictogramElement pet = context.getTargetPictogramElement();
            
            pet.getGraphicsAlgorithm().setX(pes.getGraphicsAlgorithm().getX());
            pet.getGraphicsAlgorithm().setY(
            		pes.getGraphicsAlgorithm().getY() + 
            		pes.getGraphicsAlgorithm().getHeight());
        }

        return newConnection;
	}
	
    private StandardNode getStandardNode(Anchor anchor) {
        if (anchor != null) {
            Object object =
                getBusinessObjectForPictogramElement(anchor.getParent());
            if (object instanceof StandardNode) {
                return (StandardNode) object;
            }
        }
        return null;
    }
    
    private Link createLink(StandardNode source, StandardNode target) {
    	if(GraphBTUtil.isAncestor(target, source)) {
    		return null;
    	}
    	Edge edge = source.getEdge();
        if(edge == null) {
        	edge = GraphBTUtil.getBEFactory().createEdge();
        	edge.setComposition(Composition.ATOMIC);
        	source.setEdge(edge);
        	edge.setContainer(source);
        }
        Link l = GraphBTUtil.getBEFactory().createLink();
		l.setSource(source);
		l.setTarget(target);
		edge.getChildNode().add(l);
        target.setLeaf(true);
        target.setParent(source);
        return l;
   }
}
