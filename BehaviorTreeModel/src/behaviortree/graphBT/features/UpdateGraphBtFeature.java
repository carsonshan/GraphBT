package behaviortree.graphBT.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.AbstractUpdateFeature;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;

import behaviortree.Behavior;
import behaviortree.Component;
import behaviortree.GraphBTUtil;
import behaviortree.OperatorClass;
import behaviortree.Requirement;
import behaviortree.StandardNode;
import behaviortree.TraceabilityStatusClass;


public class UpdateGraphBtFeature extends AbstractUpdateFeature {
 
    public UpdateGraphBtFeature(IFeatureProvider fp) {
        super(fp);
    }
 
    public boolean canUpdate(IUpdateContext context) {
        // return true, if linked business object is a StandardNode
    	PictogramElement pictogramElement = context.getPictogramElement();
    	Object bo = getBusinessObjectForPictogramElement(pictogramElement);
        
        System.out.println("in update check if standard node: " + (bo instanceof StandardNode));
        System.out.println("in update check if TraceabilityStatusClass: " + (bo instanceof TraceabilityStatusClass));
        System.out.println("where we go: " + ((bo instanceof Component)|| (bo instanceof Behavior)|| (bo instanceof OperatorClass) ||
        		(bo instanceof Requirement) || (bo instanceof TraceabilityStatusClass)));
        
        return ((bo instanceof Component)|| (bo instanceof Behavior)|| (bo instanceof OperatorClass) ||
        		(bo instanceof Requirement) || (bo instanceof TraceabilityStatusClass));
    }
 
    public IReason updateNeeded(IUpdateContext context) {
        // retrieve name from pictogram model
        String pictogramName = null;
        PictogramElement pictogramElement = context.getPictogramElement();
        
        Object bo = getBusinessObjectForPictogramElement(pictogramElement);
        Object oSN = getBusinessObjectForPictogramElement(((Shape)context.getPictogramElement()).getContainer());
        
        if(!(oSN instanceof StandardNode)) {
        	return Reason.createFalseReason();
        }
       	
        StandardNode node = (StandardNode) oSN;
       	System.out.println("This is updateNeeded method");
        String businessName = null;
		
        if (bo instanceof Component) {
			Component c = GraphBTUtil.getComponentByRef(GraphBTUtil.getBEModel(getDiagram()), node.getComponentRef());
			if(c != null)
			{
				businessName = c.getComponentName();
				System.out.println("This is updateNeeded method bo instanceof component: " + businessName);
			}
		}
		else if (bo instanceof Behavior) {
			if(node.getBehaviorRef()!=null) {
				Component c = GraphBTUtil.getComponentByRef(GraphBTUtil.getBEModel(getDiagram()), node.getComponentRef());
				businessName = GraphBTUtil.getBehaviorFromComponentByRef(c, node.getBehaviorRef()).toString();
			}
			else {
				businessName = null;
			}
		}
		else if (bo instanceof Requirement) {
			System.out.println("node.traceabilityLink: " + node.getTraceabilityLink());
			if(node.getTraceabilityLink()!=null) {
				Requirement c = GraphBTUtil.getRequirement(GraphBTUtil.getBEModel(getDiagram()), node.getTraceabilityLink());
				businessName = c.getKey();
			}
			else {
				businessName = null;
			}
		}
		else if (bo instanceof TraceabilityStatusClass) {
			System.out.println("in update needed, TraceabilityStatusClass: " + node.getTraceabilityStatus().getLiteral());
			businessName = node.getTraceabilityStatus().getLiteral();
		}
		else if (bo instanceof OperatorClass) {
			businessName = node.getOperator().getLiteral();
		}

		if(((Shape)pictogramElement).getGraphicsAlgorithm() instanceof Text) {
			pictogramName = ((Text)((Shape)pictogramElement).getGraphicsAlgorithm()).getValue();
		}
		
		System.out.println("pictogramName " + pictogramName);

		// update needed, if names are different
		boolean updateNameNeeded = ((pictogramName == null && businessName != null) || 
				(pictogramName != null && !pictogramName.equals(businessName)));
		if (updateNameNeeded) {
			System.out.println("Update is needed!");
			return Reason.createTrueReason("Name is out of date"); //$NON-NLS-1$
		} else {
			return Reason.createFalseReason();
		}
        // retrieve name from business model
    }
 
    public boolean update(IUpdateContext context) {
        // retrieve name from business model
        String businessName = null;
        PictogramElement pictogramElement = context.getPictogramElement();
        
        Object bo = getBusinessObjectForPictogramElement(pictogramElement);
        Object oSN = getBusinessObjectForPictogramElement(((Shape)context.getPictogramElement()).getContainer());
       	StandardNode node = (StandardNode) oSN;

        if (bo instanceof Component) {
        	businessName = GraphBTUtil.getComponentByRef(GraphBTUtil.getBEModel(getDiagram()), node.getComponentRef()).getComponentName();
            Shape shape = (Shape) pictogramElement;
            
            if (shape.getGraphicsAlgorithm() instanceof Text) {
                Text text = (Text) shape.getGraphicsAlgorithm();
                text.setValue(businessName);
                return true;
             }
        }
        if (bo instanceof Behavior) {
        	businessName = GraphBTUtil.getBehaviorFromComponentByRef(GraphBTUtil.getComponentByRef(GraphBTUtil.getBEModel(getDiagram()), node.getComponentRef()), node.getBehaviorRef()).toString();
            Shape shape = (Shape) pictogramElement;
    
            if (shape.getGraphicsAlgorithm() instanceof Text) {
                Text text = (Text) shape.getGraphicsAlgorithm();
                text.setValue(businessName);
                return true;
             }
        }
        if (bo instanceof Requirement) {
        	businessName = GraphBTUtil.getRequirement(GraphBTUtil.getBEModel(getDiagram()), node.getTraceabilityLink()).getKey();
            Shape shape = (Shape) pictogramElement;
        
            if (shape.getGraphicsAlgorithm() instanceof Text) {
                Text text = (Text) shape.getGraphicsAlgorithm();
                text.setValue(businessName);
                return true;
            }
        }
        if (bo instanceof TraceabilityStatusClass) {
        	businessName = node.getTraceabilityStatus().getLiteral();
            Shape shape = (Shape) pictogramElement;
            
            System.out.println("TraceabilityStatus at update method: " + businessName);
        
            if (shape.getGraphicsAlgorithm() instanceof Text) {
                Text text = (Text) shape.getGraphicsAlgorithm();
                text.setValue(businessName);
                return true;
            }
        }
        if (bo instanceof OperatorClass) {
        	businessName = node.getOperator().getLiteral();
            Shape shape = (Shape) pictogramElement;
        
            if (shape.getGraphicsAlgorithm() instanceof Text) {
                Text text = (Text) shape.getGraphicsAlgorithm();
                text.setValue(businessName);
                return true;
            }
        }
        return false;
    }
}