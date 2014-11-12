
package ru.acs.fts.schemas.album;

import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Регистрационный номер документа
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Information:ExchangeDocuments:PaymentConfirmDocs:5.4.5" xmlns:ns1="urn:customs.ru:CommonAggregateTypes:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DocIDType">
 *   &lt;xs:choice>
 *     &lt;xs:element type="ns1:GTDIDType" name="DTRegNum"/>
 *     &lt;xs:element type="ns:MPORegNumType" name="MPORegNum"/>
 *   &lt;/xs:choice>
 * &lt;/xs:complexType>
 * </pre>
 */
public class DocIDType
{
    private int choiceSelect = -1;
    private static final int DT_REG_NUM_CHOICE = 0;
    private static final int MPO_REG_NUM_CHOICE = 1;
    private GTDIDType DTRegNum;
    private MPORegNumType MPORegNum;

    private void setChoiceSelect(int choice) {
        if (choiceSelect == -1) {
            choiceSelect = choice;
        } else if (choiceSelect != choice) {
            throw new IllegalStateException(
                    "Need to call clearChoiceSelect() before changing existing choice");
        }
    }

    /** 
     * Clear the choice selection.
     */
    public void clearChoiceSelect() {
        choiceSelect = -1;
    }

    /** 
     * Check if DTRegNum is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifDTRegNum() {
        return choiceSelect == DT_REG_NUM_CHOICE;
    }

    /** 
     * Get the 'DTRegNum' element value. Регистрационный номер ДТ/ реестра товаров
     * 
     * @return value
     */
    public GTDIDType getDTRegNum() {
        return DTRegNum;
    }

    /** 
     * Set the 'DTRegNum' element value. Регистрационный номер ДТ/ реестра товаров
     * 
     * @param DTRegNum
     */
    public void setDTRegNum(GTDIDType DTRegNum) {
        setChoiceSelect(DT_REG_NUM_CHOICE);
        this.DTRegNum = DTRegNum;
    }

    /** 
     * Check if MPORegNum is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifMPORegNum() {
        return choiceSelect == MPO_REG_NUM_CHOICE;
    }

    /** 
     * Get the 'MPORegNum' element value. Регистрационный номер МПО
     * 
     * @return value
     */
    public MPORegNumType getMPORegNum() {
        return MPORegNum;
    }

    /** 
     * Set the 'MPORegNum' element value. Регистрационный номер МПО
     * 
     * @param MPORegNum
     */
    public void setMPORegNum(MPORegNumType MPORegNum) {
        setChoiceSelect(MPO_REG_NUM_CHOICE);
        this.MPORegNum = MPORegNum;
    }
}
