/**
 */
package tinycc.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tinycc.Connector;
import tinycc.ConnectorEnd;
import tinycc.Property;
import tinycc.TinyccPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tinycc.impl.ConnectorImpl#getEnds <em>Ends</em>}</li>
 *   <li>{@link tinycc.impl.ConnectorImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link tinycc.impl.ConnectorImpl#getOppositeConnector <em>Opposite Connector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorImpl extends SimlementImpl implements Connector {
	/**
	 * The cached value of the '{@link #getEnds() <em>Ends</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnds()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectorEnd> ends;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * The cached value of the '{@link #getOppositeConnector() <em>Opposite Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOppositeConnector()
	 * @generated
	 * @ordered
	 */
	protected Connector oppositeConnector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TinyccPackage.Literals.CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConnectorEnd> getEnds() {
		if (ends == null) {
			ends = new EObjectContainmentEList<ConnectorEnd>(ConnectorEnd.class, this, TinyccPackage.CONNECTOR__ENDS);
		}
		return ends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this, TinyccPackage.CONNECTOR__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connector getOppositeConnector() {
		if (oppositeConnector != null && oppositeConnector.eIsProxy()) {
			InternalEObject oldOppositeConnector = (InternalEObject)oppositeConnector;
			oppositeConnector = (Connector)eResolveProxy(oldOppositeConnector);
			if (oppositeConnector != oldOppositeConnector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TinyccPackage.CONNECTOR__OPPOSITE_CONNECTOR, oldOppositeConnector, oppositeConnector));
			}
		}
		return oppositeConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector basicGetOppositeConnector() {
		return oppositeConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOppositeConnector(Connector newOppositeConnector) {
		Connector oldOppositeConnector = oppositeConnector;
		oppositeConnector = newOppositeConnector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TinyccPackage.CONNECTOR__OPPOSITE_CONNECTOR, oldOppositeConnector, oppositeConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TinyccPackage.CONNECTOR__ENDS:
				return ((InternalEList<?>)getEnds()).basicRemove(otherEnd, msgs);
			case TinyccPackage.CONNECTOR__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
			case TinyccPackage.CONNECTOR__ENDS:
				return getEnds();
			case TinyccPackage.CONNECTOR__PROPERTIES:
				return getProperties();
			case TinyccPackage.CONNECTOR__OPPOSITE_CONNECTOR:
				if (resolve) return getOppositeConnector();
				return basicGetOppositeConnector();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TinyccPackage.CONNECTOR__ENDS:
				getEnds().clear();
				getEnds().addAll((Collection<? extends ConnectorEnd>)newValue);
				return;
			case TinyccPackage.CONNECTOR__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case TinyccPackage.CONNECTOR__OPPOSITE_CONNECTOR:
				setOppositeConnector((Connector)newValue);
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
			case TinyccPackage.CONNECTOR__ENDS:
				getEnds().clear();
				return;
			case TinyccPackage.CONNECTOR__PROPERTIES:
				getProperties().clear();
				return;
			case TinyccPackage.CONNECTOR__OPPOSITE_CONNECTOR:
				setOppositeConnector((Connector)null);
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
			case TinyccPackage.CONNECTOR__ENDS:
				return ends != null && !ends.isEmpty();
			case TinyccPackage.CONNECTOR__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case TinyccPackage.CONNECTOR__OPPOSITE_CONNECTOR:
				return oppositeConnector != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectorImpl
