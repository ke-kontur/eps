
package ru.acs.fts.schemas.album;

import java.util.ArrayList;
import java.util.List;

/** 
 * Тип, описывающий ссылку на ПР/ЦПР, которые сработали на документе
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Information:CustomsDocuments:DTRevealedRisks:5.4.4" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ProfileRefType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:NFIInfoType" name="NFIInfo" minOccurs="0" maxOccurs="unbounded"/>
 *   &lt;/xs:sequence>
 *   &lt;xs:attribute type="xs:anySimpleType" name="URI"/>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ProfileRefType
{
    private List<NFIInfoType> NFIInfoList = new ArrayList<NFIInfoType>();
    private String URI;

    /** 
     * Get the list of 'NFIInfo' element items.
     * 
     * @return list
     */
    public List<NFIInfoType> getNFIInfoList() {
        return NFIInfoList;
    }

    /** 
     * Set the list of 'NFIInfo' element items.
     * 
     * @param list
     */
    public void setNFIInfoList(List<NFIInfoType> list) {
        NFIInfoList = list;
    }

    /** 
     * Get the 'URI' attribute value. Указывается на #ID
     * 
     * @return value
     */
    public String getURI() {
        return URI;
    }

    /** 
     * Set the 'URI' attribute value. Указывается на #ID
     * 
     * @param URI
     */
    public void setURI(String URI) {
        this.URI = URI;
    }
}
