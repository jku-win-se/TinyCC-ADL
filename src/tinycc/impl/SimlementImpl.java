/**
 */
package tinycc.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tinycc.Simlement;
import tinycc.TinyccPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simlement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tinycc.impl.SimlementImpl#getSimModelPath <em>Sim Model Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SimlementImpl extends ElementImpl implements Simlement {
	/**
	 * The default value of the '{@link #getSimModelPath() <em>Sim Model Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimModelPath()
	 * @generated
	 * @ordered
	 */
	protected static final String SIM_MODEL_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSimModelPath() <em>Sim Model Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimModelPath()
	 * @generated
	 * @ordered
	 */
	protected String simModelPath = SIM_MODEL_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimlementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TinyccPackage.Literals.SIMLEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSimModelPath() {
		return simModelPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSimModelPath(String newSimModelPath) {
		String oldSimModelPath = simModelPath;
		simModelPath = newSimModelPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TinyccPackage.SIMLEMENT__SIM_MODEL_PATH, oldSimModelPath, simModelPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TinyccPackage.SIMLEMENT__SIM_MODEL_PATH:
				return getSimModelPath();
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
			case TinyccPackage.SIMLEMENT__SIM_MODEL_PATH:
				setSimModelPath((String)newValue);
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
			case TinyccPackage.SIMLEMENT__SIM_MODEL_PATH:
				setSimModelPath(SIM_MODEL_PATH_EDEFAULT);
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
			case TinyccPackage.SIMLEMENT__SIM_MODEL_PATH:
				return SIM_MODEL_PATH_EDEFAULT == null ? simModelPath != null : !SIM_MODEL_PATH_EDEFAULT.equals(simModelPath);
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (simModelPath: ");
		result.append(simModelPath);
		result.append(')');
		return result.toString();
	}

} //SimlementImpl
