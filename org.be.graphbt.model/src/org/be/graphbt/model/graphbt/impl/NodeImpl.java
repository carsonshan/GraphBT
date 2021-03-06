/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.be.graphbt.model.graphbt.impl;

import org.be.graphbt.model.graphbt.Edge;
import org.be.graphbt.model.graphbt.GraphBTPackage;
import org.be.graphbt.model.graphbt.Node;
import org.be.graphbt.model.graphbt.SpecialEdge;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.be.graphbt.model.graphbt.impl.NodeImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link org.be.graphbt.model.graphbt.impl.NodeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.be.graphbt.model.graphbt.impl.NodeImpl#getEdge <em>Edge</em>}</li>
 *   <li>{@link org.be.graphbt.model.graphbt.impl.NodeImpl#getSpecialE <em>Special E</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends EObjectImpl implements Node {
	/**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected int index = INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEdge() <em>Edge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdge()
	 * @generated
	 * @ordered
	 */
	protected Edge edge;

	/**
	 * The cached value of the '{@link #getSpecialE() <em>Special E</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialE()
	 * @generated
	 * @ordered
	 */
	protected SpecialEdge specialE;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphBTPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(int newIndex) {
		int oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphBTPackage.NODE__INDEX, oldIndex, index));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphBTPackage.NODE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edge getEdge() {
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEdge(Edge newEdge, NotificationChain msgs) {
		Edge oldEdge = edge;
		edge = newEdge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphBTPackage.NODE__EDGE, oldEdge, newEdge);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdge(Edge newEdge) {
		if (newEdge != edge) {
			NotificationChain msgs = null;
			if (edge != null)
				msgs = ((InternalEObject)edge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraphBTPackage.NODE__EDGE, null, msgs);
			if (newEdge != null)
				msgs = ((InternalEObject)newEdge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraphBTPackage.NODE__EDGE, null, msgs);
			msgs = basicSetEdge(newEdge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphBTPackage.NODE__EDGE, newEdge, newEdge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecialEdge getSpecialE() {
		if (specialE != null && specialE.eIsProxy()) {
			InternalEObject oldSpecialE = (InternalEObject)specialE;
			specialE = (SpecialEdge)eResolveProxy(oldSpecialE);
			if (specialE != oldSpecialE) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphBTPackage.NODE__SPECIAL_E, oldSpecialE, specialE));
			}
		}
		return specialE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecialEdge basicGetSpecialE() {
		return specialE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecialE(SpecialEdge newSpecialE) {
		SpecialEdge oldSpecialE = specialE;
		specialE = newSpecialE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphBTPackage.NODE__SPECIAL_E, oldSpecialE, specialE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphBTPackage.NODE__EDGE:
				return basicSetEdge(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphBTPackage.NODE__INDEX:
				return getIndex();
			case GraphBTPackage.NODE__ID:
				return getId();
			case GraphBTPackage.NODE__EDGE:
				return getEdge();
			case GraphBTPackage.NODE__SPECIAL_E:
				if (resolve) return getSpecialE();
				return basicGetSpecialE();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GraphBTPackage.NODE__INDEX:
				setIndex((Integer)newValue);
				return;
			case GraphBTPackage.NODE__ID:
				setId((String)newValue);
				return;
			case GraphBTPackage.NODE__EDGE:
				setEdge((Edge)newValue);
				return;
			case GraphBTPackage.NODE__SPECIAL_E:
				setSpecialE((SpecialEdge)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GraphBTPackage.NODE__INDEX:
				setIndex(INDEX_EDEFAULT);
				return;
			case GraphBTPackage.NODE__ID:
				setId(ID_EDEFAULT);
				return;
			case GraphBTPackage.NODE__EDGE:
				setEdge((Edge)null);
				return;
			case GraphBTPackage.NODE__SPECIAL_E:
				setSpecialE((SpecialEdge)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GraphBTPackage.NODE__INDEX:
				return index != INDEX_EDEFAULT;
			case GraphBTPackage.NODE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GraphBTPackage.NODE__EDGE:
				return edge != null;
			case GraphBTPackage.NODE__SPECIAL_E:
				return specialE != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (index: ");
		result.append(index);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
