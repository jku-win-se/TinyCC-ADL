/**
 */
package tinycc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tinycc.Property#getValues <em>Values</em>}</li>
 *   <li>{@link tinycc.Property#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see tinycc.TinyccPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends Entity {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see tinycc.TinyccPackage#getProperty_Values()
	 * @model
	 * @generated
	 */
	EList<String> getValues();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' attribute list.
	 * @see tinycc.TinyccPackage#getProperty_Types()
	 * @model
	 * @generated
	 */
	EList<String> getTypes();

} // Property
