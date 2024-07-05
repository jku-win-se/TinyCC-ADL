/**
 */
package tinycc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tinycc.Component#getProperties <em>Properties</em>}</li>
 *   <li>{@link tinycc.Component#getPorts <em>Ports</em>}</li>
 *   <li>{@link tinycc.Component#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see tinycc.TinyccPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends Simlement {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link tinycc.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see tinycc.TinyccPackage#getComponent_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link tinycc.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see tinycc.TinyccPackage#getComponent_Ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getPorts();

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link tinycc.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see tinycc.TinyccPackage#getComponent_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponents();

} // Component
