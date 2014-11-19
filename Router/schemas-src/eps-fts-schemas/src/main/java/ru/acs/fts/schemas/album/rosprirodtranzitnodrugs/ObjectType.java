
package ru.acs.fts.schemas.album.rosprirodtranzitnodrugs;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * Ядовитое вещество, на транзит которого выдано разрешение
 */
public class ObjectType
{
    private List<String> infoList = new ArrayList<String>();
    private String TNVED;
    private String numeric;
    private CUOrganizationType sender;
    private CUOrganizationType receiver;
    private SupplementaryQuantityType count;
    private DocumentBaseType contract;

    /** 
     * Get the list of 'Info' element items. Описание ядовитых веществ
     * 
     * @return list
     */
    public List<String> getInfoList() {
        return infoList;
    }

    /** 
     * Set the list of 'Info' element items. Описание ядовитых веществ
     * 
     * @param list
     */
    public void setInfoList(List<String> list) {
        infoList = list;
    }

    /** 
     * Get the 'TNVED' element value. Код ТН ВЭД ТС
     * 
     * @return value
     */
    public String getTNVED() {
        return TNVED;
    }

    /** 
     * Set the 'TNVED' element value. Код ТН ВЭД ТС
     * 
     * @param TNVED
     */
    public void setTNVED(String TNVED) {
        this.TNVED = TNVED;
    }

    /** 
     * Get the 'Numeric' element value. Номер позиции 
     * 
     * @return value
     */
    public String getNumeric() {
        return numeric;
    }

    /** 
     * Set the 'Numeric' element value. Номер позиции 
     * 
     * @param numeric
     */
    public void setNumeric(String numeric) {
        this.numeric = numeric;
    }

    /** 
     * Get the 'Sender' element value. Отправитель
     * 
     * @return value
     */
    public CUOrganizationType getSender() {
        return sender;
    }

    /** 
     * Set the 'Sender' element value. Отправитель
     * 
     * @param sender
     */
    public void setSender(CUOrganizationType sender) {
        this.sender = sender;
    }

    /** 
     * Get the 'Receiver' element value. Получатель
     * 
     * @return value
     */
    public CUOrganizationType getReceiver() {
        return receiver;
    }

    /** 
     * Set the 'Receiver' element value. Получатель
     * 
     * @param receiver
     */
    public void setReceiver(CUOrganizationType receiver) {
        this.receiver = receiver;
    }

    /** 
     * Get the 'Count' element value. Количество
     * 
     * @return value
     */
    public SupplementaryQuantityType getCount() {
        return count;
    }

    /** 
     * Set the 'Count' element value. Количество
     * 
     * @param count
     */
    public void setCount(SupplementaryQuantityType count) {
        this.count = count;
    }

    /** 
     * Get the 'Contract' element value. Реквизиты контракта
     * 
     * @return value
     */
    public DocumentBaseType getContract() {
        return contract;
    }

    /** 
     * Set the 'Contract' element value. Реквизиты контракта
     * 
     * @param contract
     */
    public void setContract(DocumentBaseType contract) {
        this.contract = contract;
    }
}
