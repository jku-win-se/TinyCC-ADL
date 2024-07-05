/**
 */
package tinycc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tinycc.Item#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link tinycc.Item#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see tinycc.TinyccPackage#getItem()
 * @model
 * @generated
 */
public interface Item extends Simlement {
	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' reference list.
	 * The list contents are of type {@link tinycc.Connector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectors</em>' reference list.
	 * @see tinycc.TinyccPackage#getItem_Connectors()
	 * @model
	 * @generated
	 */
	EList<Connector> getConnectors();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link tinycc.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see tinycc.TinyccPackage#getItem_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

} // Item
