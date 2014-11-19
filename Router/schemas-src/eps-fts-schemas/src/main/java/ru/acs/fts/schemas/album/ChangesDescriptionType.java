
package ru.acs.fts.schemas.album;

import java.util.ArrayList;
import java.util.List;

/** 
 * Описание вносимых изменений (дополнений)
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Information:ExchangeDocuments:DeclChangeRequest:5.4.3" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ChangesDescriptionType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="GRNumber"/>
 *     &lt;xs:element type="xs:string" name="PreviousData" minOccurs="0" maxOccurs="unbounded"/>
 *     &lt;xs:element type="xs:string" name="CorrectData" minOccurs="0" maxOccurs="unbounded"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ChangesDescriptionType
{
    private String GRNumber;
    private List<String> previousDataList = new ArrayList<String>();
    private List<String> correctDataList = new ArrayList<String>();

    /** 
     * Get the 'GRNumber' element value. Обозначение графы (подраздела графы)
     * 
     * @return value
     */
    public String getGRNumber() {
        return GRNumber;
    }

    /** 
     * Set the 'GRNumber' element value. Обозначение графы (подраздела графы)
     * 
     * @param GRNumber
     */
    public void setGRNumber(String GRNumber) {
        this.GRNumber = GRNumber;
    }

    /** 
     * Get the list of 'PreviousData' element items. Ранее указанные сведения
     * 
     * @return list
     */
    public List<String> getPreviousDataList() {
        return previousDataList;
    }

    /** 
     * Set the list of 'PreviousData' element items. Ранее указанные сведения
     * 
     * @param list
     */
    public void setPreviousDataList(List<String> list) {
        previousDataList = list;
    }

    /** 
     * Get the list of 'CorrectData' element items. Измененные и (или) дополненные сведения
     * 
     * @return list
     */
    public List<String> getCorrectDataList() {
        return correctDataList;
    }

    /** 
     * Set the list of 'CorrectData' element items. Измененные и (или) дополненные сведения
     * 
     * @param list
     */
    public void setCorrectDataList(List<String> list) {
        correctDataList = list;
    }
}
