/**
 */
package tinycc;


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
 * </ul>
 *
 * @see tinycc.TinyccPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends Simlement {
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

} // Port
