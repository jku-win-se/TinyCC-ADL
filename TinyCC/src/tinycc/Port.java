/**
 */
package tinycc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tinycc.Port#getDirection <em>Direction</em>}</li>
 *   <li>{@link tinycc.Port#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see tinycc.TinyccPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends Entity {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link tinycc.FlowDirection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see tinycc.FlowDirection
	 * @see #setDirection(FlowDirection)
	 * @see tinycc.TinyccPackage#getPort_Direction()
	 * @model
	 * @generated
	 */
	FlowDirection getDirection();

	/**
	 * Sets the value of the '{@link tinycc.Port#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see tinycc.FlowDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(FlowDirection value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link tinycc.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see tinycc.TinyccPackage#getPort_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

} // Port
