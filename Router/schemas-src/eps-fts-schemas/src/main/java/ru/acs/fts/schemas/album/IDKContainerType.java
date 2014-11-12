
package ru.acs.fts.schemas.album;

/** 
 * Сведения о контейнере
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Information:IDKDocuments:IDKCommonAggregateTypesCust:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="IDKContainerType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="Number"/>
 *     &lt;xs:element type="xs:string" name="ContainerNumeric" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class IDKContainerType
{
    private String number;
    private String containerNumeric;

    /** 
     * Get the 'Number' element value. Номер контейнера
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'Number' element value. Номер контейнера
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /** 
     * Get the 'ContainerNumeric' element value. Порядковый номер контейнера
     * 
     * @return value
     */
    public String getContainerNumeric() {
        return containerNumeric;
    }

    /** 
     * Set the 'ContainerNumeric' element value. Порядковый номер контейнера
     * 
     * @param containerNumeric
     */
    public void setContainerNumeric(String containerNumeric) {
        this.containerNumeric = containerNumeric;
    }
}
