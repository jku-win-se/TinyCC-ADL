/**
 */
package tinycc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tinycc.Connector#getEnds <em>Ends</em>}</li>
 *   <li>{@link tinycc.Connector#getProperty <em>Property</em>}</li>
 *   <li>{@link tinycc.Connector#getOppositeConnector <em>Opposite Connector</em>}</li>
 * </ul>
 *
 * @see tinycc.TinyccPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends Entity {
	/**
	 * Returns the value of the '<em><b>Ends</b></em>' containment reference list.
	 * The list contents are of type {@link tinycc.ConnectorEnd}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ends</em>' containment reference list.
	 * @see tinycc.TinyccPackage#getConnector_Ends()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConnectorEnd> getEnds();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link tinycc.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see tinycc.TinyccPackage#getConnector_Property()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperty();

	/**
	 * Returns the value of the '<em><b>Opposite Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposite Connector</em>' reference.
	 * @see #setOppositeConnector(Connector)
	 * @see tinycc.TinyccPackage#getConnector_OppositeConnector()
	 * @model
	 * @generated
	 */
	Connector getOppositeConnector();

	/**
	 * Sets the value of the '{@link tinycc.Connector#getOppositeConnector <em>Opposite Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite Connector</em>' reference.
	 * @see #getOppositeConnector()
	 * @generated
	 */
	void setOppositeConnector(Connector value);

} // Connector
