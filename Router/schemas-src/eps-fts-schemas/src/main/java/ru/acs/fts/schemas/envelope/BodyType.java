
package ru.acs.fts.schemas.envelope;

import java.util.ArrayList;
import java.util.List;

/** 
 * Тело
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.w3.org/2001/06/soap-envelope" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="BodyType">
 *   &lt;xs:sequence>
 *     &lt;xs:any minOccurs="0" maxOccurs="unbounded" processContents="skip"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class BodyType
{
    private List<Object> anyList = new ArrayList<Object>();

    /** 
     * Get the list of 'BodyType' complexType items. Прикладные данные (ЭД)
     * 
     * @return list
     */
    public List<Object> getAnyList() {
        return anyList;
    }

    /** 
     * Set the list of 'BodyType' complexType items. Прикладные данные (ЭД)
     * 
     * @param list
     */
    public void setAnyList(List<Object> list) {
        anyList = list;
    }
}
