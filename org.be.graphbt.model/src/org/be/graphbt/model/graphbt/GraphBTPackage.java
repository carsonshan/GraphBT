/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.graphbt.model.graphbt;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.be.graphbt.model.graphbt.GraphBTFactory
 * @model kind="package"
 * @generated
 */
public interface GraphBTPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "graphbt";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://graphbt/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.be.graphbt.model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GraphBTPackage eINSTANCE = org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.be.graphbt.model.graphbt.impl.BEModelImpl <em>BE Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.graphbt.model.graphbt.impl.BEModelImpl
	 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getBEModel()
	 * @generated
	 */
	int BE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Dbt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BE_MODEL__DBT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BE_MODEL__NAME = 1;

	/**
	 * The feature id for the '<em><b>Component List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BE_MODEL__COMPONENT_LIST = 2;

	/**
	 * The feature id for the '<em><b>Requirement List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BE_MODEL__REQUIREMENT_LIST = 3;

	/**
	 * The feature id for the '<em><b>Formula List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BE_MODEL__FORMULA_LIST = 4;

	/**
	 * The feature id for the '<em><b>Libraries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BE_MODEL__LIBRARIES = 5;

	/**
	 * The feature id for the '<em><b>Reversion Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BE_MODEL__REVERSION_NODE = 6;

	/**
	 * The feature id for the '<em><b>Error Reversion Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BE_MODEL__ERROR_REVERSION_NODE = 7;

	/**
	 * The feature id for the '<em><b>Layout List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BE_MODEL__LAYOUT_LIST = 8;

	/**
	 * The feature id for the '<em><b>Subtitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BE_MODEL__SUBTITLE = 9;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BE_MODEL__VERSION = 10;

	/**
	 * The feature id for the '<em><b>Author List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BE_MODEL__AUTHOR_LIST = 11;

	/**
	 * The number of structural features of the '<em>BE Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BE_MODEL_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link org.be.graphbt.model.graphbt.impl.BehaviorTreeImpl <em>Behavior Tree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.graphbt.model.graphbt.impl.BehaviorTreeImpl
	 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getBehaviorTree()
	 * @generated
	 */
	int BEHAVIOR_TREE = 1;

	/**
	 * The feature id for the '<em><b>Root Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TREE__ROOT_NODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TREE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Behavior Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TREE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.be.graphbt.model.graphbt.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.graphbt.model.graphbt.impl.NodeImpl
	 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 2;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__INDEX = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ID = 1;

	/**
	 * The feature id for the '<em><b>Edge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EDGE = 2;

	/**
	 * The feature id for the '<em><b>Special E</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SPECIAL_E = 3;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.be.graphbt.model.graphbt.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.graphbt.model.graphbt.impl.EdgeImpl
	 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 3;

	/**
	 * The feature id for the '<em><b>Child Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__CHILD_NODE = 0;

	/**
	 * The feature id for the '<em><b>Branch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__BRANCH = 1;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__COMPOSITION = 2;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__CONTAINER = 3;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.be.graphbt.model.graphbt.impl.SpecialEdgeImpl <em>Special Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.graphbt.model.graphbt.impl.SpecialEdgeImpl
	 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getSpecialEdge()
	 * @generated
	 */
	int SPECIAL_EDGE = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_EDGE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_EDGE__DESTINATION = 1;

	/**
	 * The number of structural features of the '<em>Special Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_EDGE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.be.graphbt.model.graphbt.impl.EmptyNodeImpl <em>Empty Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.graphbt.model.graphbt.impl.EmptyNodeImpl
	 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getEmptyNode()
	 * @generated
	 */
	int EMPTY_NODE = 5;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_NODE__INDEX = NODE__INDEX;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_NODE__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>Edge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_NODE__EDGE = NODE__EDGE;

	/**
	 * The feature id for the '<em><b>Special E</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_NODE__SPECIAL_E = NODE__SPECIAL_E;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_NODE__LABEL = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Empty Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.be.graphbt.model.graphbt.impl.StandardNodeImpl <em>Standard Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.graphbt.model.graphbt.impl.StandardNodeImpl
	 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getStandardNode()
	 * @generated
	 */
	int STANDARD_NODE = 6;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_NODE__INDEX = NODE__INDEX;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_NODE__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>Edge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_NODE__EDGE = NODE__EDGE;

	/**
	 * The feature id for the '<em><b>Special E</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_NODE__SPECIAL_E = NODE__SPECIAL_E;

	/**
	 * The feature id for the '<em><b>Traceability Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_NODE__TRACEABILITY_STATUS = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_NODE__OPERATOR = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_NODE__LABEL = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Component Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_NODE__COMPONENT_REF = NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Behavior Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_NODE__BEHAVIOR_REF = NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Traceability Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_NODE__TRACEABILITY_LINK = NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_NODE__LEAF = NODE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_NODE__PARENT = NODE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Standard Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.be.graphbt.model.graphbt.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.graphbt.model.graphbt.impl.ComponentImpl
	 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 7;

	/**
	 * The feature id for the '<em><b>Component Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMPONENT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ATTRIBUTES = 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__STATE = 2;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__INITIAL_STATE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ID = 4;

	/**
	 * The feature id for the '<em><b>Related To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__RELATED_TO = 5;

	/**
	 * The feature id for the '<em><b>Behaviors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__BEHAVIORS = 6;

	/**
	 * The feature id for the '<em><b>Component Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMPONENT_REF = 7;

	/**
	 * The feature id for the '<em><b>Component Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMPONENT_DESC = 8;

	/**
	 * The feature id for the '<em><b>Enumerated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ENUMERATED = 9;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__USES = 10;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.be.graphbt.model.graphbt.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.graphbt.model.graphbt.impl.AttributeImpl
	 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.be.graphbt.model.graphbt.impl.CTEdgeImpl <em>CT Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.graphbt.model.graphbt.impl.CTEdgeImpl
	 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getCTEdge()
	 * @generated
	 */
	int CT_EDGE = 9;

	/**
	 * The number of structural features of the '<em>CT Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CT_EDGE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.be.graphbt.model.graphbt.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.graphbt.model.graphbt.impl.StateImpl
	 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getState()
	 * @generated
	 */
	int STATE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__REF = 1;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__DESC = 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ATTRIBUTES = 3;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.be.graphbt.model.graphbt.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.graphbt.model.graphbt.impl.LibraryImpl
	 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__TEXT = 1;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__DESC = 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__ID = 4;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__METHODS = 5;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__STATES = 6;

	/**
	 * The feature id for the '<em><b>Behaviors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__BEHAVIORS = 7;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__ATTRIBUTES = 8;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.be.graphbt.model.graphbt.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.graphbt.model.graphbt.impl.RequirementImpl
	 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 12;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__KEY = 0;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__REQUIREMENT = 1;

	/**
	 * The feature id for the '<em><b>Traceability Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__TRACEABILITY_LINK = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ID = 4;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.be.graphbt.model.graphbt.impl.BehaviorImpl <em>Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.graphbt.model.graphbt.impl.BehaviorImpl
	 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getBehavior()
	 * @generated
	 */
	int BEHAVIOR = 13;

	/**
	 * The feature id for the '<em><b>Behavior Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__BEHAVIOR_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Behavior Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__BEHAVIOR_NAME = 1;

	/**
	 * The feature id for the '<em><b>Behavior Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__BEHAVIOR_REF = 2;

	/**
	 * The feature id for the '<em><b>Behavior Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__BEHAVIOR_DESC = 3;

	/**
	 * The feature id for the '<em><b>Technical Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__TECHNICAL_DETAIL = 4;

	/**
	 * The number of structural features of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.be.graphbt.model.graphbt.impl.ComponentListImpl <em>Component List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.graphbt.model.graphbt.impl.ComponentListImpl
	 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getComponentList()
	 * @generated
	 */
	int COMPONENT_LIST = 14;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_LIST__COMPONENTS = 0;

	/**
	 * The number of structural features of the '<em>Component List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_LIST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.be.graphbt.model.graphbt.impl.RequirementListImpl <em>Requirement List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.graphbt.model.graphbt.impl.RequirementListImpl
	 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getRequirementList()
	 * @generated
	 */
	int REQUIREMENT_LIST = 15;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_LIST__REQUIREMENTS = 0;

	/**
	 * The feature id for the '<em><b>Project Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_LIST__PROJECT_ID = 1;

	/**
	 * The number of structural features of the '<em>Requirement List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_LIST_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.be.graphbt.model.graphbt.impl.FormulaListImpl <em>Formula List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.graphbt.model.graphbt.impl.FormulaListImpl
	 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getFormulaList()
	 * @generated
	 */
	int FORMULA_LIST = 16;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_LIST__FORMULA = 0;

	/**
	 * The number of structural features of the '<em>Formula List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_LIST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.be.graphbt.model.graphbt.impl.FormulaImpl <em>Formula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.graphbt.model.graphbt.impl.FormulaImpl
	 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getFormula()
	 * @generated
	 */
	int FORMULA = 17;

	/**
	 * The feature id for the '<em><b>Formula Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__FORMULA_NAME = 0;

	/**
	 * The number of structural features of the '<em>Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.be.graphbt.model.graphbt.impl.OperatorClassImpl <em>Operator Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.graphbt.model.graphbt.impl.OperatorClassImpl
	 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getOperatorClass()
	 * @generated
	 */
	int OPERATOR_CLASS = 18;

	/**
	 * The feature id for the '<em><b>Operator Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CLASS__OPERATOR_LITERAL = 0;

	/**
	 * The number of structural features of the '<em>Operator Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CLASS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.be.graphbt.model.graphbt.impl.TraceabilityStatusClassImpl <em>Traceability Status Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.graphbt.model.graphbt.impl.TraceabilityStatusClassImpl
	 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getTraceabilityStatusClass()
	 * @generated
	 */
	int TRACEABILITY_STATUS_CLASS = 19;

	/**
	 * The feature id for the '<em><b>Traceability Status Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_STATUS_CLASS__TRACEABILITY_STATUS_LITERAL = 0;

	/**
	 * The number of structural features of the '<em>Traceability Status Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_STATUS_CLASS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.be.graphbt.model.graphbt.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.graphbt.model.graphbt.impl.LinkImpl
	 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 20;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__SOURCE = 1;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.be.graphbt.model.graphbt.impl.AlternativeClassImpl <em>Alternative Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.graphbt.model.graphbt.impl.AlternativeClassImpl
	 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getAlternativeClass()
	 * @generated
	 */
	int ALTERNATIVE_CLASS = 21;

	/**
	 * The feature id for the '<em><b>Alternative Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_CLASS__ALTERNATIVE_ATTRIBUTE = 0;

	/**
	 * The number of structural features of the '<em>Alternative Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_CLASS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.be.graphbt.model.graphbt.impl.MapInformationImpl <em>Map Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.graphbt.model.graphbt.impl.MapInformationImpl
	 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getMapInformation()
	 * @generated
	 */
	int MAP_INFORMATION = 22;

	/**
	 * The feature id for the '<em><b>Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_INFORMATION__INFO = 0;

	/**
	 * The number of structural features of the '<em>Map Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_INFORMATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.be.graphbt.model.graphbt.impl.InformationImpl <em>Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.graphbt.model.graphbt.impl.InformationImpl
	 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getInformation()
	 * @generated
	 */
	int INFORMATION = 23;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.be.graphbt.model.graphbt.impl.GUIImplementableImpl <em>GUI Implementable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.graphbt.model.graphbt.impl.GUIImplementableImpl
	 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getGUIImplementable()
	 * @generated
	 */
	int GUI_IMPLEMENTABLE = 26;

	/**
	 * The number of structural features of the '<em>GUI Implementable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_IMPLEMENTABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.be.graphbt.model.graphbt.impl.InputTypeImpl <em>Input Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.graphbt.model.graphbt.impl.InputTypeImpl
	 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getInputType()
	 * @generated
	 */
	int INPUT_TYPE = 24;

	/**
	 * The number of structural features of the '<em>Input Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TYPE_FEATURE_COUNT = GUI_IMPLEMENTABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.be.graphbt.model.graphbt.impl.OutputTypeImpl <em>Output Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.graphbt.model.graphbt.impl.OutputTypeImpl
	 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getOutputType()
	 * @generated
	 */
	int OUTPUT_TYPE = 25;

	/**
	 * The number of structural features of the '<em>Output Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TYPE_FEATURE_COUNT = GUI_IMPLEMENTABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.be.graphbt.model.graphbt.impl.GUIImpl <em>GUI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.graphbt.model.graphbt.impl.GUIImpl
	 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getGUI()
	 * @generated
	 */
	int GUI = 27;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI__IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Code Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI__CODE_IMPLEMENTATION = 1;

	/**
	 * The number of structural features of the '<em>GUI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.be.graphbt.model.graphbt.impl.InputGUIImpl <em>Input GUI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.graphbt.model.graphbt.impl.InputGUIImpl
	 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getInputGUI()
	 * @generated
	 */
	int INPUT_GUI = 28;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GUI__IDENTIFIER = GUI__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Code Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GUI__CODE_IMPLEMENTATION = GUI__CODE_IMPLEMENTATION;

	/**
	 * The number of structural features of the '<em>Input GUI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GUI_FEATURE_COUNT = GUI_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.be.graphbt.model.graphbt.impl.OutputGUIImpl <em>Output GUI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.graphbt.model.graphbt.impl.OutputGUIImpl
	 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getOutputGUI()
	 * @generated
	 */
	int OUTPUT_GUI = 29;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_GUI__IDENTIFIER = GUI__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Code Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_GUI__CODE_IMPLEMENTATION = GUI__CODE_IMPLEMENTATION;

	/**
	 * The number of structural features of the '<em>Output GUI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_GUI_FEATURE_COUNT = GUI_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.be.graphbt.model.graphbt.impl.LibrariesImpl <em>Libraries</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.graphbt.model.graphbt.impl.LibrariesImpl
	 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getLibraries()
	 * @generated
	 */
	int LIBRARIES = 30;

	/**
	 * The feature id for the '<em><b>Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARIES__IMPORT = 0;

	/**
	 * The number of structural features of the '<em>Libraries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARIES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.be.graphbt.model.graphbt.impl.MethodDeclarationImpl <em>Method Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.graphbt.model.graphbt.impl.MethodDeclarationImpl
	 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getMethodDeclaration()
	 * @generated
	 */
	int METHOD_DECLARATION = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION__PARAMETERS = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Method Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.be.graphbt.model.graphbt.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.graphbt.model.graphbt.impl.ParameterImpl
	 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.be.graphbt.model.graphbt.impl.LayoutListImpl <em>Layout List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.graphbt.model.graphbt.impl.LayoutListImpl
	 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getLayoutList()
	 * @generated
	 */
	int LAYOUT_LIST = 33;

	/**
	 * The feature id for the '<em><b>Layouts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_LIST__LAYOUTS = 0;

	/**
	 * The number of structural features of the '<em>Layout List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_LIST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.be.graphbt.model.graphbt.impl.LayoutImpl <em>Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.graphbt.model.graphbt.impl.LayoutImpl
	 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getLayout()
	 * @generated
	 */
	int LAYOUT = 34;

	/**
	 * The feature id for the '<em><b>CRef</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__CREF = 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__X = 1;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__Y = 2;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__WIDTH = 3;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__HEIGHT = 4;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__Z = 5;

	/**
	 * The number of structural features of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.be.graphbt.model.graphbt.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.graphbt.model.graphbt.impl.ButtonImpl
	 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 35;

	/**
	 * The feature id for the '<em><b>CRef</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__CREF = LAYOUT__CREF;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__X = LAYOUT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__Y = LAYOUT__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__WIDTH = LAYOUT__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__HEIGHT = LAYOUT__HEIGHT;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__Z = LAYOUT__Z;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__LABEL = LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = LAYOUT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.be.graphbt.model.graphbt.impl.AuthorListImpl <em>Author List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.graphbt.model.graphbt.impl.AuthorListImpl
	 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getAuthorList()
	 * @generated
	 */
	int AUTHOR_LIST = 36;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_LIST__AUTHORS = 0;

	/**
	 * The number of structural features of the '<em>Author List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_LIST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.be.graphbt.model.graphbt.impl.AuthorImpl <em>Author</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.graphbt.model.graphbt.impl.AuthorImpl
	 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getAuthor()
	 * @generated
	 */
	int AUTHOR = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__CONTACT = 1;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__ROLE = 2;

	/**
	 * The number of structural features of the '<em>Author</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.be.graphbt.model.graphbt.Composition <em>Composition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.graphbt.model.graphbt.Composition
	 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getComposition()
	 * @generated
	 */
	int COMPOSITION = 38;

	/**
	 * The meta object id for the '{@link org.be.graphbt.model.graphbt.Branch <em>Branch</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.graphbt.model.graphbt.Branch
	 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getBranch()
	 * @generated
	 */
	int BRANCH = 39;

	/**
	 * The meta object id for the '{@link org.be.graphbt.model.graphbt.Operator <em>Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.graphbt.model.graphbt.Operator
	 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 40;

	/**
	 * The meta object id for the '{@link org.be.graphbt.model.graphbt.BehaviorType <em>Behavior Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.graphbt.model.graphbt.BehaviorType
	 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getBehaviorType()
	 * @generated
	 */
	int BEHAVIOR_TYPE = 41;

	/**
	 * The meta object id for the '{@link org.be.graphbt.model.graphbt.EventType <em>Event Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.graphbt.model.graphbt.EventType
	 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getEventType()
	 * @generated
	 */
	int EVENT_TYPE = 42;

	/**
	 * The meta object id for the '{@link org.be.graphbt.model.graphbt.SpecialEdgeEnum <em>Special Edge Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.graphbt.model.graphbt.SpecialEdgeEnum
	 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getSpecialEdgeEnum()
	 * @generated
	 */
	int SPECIAL_EDGE_ENUM = 43;

	/**
	 * The meta object id for the '{@link org.be.graphbt.model.graphbt.TraceabilityStatus <em>Traceability Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.be.graphbt.model.graphbt.TraceabilityStatus
	 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getTraceabilityStatus()
	 * @generated
	 */
	int TRACEABILITY_STATUS = 44;


	/**
	 * Returns the meta object for class '{@link org.be.graphbt.model.graphbt.BEModel <em>BE Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BE Model</em>'.
	 * @see org.be.graphbt.model.graphbt.BEModel
	 * @generated
	 */
	EClass getBEModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.be.graphbt.model.graphbt.BEModel#getDbt <em>Dbt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dbt</em>'.
	 * @see org.be.graphbt.model.graphbt.BEModel#getDbt()
	 * @see #getBEModel()
	 * @generated
	 */
	EReference getBEModel_Dbt();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.BEModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.be.graphbt.model.graphbt.BEModel#getName()
	 * @see #getBEModel()
	 * @generated
	 */
	EAttribute getBEModel_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.be.graphbt.model.graphbt.BEModel#getComponentList <em>Component List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component List</em>'.
	 * @see org.be.graphbt.model.graphbt.BEModel#getComponentList()
	 * @see #getBEModel()
	 * @generated
	 */
	EReference getBEModel_ComponentList();

	/**
	 * Returns the meta object for the containment reference '{@link org.be.graphbt.model.graphbt.BEModel#getRequirementList <em>Requirement List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Requirement List</em>'.
	 * @see org.be.graphbt.model.graphbt.BEModel#getRequirementList()
	 * @see #getBEModel()
	 * @generated
	 */
	EReference getBEModel_RequirementList();

	/**
	 * Returns the meta object for the containment reference '{@link org.be.graphbt.model.graphbt.BEModel#getFormulaList <em>Formula List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Formula List</em>'.
	 * @see org.be.graphbt.model.graphbt.BEModel#getFormulaList()
	 * @see #getBEModel()
	 * @generated
	 */
	EReference getBEModel_FormulaList();

	/**
	 * Returns the meta object for the containment reference '{@link org.be.graphbt.model.graphbt.BEModel#getLibraries <em>Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Libraries</em>'.
	 * @see org.be.graphbt.model.graphbt.BEModel#getLibraries()
	 * @see #getBEModel()
	 * @generated
	 */
	EReference getBEModel_Libraries();

	/**
	 * Returns the meta object for the reference list '{@link org.be.graphbt.model.graphbt.BEModel#getReversionNode <em>Reversion Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reversion Node</em>'.
	 * @see org.be.graphbt.model.graphbt.BEModel#getReversionNode()
	 * @see #getBEModel()
	 * @generated
	 */
	EReference getBEModel_ReversionNode();

	/**
	 * Returns the meta object for the reference list '{@link org.be.graphbt.model.graphbt.BEModel#getErrorReversionNode <em>Error Reversion Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Error Reversion Node</em>'.
	 * @see org.be.graphbt.model.graphbt.BEModel#getErrorReversionNode()
	 * @see #getBEModel()
	 * @generated
	 */
	EReference getBEModel_ErrorReversionNode();

	/**
	 * Returns the meta object for the containment reference '{@link org.be.graphbt.model.graphbt.BEModel#getLayoutList <em>Layout List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout List</em>'.
	 * @see org.be.graphbt.model.graphbt.BEModel#getLayoutList()
	 * @see #getBEModel()
	 * @generated
	 */
	EReference getBEModel_LayoutList();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.BEModel#getSubtitle <em>Subtitle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subtitle</em>'.
	 * @see org.be.graphbt.model.graphbt.BEModel#getSubtitle()
	 * @see #getBEModel()
	 * @generated
	 */
	EAttribute getBEModel_Subtitle();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.BEModel#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.be.graphbt.model.graphbt.BEModel#getVersion()
	 * @see #getBEModel()
	 * @generated
	 */
	EAttribute getBEModel_Version();

	/**
	 * Returns the meta object for the containment reference '{@link org.be.graphbt.model.graphbt.BEModel#getAuthorList <em>Author List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Author List</em>'.
	 * @see org.be.graphbt.model.graphbt.BEModel#getAuthorList()
	 * @see #getBEModel()
	 * @generated
	 */
	EReference getBEModel_AuthorList();

	/**
	 * Returns the meta object for class '{@link org.be.graphbt.model.graphbt.BehaviorTree <em>Behavior Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior Tree</em>'.
	 * @see org.be.graphbt.model.graphbt.BehaviorTree
	 * @generated
	 */
	EClass getBehaviorTree();

	/**
	 * Returns the meta object for the reference '{@link org.be.graphbt.model.graphbt.BehaviorTree#getRootNode <em>Root Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root Node</em>'.
	 * @see org.be.graphbt.model.graphbt.BehaviorTree#getRootNode()
	 * @see #getBehaviorTree()
	 * @generated
	 */
	EReference getBehaviorTree_RootNode();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.BehaviorTree#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.be.graphbt.model.graphbt.BehaviorTree#getName()
	 * @see #getBehaviorTree()
	 * @generated
	 */
	EAttribute getBehaviorTree_Name();

	/**
	 * Returns the meta object for class '{@link org.be.graphbt.model.graphbt.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.be.graphbt.model.graphbt.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.Node#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.be.graphbt.model.graphbt.Node#getIndex()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Index();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.Node#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.be.graphbt.model.graphbt.Node#getId()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.be.graphbt.model.graphbt.Node#getEdge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Edge</em>'.
	 * @see org.be.graphbt.model.graphbt.Node#getEdge()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Edge();

	/**
	 * Returns the meta object for the reference '{@link org.be.graphbt.model.graphbt.Node#getSpecialE <em>Special E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Special E</em>'.
	 * @see org.be.graphbt.model.graphbt.Node#getSpecialE()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_SpecialE();

	/**
	 * Returns the meta object for class '{@link org.be.graphbt.model.graphbt.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see org.be.graphbt.model.graphbt.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the containment reference list '{@link org.be.graphbt.model.graphbt.Edge#getChildNode <em>Child Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Node</em>'.
	 * @see org.be.graphbt.model.graphbt.Edge#getChildNode()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_ChildNode();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.Edge#getBranch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Branch</em>'.
	 * @see org.be.graphbt.model.graphbt.Edge#getBranch()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_Branch();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.Edge#getComposition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Composition</em>'.
	 * @see org.be.graphbt.model.graphbt.Edge#getComposition()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_Composition();

	/**
	 * Returns the meta object for the reference '{@link org.be.graphbt.model.graphbt.Edge#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Container</em>'.
	 * @see org.be.graphbt.model.graphbt.Edge#getContainer()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Container();

	/**
	 * Returns the meta object for class '{@link org.be.graphbt.model.graphbt.SpecialEdge <em>Special Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Special Edge</em>'.
	 * @see org.be.graphbt.model.graphbt.SpecialEdge
	 * @generated
	 */
	EClass getSpecialEdge();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.SpecialEdge#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.be.graphbt.model.graphbt.SpecialEdge#getType()
	 * @see #getSpecialEdge()
	 * @generated
	 */
	EAttribute getSpecialEdge_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.SpecialEdge#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination</em>'.
	 * @see org.be.graphbt.model.graphbt.SpecialEdge#getDestination()
	 * @see #getSpecialEdge()
	 * @generated
	 */
	EAttribute getSpecialEdge_Destination();

	/**
	 * Returns the meta object for class '{@link org.be.graphbt.model.graphbt.EmptyNode <em>Empty Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empty Node</em>'.
	 * @see org.be.graphbt.model.graphbt.EmptyNode
	 * @generated
	 */
	EClass getEmptyNode();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.EmptyNode#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.be.graphbt.model.graphbt.EmptyNode#getLabel()
	 * @see #getEmptyNode()
	 * @generated
	 */
	EAttribute getEmptyNode_Label();

	/**
	 * Returns the meta object for class '{@link org.be.graphbt.model.graphbt.StandardNode <em>Standard Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Node</em>'.
	 * @see org.be.graphbt.model.graphbt.StandardNode
	 * @generated
	 */
	EClass getStandardNode();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.StandardNode#getTraceabilityStatus <em>Traceability Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Traceability Status</em>'.
	 * @see org.be.graphbt.model.graphbt.StandardNode#getTraceabilityStatus()
	 * @see #getStandardNode()
	 * @generated
	 */
	EAttribute getStandardNode_TraceabilityStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.StandardNode#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.be.graphbt.model.graphbt.StandardNode#getOperator()
	 * @see #getStandardNode()
	 * @generated
	 */
	EAttribute getStandardNode_Operator();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.StandardNode#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.be.graphbt.model.graphbt.StandardNode#getLabel()
	 * @see #getStandardNode()
	 * @generated
	 */
	EAttribute getStandardNode_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.StandardNode#getComponentRef <em>Component Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Ref</em>'.
	 * @see org.be.graphbt.model.graphbt.StandardNode#getComponentRef()
	 * @see #getStandardNode()
	 * @generated
	 */
	EAttribute getStandardNode_ComponentRef();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.StandardNode#getBehaviorRef <em>Behavior Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Behavior Ref</em>'.
	 * @see org.be.graphbt.model.graphbt.StandardNode#getBehaviorRef()
	 * @see #getStandardNode()
	 * @generated
	 */
	EAttribute getStandardNode_BehaviorRef();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.StandardNode#getTraceabilityLink <em>Traceability Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Traceability Link</em>'.
	 * @see org.be.graphbt.model.graphbt.StandardNode#getTraceabilityLink()
	 * @see #getStandardNode()
	 * @generated
	 */
	EAttribute getStandardNode_TraceabilityLink();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.StandardNode#isLeaf <em>Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leaf</em>'.
	 * @see org.be.graphbt.model.graphbt.StandardNode#isLeaf()
	 * @see #getStandardNode()
	 * @generated
	 */
	EAttribute getStandardNode_Leaf();

	/**
	 * Returns the meta object for the reference '{@link org.be.graphbt.model.graphbt.StandardNode#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see org.be.graphbt.model.graphbt.StandardNode#getParent()
	 * @see #getStandardNode()
	 * @generated
	 */
	EReference getStandardNode_Parent();

	/**
	 * Returns the meta object for class '{@link org.be.graphbt.model.graphbt.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.be.graphbt.model.graphbt.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.Component#getComponentName <em>Component Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Name</em>'.
	 * @see org.be.graphbt.model.graphbt.Component#getComponentName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_ComponentName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.be.graphbt.model.graphbt.Component#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.be.graphbt.model.graphbt.Component#getAttributes()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.be.graphbt.model.graphbt.Component#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State</em>'.
	 * @see org.be.graphbt.model.graphbt.Component#getState()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_State();

	/**
	 * Returns the meta object for the reference '{@link org.be.graphbt.model.graphbt.Component#getInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial State</em>'.
	 * @see org.be.graphbt.model.graphbt.Component#getInitialState()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_InitialState();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.Component#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.be.graphbt.model.graphbt.Component#getId()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Id();

	/**
	 * Returns the meta object for the reference list '{@link org.be.graphbt.model.graphbt.Component#getRelatedTo <em>Related To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related To</em>'.
	 * @see org.be.graphbt.model.graphbt.Component#getRelatedTo()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_RelatedTo();

	/**
	 * Returns the meta object for the containment reference list '{@link org.be.graphbt.model.graphbt.Component#getBehaviors <em>Behaviors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behaviors</em>'.
	 * @see org.be.graphbt.model.graphbt.Component#getBehaviors()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Behaviors();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.Component#getComponentRef <em>Component Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Ref</em>'.
	 * @see org.be.graphbt.model.graphbt.Component#getComponentRef()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_ComponentRef();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.Component#getComponentDesc <em>Component Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Desc</em>'.
	 * @see org.be.graphbt.model.graphbt.Component#getComponentDesc()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_ComponentDesc();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.Component#isEnumerated <em>Enumerated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enumerated</em>'.
	 * @see org.be.graphbt.model.graphbt.Component#isEnumerated()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Enumerated();

	/**
	 * Returns the meta object for the containment reference list '{@link org.be.graphbt.model.graphbt.Component#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uses</em>'.
	 * @see org.be.graphbt.model.graphbt.Component#getUses()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Uses();

	/**
	 * Returns the meta object for class '{@link org.be.graphbt.model.graphbt.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.be.graphbt.model.graphbt.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.be.graphbt.model.graphbt.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.be.graphbt.model.graphbt.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.Attribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.be.graphbt.model.graphbt.Attribute#getValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Value();

	/**
	 * Returns the meta object for class '{@link org.be.graphbt.model.graphbt.CTEdge <em>CT Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CT Edge</em>'.
	 * @see org.be.graphbt.model.graphbt.CTEdge
	 * @generated
	 */
	EClass getCTEdge();

	/**
	 * Returns the meta object for class '{@link org.be.graphbt.model.graphbt.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see org.be.graphbt.model.graphbt.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.be.graphbt.model.graphbt.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.State#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see org.be.graphbt.model.graphbt.State#getRef()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Ref();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.State#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see org.be.graphbt.model.graphbt.State#getDesc()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Desc();

	/**
	 * Returns the meta object for the containment reference '{@link org.be.graphbt.model.graphbt.State#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attributes</em>'.
	 * @see org.be.graphbt.model.graphbt.State#getAttributes()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Attributes();

	/**
	 * Returns the meta object for class '{@link org.be.graphbt.model.graphbt.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see org.be.graphbt.model.graphbt.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.Library#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.be.graphbt.model.graphbt.Library#getName()
	 * @see #getLibrary()
	 * @generated
	 */
	EAttribute getLibrary_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.Library#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.be.graphbt.model.graphbt.Library#getText()
	 * @see #getLibrary()
	 * @generated
	 */
	EAttribute getLibrary_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.Library#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see org.be.graphbt.model.graphbt.Library#getDesc()
	 * @see #getLibrary()
	 * @generated
	 */
	EAttribute getLibrary_Desc();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.Library#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.be.graphbt.model.graphbt.Library#getLocation()
	 * @see #getLibrary()
	 * @generated
	 */
	EAttribute getLibrary_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.Library#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.be.graphbt.model.graphbt.Library#getId()
	 * @see #getLibrary()
	 * @generated
	 */
	EAttribute getLibrary_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link org.be.graphbt.model.graphbt.Library#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see org.be.graphbt.model.graphbt.Library#getMethods()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Methods();

	/**
	 * Returns the meta object for the containment reference list '{@link org.be.graphbt.model.graphbt.Library#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see org.be.graphbt.model.graphbt.Library#getStates()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_States();

	/**
	 * Returns the meta object for the containment reference list '{@link org.be.graphbt.model.graphbt.Library#getBehaviors <em>Behaviors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behaviors</em>'.
	 * @see org.be.graphbt.model.graphbt.Library#getBehaviors()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Behaviors();

	/**
	 * Returns the meta object for the containment reference list '{@link org.be.graphbt.model.graphbt.Library#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.be.graphbt.model.graphbt.Library#getAttributes()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Attributes();

	/**
	 * Returns the meta object for class '{@link org.be.graphbt.model.graphbt.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see org.be.graphbt.model.graphbt.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.Requirement#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.be.graphbt.model.graphbt.Requirement#getKey()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.Requirement#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requirement</em>'.
	 * @see org.be.graphbt.model.graphbt.Requirement#getRequirement()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Requirement();

	/**
	 * Returns the meta object for the reference list '{@link org.be.graphbt.model.graphbt.Requirement#getTraceabilityLink <em>Traceability Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Traceability Link</em>'.
	 * @see org.be.graphbt.model.graphbt.Requirement#getTraceabilityLink()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_TraceabilityLink();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.Requirement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.be.graphbt.model.graphbt.Requirement#getDescription()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.Requirement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.be.graphbt.model.graphbt.Requirement#getId()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Id();

	/**
	 * Returns the meta object for class '{@link org.be.graphbt.model.graphbt.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior</em>'.
	 * @see org.be.graphbt.model.graphbt.Behavior
	 * @generated
	 */
	EClass getBehavior();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.Behavior#getBehaviorType <em>Behavior Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Behavior Type</em>'.
	 * @see org.be.graphbt.model.graphbt.Behavior#getBehaviorType()
	 * @see #getBehavior()
	 * @generated
	 */
	EAttribute getBehavior_BehaviorType();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.Behavior#getBehaviorName <em>Behavior Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Behavior Name</em>'.
	 * @see org.be.graphbt.model.graphbt.Behavior#getBehaviorName()
	 * @see #getBehavior()
	 * @generated
	 */
	EAttribute getBehavior_BehaviorName();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.Behavior#getBehaviorRef <em>Behavior Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Behavior Ref</em>'.
	 * @see org.be.graphbt.model.graphbt.Behavior#getBehaviorRef()
	 * @see #getBehavior()
	 * @generated
	 */
	EAttribute getBehavior_BehaviorRef();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.Behavior#getBehaviorDesc <em>Behavior Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Behavior Desc</em>'.
	 * @see org.be.graphbt.model.graphbt.Behavior#getBehaviorDesc()
	 * @see #getBehavior()
	 * @generated
	 */
	EAttribute getBehavior_BehaviorDesc();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.Behavior#getTechnicalDetail <em>Technical Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Technical Detail</em>'.
	 * @see org.be.graphbt.model.graphbt.Behavior#getTechnicalDetail()
	 * @see #getBehavior()
	 * @generated
	 */
	EAttribute getBehavior_TechnicalDetail();

	/**
	 * Returns the meta object for class '{@link org.be.graphbt.model.graphbt.ComponentList <em>Component List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component List</em>'.
	 * @see org.be.graphbt.model.graphbt.ComponentList
	 * @generated
	 */
	EClass getComponentList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.be.graphbt.model.graphbt.ComponentList#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see org.be.graphbt.model.graphbt.ComponentList#getComponents()
	 * @see #getComponentList()
	 * @generated
	 */
	EReference getComponentList_Components();

	/**
	 * Returns the meta object for class '{@link org.be.graphbt.model.graphbt.RequirementList <em>Requirement List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement List</em>'.
	 * @see org.be.graphbt.model.graphbt.RequirementList
	 * @generated
	 */
	EClass getRequirementList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.be.graphbt.model.graphbt.RequirementList#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirements</em>'.
	 * @see org.be.graphbt.model.graphbt.RequirementList#getRequirements()
	 * @see #getRequirementList()
	 * @generated
	 */
	EReference getRequirementList_Requirements();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.RequirementList#getProjectId <em>Project Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Id</em>'.
	 * @see org.be.graphbt.model.graphbt.RequirementList#getProjectId()
	 * @see #getRequirementList()
	 * @generated
	 */
	EAttribute getRequirementList_ProjectId();

	/**
	 * Returns the meta object for class '{@link org.be.graphbt.model.graphbt.FormulaList <em>Formula List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formula List</em>'.
	 * @see org.be.graphbt.model.graphbt.FormulaList
	 * @generated
	 */
	EClass getFormulaList();

	/**
	 * Returns the meta object for the reference list '{@link org.be.graphbt.model.graphbt.FormulaList#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Formula</em>'.
	 * @see org.be.graphbt.model.graphbt.FormulaList#getFormula()
	 * @see #getFormulaList()
	 * @generated
	 */
	EReference getFormulaList_Formula();

	/**
	 * Returns the meta object for class '{@link org.be.graphbt.model.graphbt.Formula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formula</em>'.
	 * @see org.be.graphbt.model.graphbt.Formula
	 * @generated
	 */
	EClass getFormula();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.Formula#getFormulaName <em>Formula Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formula Name</em>'.
	 * @see org.be.graphbt.model.graphbt.Formula#getFormulaName()
	 * @see #getFormula()
	 * @generated
	 */
	EAttribute getFormula_FormulaName();

	/**
	 * Returns the meta object for class '{@link org.be.graphbt.model.graphbt.OperatorClass <em>Operator Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator Class</em>'.
	 * @see org.be.graphbt.model.graphbt.OperatorClass
	 * @generated
	 */
	EClass getOperatorClass();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.OperatorClass#getOperatorLiteral <em>Operator Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator Literal</em>'.
	 * @see org.be.graphbt.model.graphbt.OperatorClass#getOperatorLiteral()
	 * @see #getOperatorClass()
	 * @generated
	 */
	EAttribute getOperatorClass_OperatorLiteral();

	/**
	 * Returns the meta object for class '{@link org.be.graphbt.model.graphbt.TraceabilityStatusClass <em>Traceability Status Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traceability Status Class</em>'.
	 * @see org.be.graphbt.model.graphbt.TraceabilityStatusClass
	 * @generated
	 */
	EClass getTraceabilityStatusClass();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.TraceabilityStatusClass#getTraceabilityStatusLiteral <em>Traceability Status Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Traceability Status Literal</em>'.
	 * @see org.be.graphbt.model.graphbt.TraceabilityStatusClass#getTraceabilityStatusLiteral()
	 * @see #getTraceabilityStatusClass()
	 * @generated
	 */
	EAttribute getTraceabilityStatusClass_TraceabilityStatusLiteral();

	/**
	 * Returns the meta object for class '{@link org.be.graphbt.model.graphbt.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see org.be.graphbt.model.graphbt.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the containment reference '{@link org.be.graphbt.model.graphbt.Link#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.be.graphbt.model.graphbt.Link#getTarget()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Target();

	/**
	 * Returns the meta object for the reference '{@link org.be.graphbt.model.graphbt.Link#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.be.graphbt.model.graphbt.Link#getSource()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Source();

	/**
	 * Returns the meta object for class '{@link org.be.graphbt.model.graphbt.AlternativeClass <em>Alternative Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternative Class</em>'.
	 * @see org.be.graphbt.model.graphbt.AlternativeClass
	 * @generated
	 */
	EClass getAlternativeClass();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.AlternativeClass#getAlternativeAttribute <em>Alternative Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alternative Attribute</em>'.
	 * @see org.be.graphbt.model.graphbt.AlternativeClass#getAlternativeAttribute()
	 * @see #getAlternativeClass()
	 * @generated
	 */
	EAttribute getAlternativeClass_AlternativeAttribute();

	/**
	 * Returns the meta object for class '{@link org.be.graphbt.model.graphbt.MapInformation <em>Map Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Information</em>'.
	 * @see org.be.graphbt.model.graphbt.MapInformation
	 * @generated
	 */
	EClass getMapInformation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.be.graphbt.model.graphbt.MapInformation#getInfo <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Info</em>'.
	 * @see org.be.graphbt.model.graphbt.MapInformation#getInfo()
	 * @see #getMapInformation()
	 * @generated
	 */
	EReference getMapInformation_Info();

	/**
	 * Returns the meta object for class '{@link org.be.graphbt.model.graphbt.Information <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information</em>'.
	 * @see org.be.graphbt.model.graphbt.Information
	 * @generated
	 */
	EClass getInformation();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.Information#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.be.graphbt.model.graphbt.Information#getKey()
	 * @see #getInformation()
	 * @generated
	 */
	EAttribute getInformation_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.Information#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.be.graphbt.model.graphbt.Information#getValue()
	 * @see #getInformation()
	 * @generated
	 */
	EAttribute getInformation_Value();

	/**
	 * Returns the meta object for class '{@link org.be.graphbt.model.graphbt.InputType <em>Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Type</em>'.
	 * @see org.be.graphbt.model.graphbt.InputType
	 * @generated
	 */
	EClass getInputType();

	/**
	 * Returns the meta object for class '{@link org.be.graphbt.model.graphbt.OutputType <em>Output Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Type</em>'.
	 * @see org.be.graphbt.model.graphbt.OutputType
	 * @generated
	 */
	EClass getOutputType();

	/**
	 * Returns the meta object for class '{@link org.be.graphbt.model.graphbt.GUIImplementable <em>GUI Implementable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GUI Implementable</em>'.
	 * @see org.be.graphbt.model.graphbt.GUIImplementable
	 * @generated
	 */
	EClass getGUIImplementable();

	/**
	 * Returns the meta object for class '{@link org.be.graphbt.model.graphbt.GUI <em>GUI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GUI</em>'.
	 * @see org.be.graphbt.model.graphbt.GUI
	 * @generated
	 */
	EClass getGUI();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.GUI#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.be.graphbt.model.graphbt.GUI#getIdentifier()
	 * @see #getGUI()
	 * @generated
	 */
	EAttribute getGUI_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.GUI#getCodeImplementation <em>Code Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code Implementation</em>'.
	 * @see org.be.graphbt.model.graphbt.GUI#getCodeImplementation()
	 * @see #getGUI()
	 * @generated
	 */
	EAttribute getGUI_CodeImplementation();

	/**
	 * Returns the meta object for class '{@link org.be.graphbt.model.graphbt.InputGUI <em>Input GUI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input GUI</em>'.
	 * @see org.be.graphbt.model.graphbt.InputGUI
	 * @generated
	 */
	EClass getInputGUI();

	/**
	 * Returns the meta object for class '{@link org.be.graphbt.model.graphbt.OutputGUI <em>Output GUI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output GUI</em>'.
	 * @see org.be.graphbt.model.graphbt.OutputGUI
	 * @generated
	 */
	EClass getOutputGUI();

	/**
	 * Returns the meta object for class '{@link org.be.graphbt.model.graphbt.Libraries <em>Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Libraries</em>'.
	 * @see org.be.graphbt.model.graphbt.Libraries
	 * @generated
	 */
	EClass getLibraries();

	/**
	 * Returns the meta object for the containment reference list '{@link org.be.graphbt.model.graphbt.Libraries#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Import</em>'.
	 * @see org.be.graphbt.model.graphbt.Libraries#getImport()
	 * @see #getLibraries()
	 * @generated
	 */
	EReference getLibraries_Import();

	/**
	 * Returns the meta object for class '{@link org.be.graphbt.model.graphbt.MethodDeclaration <em>Method Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Declaration</em>'.
	 * @see org.be.graphbt.model.graphbt.MethodDeclaration
	 * @generated
	 */
	EClass getMethodDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.MethodDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.be.graphbt.model.graphbt.MethodDeclaration#getName()
	 * @see #getMethodDeclaration()
	 * @generated
	 */
	EAttribute getMethodDeclaration_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.be.graphbt.model.graphbt.MethodDeclaration#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.be.graphbt.model.graphbt.MethodDeclaration#getParameters()
	 * @see #getMethodDeclaration()
	 * @generated
	 */
	EReference getMethodDeclaration_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.MethodDeclaration#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.be.graphbt.model.graphbt.MethodDeclaration#getType()
	 * @see #getMethodDeclaration()
	 * @generated
	 */
	EAttribute getMethodDeclaration_Type();

	/**
	 * Returns the meta object for class '{@link org.be.graphbt.model.graphbt.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.be.graphbt.model.graphbt.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.be.graphbt.model.graphbt.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.be.graphbt.model.graphbt.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for class '{@link org.be.graphbt.model.graphbt.LayoutList <em>Layout List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout List</em>'.
	 * @see org.be.graphbt.model.graphbt.LayoutList
	 * @generated
	 */
	EClass getLayoutList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.be.graphbt.model.graphbt.LayoutList#getLayouts <em>Layouts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Layouts</em>'.
	 * @see org.be.graphbt.model.graphbt.LayoutList#getLayouts()
	 * @see #getLayoutList()
	 * @generated
	 */
	EReference getLayoutList_Layouts();

	/**
	 * Returns the meta object for class '{@link org.be.graphbt.model.graphbt.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout</em>'.
	 * @see org.be.graphbt.model.graphbt.Layout
	 * @generated
	 */
	EClass getLayout();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.Layout#getCRef <em>CRef</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CRef</em>'.
	 * @see org.be.graphbt.model.graphbt.Layout#getCRef()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_CRef();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.Layout#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.be.graphbt.model.graphbt.Layout#getX()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_X();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.Layout#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.be.graphbt.model.graphbt.Layout#getY()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.Layout#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.be.graphbt.model.graphbt.Layout#getWidth()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.Layout#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.be.graphbt.model.graphbt.Layout#getHeight()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.Layout#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see org.be.graphbt.model.graphbt.Layout#getZ()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_Z();

	/**
	 * Returns the meta object for class '{@link org.be.graphbt.model.graphbt.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see org.be.graphbt.model.graphbt.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.Button#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.be.graphbt.model.graphbt.Button#getLabel()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Label();

	/**
	 * Returns the meta object for class '{@link org.be.graphbt.model.graphbt.AuthorList <em>Author List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Author List</em>'.
	 * @see org.be.graphbt.model.graphbt.AuthorList
	 * @generated
	 */
	EClass getAuthorList();

	/**
	 * Returns the meta object for the reference list '{@link org.be.graphbt.model.graphbt.AuthorList#getAuthors <em>Authors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Authors</em>'.
	 * @see org.be.graphbt.model.graphbt.AuthorList#getAuthors()
	 * @see #getAuthorList()
	 * @generated
	 */
	EReference getAuthorList_Authors();

	/**
	 * Returns the meta object for class '{@link org.be.graphbt.model.graphbt.Author <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Author</em>'.
	 * @see org.be.graphbt.model.graphbt.Author
	 * @generated
	 */
	EClass getAuthor();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.Author#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.be.graphbt.model.graphbt.Author#getName()
	 * @see #getAuthor()
	 * @generated
	 */
	EAttribute getAuthor_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.Author#getContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact</em>'.
	 * @see org.be.graphbt.model.graphbt.Author#getContact()
	 * @see #getAuthor()
	 * @generated
	 */
	EAttribute getAuthor_Contact();

	/**
	 * Returns the meta object for the attribute '{@link org.be.graphbt.model.graphbt.Author#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.be.graphbt.model.graphbt.Author#getRole()
	 * @see #getAuthor()
	 * @generated
	 */
	EAttribute getAuthor_Role();

	/**
	 * Returns the meta object for enum '{@link org.be.graphbt.model.graphbt.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Composition</em>'.
	 * @see org.be.graphbt.model.graphbt.Composition
	 * @generated
	 */
	EEnum getComposition();

	/**
	 * Returns the meta object for enum '{@link org.be.graphbt.model.graphbt.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Branch</em>'.
	 * @see org.be.graphbt.model.graphbt.Branch
	 * @generated
	 */
	EEnum getBranch();

	/**
	 * Returns the meta object for enum '{@link org.be.graphbt.model.graphbt.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator</em>'.
	 * @see org.be.graphbt.model.graphbt.Operator
	 * @generated
	 */
	EEnum getOperator();

	/**
	 * Returns the meta object for enum '{@link org.be.graphbt.model.graphbt.BehaviorType <em>Behavior Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Behavior Type</em>'.
	 * @see org.be.graphbt.model.graphbt.BehaviorType
	 * @generated
	 */
	EEnum getBehaviorType();

	/**
	 * Returns the meta object for enum '{@link org.be.graphbt.model.graphbt.EventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Event Type</em>'.
	 * @see org.be.graphbt.model.graphbt.EventType
	 * @generated
	 */
	EEnum getEventType();

	/**
	 * Returns the meta object for enum '{@link org.be.graphbt.model.graphbt.SpecialEdgeEnum <em>Special Edge Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Special Edge Enum</em>'.
	 * @see org.be.graphbt.model.graphbt.SpecialEdgeEnum
	 * @generated
	 */
	EEnum getSpecialEdgeEnum();

	/**
	 * Returns the meta object for enum '{@link org.be.graphbt.model.graphbt.TraceabilityStatus <em>Traceability Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Traceability Status</em>'.
	 * @see org.be.graphbt.model.graphbt.TraceabilityStatus
	 * @generated
	 */
	EEnum getTraceabilityStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GraphBTFactory getGraphBTFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.be.graphbt.model.graphbt.impl.BEModelImpl <em>BE Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.graphbt.model.graphbt.impl.BEModelImpl
		 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getBEModel()
		 * @generated
		 */
		EClass BE_MODEL = eINSTANCE.getBEModel();

		/**
		 * The meta object literal for the '<em><b>Dbt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BE_MODEL__DBT = eINSTANCE.getBEModel_Dbt();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BE_MODEL__NAME = eINSTANCE.getBEModel_Name();

		/**
		 * The meta object literal for the '<em><b>Component List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BE_MODEL__COMPONENT_LIST = eINSTANCE.getBEModel_ComponentList();

		/**
		 * The meta object literal for the '<em><b>Requirement List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BE_MODEL__REQUIREMENT_LIST = eINSTANCE.getBEModel_RequirementList();

		/**
		 * The meta object literal for the '<em><b>Formula List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BE_MODEL__FORMULA_LIST = eINSTANCE.getBEModel_FormulaList();

		/**
		 * The meta object literal for the '<em><b>Libraries</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BE_MODEL__LIBRARIES = eINSTANCE.getBEModel_Libraries();

		/**
		 * The meta object literal for the '<em><b>Reversion Node</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BE_MODEL__REVERSION_NODE = eINSTANCE.getBEModel_ReversionNode();

		/**
		 * The meta object literal for the '<em><b>Error Reversion Node</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BE_MODEL__ERROR_REVERSION_NODE = eINSTANCE.getBEModel_ErrorReversionNode();

		/**
		 * The meta object literal for the '<em><b>Layout List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BE_MODEL__LAYOUT_LIST = eINSTANCE.getBEModel_LayoutList();

		/**
		 * The meta object literal for the '<em><b>Subtitle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BE_MODEL__SUBTITLE = eINSTANCE.getBEModel_Subtitle();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BE_MODEL__VERSION = eINSTANCE.getBEModel_Version();

		/**
		 * The meta object literal for the '<em><b>Author List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BE_MODEL__AUTHOR_LIST = eINSTANCE.getBEModel_AuthorList();

		/**
		 * The meta object literal for the '{@link org.be.graphbt.model.graphbt.impl.BehaviorTreeImpl <em>Behavior Tree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.graphbt.model.graphbt.impl.BehaviorTreeImpl
		 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getBehaviorTree()
		 * @generated
		 */
		EClass BEHAVIOR_TREE = eINSTANCE.getBehaviorTree();

		/**
		 * The meta object literal for the '<em><b>Root Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_TREE__ROOT_NODE = eINSTANCE.getBehaviorTree_RootNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR_TREE__NAME = eINSTANCE.getBehaviorTree_Name();

		/**
		 * The meta object literal for the '{@link org.be.graphbt.model.graphbt.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.graphbt.model.graphbt.impl.NodeImpl
		 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__INDEX = eINSTANCE.getNode_Index();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__ID = eINSTANCE.getNode_Id();

		/**
		 * The meta object literal for the '<em><b>Edge</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EDGE = eINSTANCE.getNode_Edge();

		/**
		 * The meta object literal for the '<em><b>Special E</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__SPECIAL_E = eINSTANCE.getNode_SpecialE();

		/**
		 * The meta object literal for the '{@link org.be.graphbt.model.graphbt.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.graphbt.model.graphbt.impl.EdgeImpl
		 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>Child Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__CHILD_NODE = eINSTANCE.getEdge_ChildNode();

		/**
		 * The meta object literal for the '<em><b>Branch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__BRANCH = eINSTANCE.getEdge_Branch();

		/**
		 * The meta object literal for the '<em><b>Composition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__COMPOSITION = eINSTANCE.getEdge_Composition();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__CONTAINER = eINSTANCE.getEdge_Container();

		/**
		 * The meta object literal for the '{@link org.be.graphbt.model.graphbt.impl.SpecialEdgeImpl <em>Special Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.graphbt.model.graphbt.impl.SpecialEdgeImpl
		 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getSpecialEdge()
		 * @generated
		 */
		EClass SPECIAL_EDGE = eINSTANCE.getSpecialEdge();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIAL_EDGE__TYPE = eINSTANCE.getSpecialEdge_Type();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIAL_EDGE__DESTINATION = eINSTANCE.getSpecialEdge_Destination();

		/**
		 * The meta object literal for the '{@link org.be.graphbt.model.graphbt.impl.EmptyNodeImpl <em>Empty Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.graphbt.model.graphbt.impl.EmptyNodeImpl
		 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getEmptyNode()
		 * @generated
		 */
		EClass EMPTY_NODE = eINSTANCE.getEmptyNode();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPTY_NODE__LABEL = eINSTANCE.getEmptyNode_Label();

		/**
		 * The meta object literal for the '{@link org.be.graphbt.model.graphbt.impl.StandardNodeImpl <em>Standard Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.graphbt.model.graphbt.impl.StandardNodeImpl
		 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getStandardNode()
		 * @generated
		 */
		EClass STANDARD_NODE = eINSTANCE.getStandardNode();

		/**
		 * The meta object literal for the '<em><b>Traceability Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_NODE__TRACEABILITY_STATUS = eINSTANCE.getStandardNode_TraceabilityStatus();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_NODE__OPERATOR = eINSTANCE.getStandardNode_Operator();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_NODE__LABEL = eINSTANCE.getStandardNode_Label();

		/**
		 * The meta object literal for the '<em><b>Component Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_NODE__COMPONENT_REF = eINSTANCE.getStandardNode_ComponentRef();

		/**
		 * The meta object literal for the '<em><b>Behavior Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_NODE__BEHAVIOR_REF = eINSTANCE.getStandardNode_BehaviorRef();

		/**
		 * The meta object literal for the '<em><b>Traceability Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_NODE__TRACEABILITY_LINK = eINSTANCE.getStandardNode_TraceabilityLink();

		/**
		 * The meta object literal for the '<em><b>Leaf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_NODE__LEAF = eINSTANCE.getStandardNode_Leaf();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STANDARD_NODE__PARENT = eINSTANCE.getStandardNode_Parent();

		/**
		 * The meta object literal for the '{@link org.be.graphbt.model.graphbt.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.graphbt.model.graphbt.impl.ComponentImpl
		 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Component Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__COMPONENT_NAME = eINSTANCE.getComponent_ComponentName();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__ATTRIBUTES = eINSTANCE.getComponent_Attributes();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__STATE = eINSTANCE.getComponent_State();

		/**
		 * The meta object literal for the '<em><b>Initial State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__INITIAL_STATE = eINSTANCE.getComponent_InitialState();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__ID = eINSTANCE.getComponent_Id();

		/**
		 * The meta object literal for the '<em><b>Related To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__RELATED_TO = eINSTANCE.getComponent_RelatedTo();

		/**
		 * The meta object literal for the '<em><b>Behaviors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__BEHAVIORS = eINSTANCE.getComponent_Behaviors();

		/**
		 * The meta object literal for the '<em><b>Component Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__COMPONENT_REF = eINSTANCE.getComponent_ComponentRef();

		/**
		 * The meta object literal for the '<em><b>Component Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__COMPONENT_DESC = eINSTANCE.getComponent_ComponentDesc();

		/**
		 * The meta object literal for the '<em><b>Enumerated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__ENUMERATED = eINSTANCE.getComponent_Enumerated();

		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__USES = eINSTANCE.getComponent_Uses();

		/**
		 * The meta object literal for the '{@link org.be.graphbt.model.graphbt.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.graphbt.model.graphbt.impl.AttributeImpl
		 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

		/**
		 * The meta object literal for the '{@link org.be.graphbt.model.graphbt.impl.CTEdgeImpl <em>CT Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.graphbt.model.graphbt.impl.CTEdgeImpl
		 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getCTEdge()
		 * @generated
		 */
		EClass CT_EDGE = eINSTANCE.getCTEdge();

		/**
		 * The meta object literal for the '{@link org.be.graphbt.model.graphbt.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.graphbt.model.graphbt.impl.StateImpl
		 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__REF = eINSTANCE.getState_Ref();

		/**
		 * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__DESC = eINSTANCE.getState_Desc();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ATTRIBUTES = eINSTANCE.getState_Attributes();

		/**
		 * The meta object literal for the '{@link org.be.graphbt.model.graphbt.impl.LibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.graphbt.model.graphbt.impl.LibraryImpl
		 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getLibrary()
		 * @generated
		 */
		EClass LIBRARY = eINSTANCE.getLibrary();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIBRARY__NAME = eINSTANCE.getLibrary_Name();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIBRARY__TEXT = eINSTANCE.getLibrary_Text();

		/**
		 * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIBRARY__DESC = eINSTANCE.getLibrary_Desc();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIBRARY__LOCATION = eINSTANCE.getLibrary_Location();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIBRARY__ID = eINSTANCE.getLibrary_Id();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__METHODS = eINSTANCE.getLibrary_Methods();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__STATES = eINSTANCE.getLibrary_States();

		/**
		 * The meta object literal for the '<em><b>Behaviors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__BEHAVIORS = eINSTANCE.getLibrary_Behaviors();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__ATTRIBUTES = eINSTANCE.getLibrary_Attributes();

		/**
		 * The meta object literal for the '{@link org.be.graphbt.model.graphbt.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.graphbt.model.graphbt.impl.RequirementImpl
		 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__KEY = eINSTANCE.getRequirement_Key();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__REQUIREMENT = eINSTANCE.getRequirement_Requirement();

		/**
		 * The meta object literal for the '<em><b>Traceability Link</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__TRACEABILITY_LINK = eINSTANCE.getRequirement_TraceabilityLink();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__DESCRIPTION = eINSTANCE.getRequirement_Description();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__ID = eINSTANCE.getRequirement_Id();

		/**
		 * The meta object literal for the '{@link org.be.graphbt.model.graphbt.impl.BehaviorImpl <em>Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.graphbt.model.graphbt.impl.BehaviorImpl
		 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getBehavior()
		 * @generated
		 */
		EClass BEHAVIOR = eINSTANCE.getBehavior();

		/**
		 * The meta object literal for the '<em><b>Behavior Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR__BEHAVIOR_TYPE = eINSTANCE.getBehavior_BehaviorType();

		/**
		 * The meta object literal for the '<em><b>Behavior Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR__BEHAVIOR_NAME = eINSTANCE.getBehavior_BehaviorName();

		/**
		 * The meta object literal for the '<em><b>Behavior Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR__BEHAVIOR_REF = eINSTANCE.getBehavior_BehaviorRef();

		/**
		 * The meta object literal for the '<em><b>Behavior Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR__BEHAVIOR_DESC = eINSTANCE.getBehavior_BehaviorDesc();

		/**
		 * The meta object literal for the '<em><b>Technical Detail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR__TECHNICAL_DETAIL = eINSTANCE.getBehavior_TechnicalDetail();

		/**
		 * The meta object literal for the '{@link org.be.graphbt.model.graphbt.impl.ComponentListImpl <em>Component List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.graphbt.model.graphbt.impl.ComponentListImpl
		 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getComponentList()
		 * @generated
		 */
		EClass COMPONENT_LIST = eINSTANCE.getComponentList();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_LIST__COMPONENTS = eINSTANCE.getComponentList_Components();

		/**
		 * The meta object literal for the '{@link org.be.graphbt.model.graphbt.impl.RequirementListImpl <em>Requirement List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.graphbt.model.graphbt.impl.RequirementListImpl
		 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getRequirementList()
		 * @generated
		 */
		EClass REQUIREMENT_LIST = eINSTANCE.getRequirementList();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_LIST__REQUIREMENTS = eINSTANCE.getRequirementList_Requirements();

		/**
		 * The meta object literal for the '<em><b>Project Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_LIST__PROJECT_ID = eINSTANCE.getRequirementList_ProjectId();

		/**
		 * The meta object literal for the '{@link org.be.graphbt.model.graphbt.impl.FormulaListImpl <em>Formula List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.graphbt.model.graphbt.impl.FormulaListImpl
		 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getFormulaList()
		 * @generated
		 */
		EClass FORMULA_LIST = eINSTANCE.getFormulaList();

		/**
		 * The meta object literal for the '<em><b>Formula</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMULA_LIST__FORMULA = eINSTANCE.getFormulaList_Formula();

		/**
		 * The meta object literal for the '{@link org.be.graphbt.model.graphbt.impl.FormulaImpl <em>Formula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.graphbt.model.graphbt.impl.FormulaImpl
		 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getFormula()
		 * @generated
		 */
		EClass FORMULA = eINSTANCE.getFormula();

		/**
		 * The meta object literal for the '<em><b>Formula Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULA__FORMULA_NAME = eINSTANCE.getFormula_FormulaName();

		/**
		 * The meta object literal for the '{@link org.be.graphbt.model.graphbt.impl.OperatorClassImpl <em>Operator Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.graphbt.model.graphbt.impl.OperatorClassImpl
		 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getOperatorClass()
		 * @generated
		 */
		EClass OPERATOR_CLASS = eINSTANCE.getOperatorClass();

		/**
		 * The meta object literal for the '<em><b>Operator Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATOR_CLASS__OPERATOR_LITERAL = eINSTANCE.getOperatorClass_OperatorLiteral();

		/**
		 * The meta object literal for the '{@link org.be.graphbt.model.graphbt.impl.TraceabilityStatusClassImpl <em>Traceability Status Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.graphbt.model.graphbt.impl.TraceabilityStatusClassImpl
		 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getTraceabilityStatusClass()
		 * @generated
		 */
		EClass TRACEABILITY_STATUS_CLASS = eINSTANCE.getTraceabilityStatusClass();

		/**
		 * The meta object literal for the '<em><b>Traceability Status Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACEABILITY_STATUS_CLASS__TRACEABILITY_STATUS_LITERAL = eINSTANCE.getTraceabilityStatusClass_TraceabilityStatusLiteral();

		/**
		 * The meta object literal for the '{@link org.be.graphbt.model.graphbt.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.graphbt.model.graphbt.impl.LinkImpl
		 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__TARGET = eINSTANCE.getLink_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__SOURCE = eINSTANCE.getLink_Source();

		/**
		 * The meta object literal for the '{@link org.be.graphbt.model.graphbt.impl.AlternativeClassImpl <em>Alternative Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.graphbt.model.graphbt.impl.AlternativeClassImpl
		 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getAlternativeClass()
		 * @generated
		 */
		EClass ALTERNATIVE_CLASS = eINSTANCE.getAlternativeClass();

		/**
		 * The meta object literal for the '<em><b>Alternative Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALTERNATIVE_CLASS__ALTERNATIVE_ATTRIBUTE = eINSTANCE.getAlternativeClass_AlternativeAttribute();

		/**
		 * The meta object literal for the '{@link org.be.graphbt.model.graphbt.impl.MapInformationImpl <em>Map Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.graphbt.model.graphbt.impl.MapInformationImpl
		 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getMapInformation()
		 * @generated
		 */
		EClass MAP_INFORMATION = eINSTANCE.getMapInformation();

		/**
		 * The meta object literal for the '<em><b>Info</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_INFORMATION__INFO = eINSTANCE.getMapInformation_Info();

		/**
		 * The meta object literal for the '{@link org.be.graphbt.model.graphbt.impl.InformationImpl <em>Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.graphbt.model.graphbt.impl.InformationImpl
		 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getInformation()
		 * @generated
		 */
		EClass INFORMATION = eINSTANCE.getInformation();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION__KEY = eINSTANCE.getInformation_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION__VALUE = eINSTANCE.getInformation_Value();

		/**
		 * The meta object literal for the '{@link org.be.graphbt.model.graphbt.impl.InputTypeImpl <em>Input Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.graphbt.model.graphbt.impl.InputTypeImpl
		 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getInputType()
		 * @generated
		 */
		EClass INPUT_TYPE = eINSTANCE.getInputType();

		/**
		 * The meta object literal for the '{@link org.be.graphbt.model.graphbt.impl.OutputTypeImpl <em>Output Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.graphbt.model.graphbt.impl.OutputTypeImpl
		 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getOutputType()
		 * @generated
		 */
		EClass OUTPUT_TYPE = eINSTANCE.getOutputType();

		/**
		 * The meta object literal for the '{@link org.be.graphbt.model.graphbt.impl.GUIImplementableImpl <em>GUI Implementable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.graphbt.model.graphbt.impl.GUIImplementableImpl
		 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getGUIImplementable()
		 * @generated
		 */
		EClass GUI_IMPLEMENTABLE = eINSTANCE.getGUIImplementable();

		/**
		 * The meta object literal for the '{@link org.be.graphbt.model.graphbt.impl.GUIImpl <em>GUI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.graphbt.model.graphbt.impl.GUIImpl
		 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getGUI()
		 * @generated
		 */
		EClass GUI = eINSTANCE.getGUI();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI__IDENTIFIER = eINSTANCE.getGUI_Identifier();

		/**
		 * The meta object literal for the '<em><b>Code Implementation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI__CODE_IMPLEMENTATION = eINSTANCE.getGUI_CodeImplementation();

		/**
		 * The meta object literal for the '{@link org.be.graphbt.model.graphbt.impl.InputGUIImpl <em>Input GUI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.graphbt.model.graphbt.impl.InputGUIImpl
		 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getInputGUI()
		 * @generated
		 */
		EClass INPUT_GUI = eINSTANCE.getInputGUI();

		/**
		 * The meta object literal for the '{@link org.be.graphbt.model.graphbt.impl.OutputGUIImpl <em>Output GUI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.graphbt.model.graphbt.impl.OutputGUIImpl
		 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getOutputGUI()
		 * @generated
		 */
		EClass OUTPUT_GUI = eINSTANCE.getOutputGUI();

		/**
		 * The meta object literal for the '{@link org.be.graphbt.model.graphbt.impl.LibrariesImpl <em>Libraries</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.graphbt.model.graphbt.impl.LibrariesImpl
		 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getLibraries()
		 * @generated
		 */
		EClass LIBRARIES = eINSTANCE.getLibraries();

		/**
		 * The meta object literal for the '<em><b>Import</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARIES__IMPORT = eINSTANCE.getLibraries_Import();

		/**
		 * The meta object literal for the '{@link org.be.graphbt.model.graphbt.impl.MethodDeclarationImpl <em>Method Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.graphbt.model.graphbt.impl.MethodDeclarationImpl
		 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getMethodDeclaration()
		 * @generated
		 */
		EClass METHOD_DECLARATION = eINSTANCE.getMethodDeclaration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_DECLARATION__NAME = eINSTANCE.getMethodDeclaration_Name();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_DECLARATION__PARAMETERS = eINSTANCE.getMethodDeclaration_Parameters();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_DECLARATION__TYPE = eINSTANCE.getMethodDeclaration_Type();

		/**
		 * The meta object literal for the '{@link org.be.graphbt.model.graphbt.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.graphbt.model.graphbt.impl.ParameterImpl
		 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '{@link org.be.graphbt.model.graphbt.impl.LayoutListImpl <em>Layout List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.graphbt.model.graphbt.impl.LayoutListImpl
		 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getLayoutList()
		 * @generated
		 */
		EClass LAYOUT_LIST = eINSTANCE.getLayoutList();

		/**
		 * The meta object literal for the '<em><b>Layouts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT_LIST__LAYOUTS = eINSTANCE.getLayoutList_Layouts();

		/**
		 * The meta object literal for the '{@link org.be.graphbt.model.graphbt.impl.LayoutImpl <em>Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.graphbt.model.graphbt.impl.LayoutImpl
		 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getLayout()
		 * @generated
		 */
		EClass LAYOUT = eINSTANCE.getLayout();

		/**
		 * The meta object literal for the '<em><b>CRef</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__CREF = eINSTANCE.getLayout_CRef();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__X = eINSTANCE.getLayout_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__Y = eINSTANCE.getLayout_Y();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__WIDTH = eINSTANCE.getLayout_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__HEIGHT = eINSTANCE.getLayout_Height();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__Z = eINSTANCE.getLayout_Z();

		/**
		 * The meta object literal for the '{@link org.be.graphbt.model.graphbt.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.graphbt.model.graphbt.impl.ButtonImpl
		 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__LABEL = eINSTANCE.getButton_Label();

		/**
		 * The meta object literal for the '{@link org.be.graphbt.model.graphbt.impl.AuthorListImpl <em>Author List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.graphbt.model.graphbt.impl.AuthorListImpl
		 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getAuthorList()
		 * @generated
		 */
		EClass AUTHOR_LIST = eINSTANCE.getAuthorList();

		/**
		 * The meta object literal for the '<em><b>Authors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHOR_LIST__AUTHORS = eINSTANCE.getAuthorList_Authors();

		/**
		 * The meta object literal for the '{@link org.be.graphbt.model.graphbt.impl.AuthorImpl <em>Author</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.graphbt.model.graphbt.impl.AuthorImpl
		 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getAuthor()
		 * @generated
		 */
		EClass AUTHOR = eINSTANCE.getAuthor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHOR__NAME = eINSTANCE.getAuthor_Name();

		/**
		 * The meta object literal for the '<em><b>Contact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHOR__CONTACT = eINSTANCE.getAuthor_Contact();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHOR__ROLE = eINSTANCE.getAuthor_Role();

		/**
		 * The meta object literal for the '{@link org.be.graphbt.model.graphbt.Composition <em>Composition</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.graphbt.model.graphbt.Composition
		 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getComposition()
		 * @generated
		 */
		EEnum COMPOSITION = eINSTANCE.getComposition();

		/**
		 * The meta object literal for the '{@link org.be.graphbt.model.graphbt.Branch <em>Branch</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.graphbt.model.graphbt.Branch
		 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getBranch()
		 * @generated
		 */
		EEnum BRANCH = eINSTANCE.getBranch();

		/**
		 * The meta object literal for the '{@link org.be.graphbt.model.graphbt.Operator <em>Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.graphbt.model.graphbt.Operator
		 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getOperator()
		 * @generated
		 */
		EEnum OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '{@link org.be.graphbt.model.graphbt.BehaviorType <em>Behavior Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.graphbt.model.graphbt.BehaviorType
		 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getBehaviorType()
		 * @generated
		 */
		EEnum BEHAVIOR_TYPE = eINSTANCE.getBehaviorType();

		/**
		 * The meta object literal for the '{@link org.be.graphbt.model.graphbt.EventType <em>Event Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.graphbt.model.graphbt.EventType
		 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getEventType()
		 * @generated
		 */
		EEnum EVENT_TYPE = eINSTANCE.getEventType();

		/**
		 * The meta object literal for the '{@link org.be.graphbt.model.graphbt.SpecialEdgeEnum <em>Special Edge Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.graphbt.model.graphbt.SpecialEdgeEnum
		 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getSpecialEdgeEnum()
		 * @generated
		 */
		EEnum SPECIAL_EDGE_ENUM = eINSTANCE.getSpecialEdgeEnum();

		/**
		 * The meta object literal for the '{@link org.be.graphbt.model.graphbt.TraceabilityStatus <em>Traceability Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.be.graphbt.model.graphbt.TraceabilityStatus
		 * @see org.be.graphbt.model.graphbt.impl.GraphBTPackageImpl#getTraceabilityStatus()
		 * @generated
		 */
		EEnum TRACEABILITY_STATUS = eINSTANCE.getTraceabilityStatus();

	}

} //GraphBTPackage
