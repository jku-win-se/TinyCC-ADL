/**
 */
package tinycc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simlement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tinycc.Simlement#getSimModelPath <em>Sim Model Path</em>}</li>
 * </ul>
 *
 * @see tinycc.TinyccPackage#getSimlement()
 * @model abstract="true"
 * @generated
 */
public interface Simlement extends Element {
	/**
	 * Returns the value of the '<em><b>Sim Model Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sim Model Path</em>' attribute.
	 * @see #setSimModelPath(String)
	 * @see tinycc.TinyccPackage#getSimlement_SimModelPath()
	 * @model
	 * @generated
	 */
	String getSimModelPath();

	/**
	 * Sets the value of the '{@link tinycc.Simlement#getSimModelPath <em>Sim Model Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sim Model Path</em>' attribute.
	 * @see #getSimModelPath()
	 * @generated
	 */
	void setSimModelPath(String value);

} // Simlement
