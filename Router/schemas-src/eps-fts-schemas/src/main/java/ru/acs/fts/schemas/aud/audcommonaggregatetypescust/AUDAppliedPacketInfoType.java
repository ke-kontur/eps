
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * Информация прикладной системы о пакете документов.
 */
public class AUDAppliedPacketInfoType
{
    private String appliedPacketId;
    private String description;
    private String appliedPacketType;
    private String appliedProcessId;
    private List<AUDGTDIDType> AUDGTDIDList = new ArrayList<AUDGTDIDType>();

    /** 
     * Get the 'AppliedPacketId' element value. Прикладной идентификатор пакета.
     * 
     * @return value
     */
    public String getAppliedPacketId() {
        return appliedPacketId;
    }

    /** 
     * Set the 'AppliedPacketId' element value. Прикладной идентификатор пакета.
     * 
     * @param appliedPacketId
     */
    public void setAppliedPacketId(String appliedPacketId) {
        this.appliedPacketId = appliedPacketId;
    }

    /** 
     * Get the 'Description' element value. Описание пакета.
     * 
     * @return value
     */
    public String getDescription() {
        return description;
    }

    /** 
     * Set the 'Description' element value. Описание пакета.
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /** 
     * Get the 'AppliedPacketType' element value. Тип размещаемого  пакета 01 - ГТД, 99 - прочие
     * 
     * @return value
     */
    public String getAppliedPacketType() {
        return appliedPacketType;
    }

    /** 
     * Set the 'AppliedPacketType' element value. Тип размещаемого  пакета 01 - ГТД, 99 - прочие
     * 
     * @param appliedPacketType
     */
    public void setAppliedPacketType(String appliedPacketType) {
        this.appliedPacketType = appliedPacketType;
    }

    /** 
     * Get the 'AppliedProcessId' element value. Уникальный идентификатор процесса
     * 
     * @return value
     */
    public String getAppliedProcessId() {
        return appliedProcessId;
    }

    /** 
     * Set the 'AppliedProcessId' element value. Уникальный идентификатор процесса
     * 
     * @param appliedProcessId
     */
    public void setAppliedProcessId(String appliedProcessId) {
        this.appliedProcessId = appliedProcessId;
    }

    /** 
     * Get the list of 'AUD_GTDID' element items. Регистрационный  номер ГТД заполняется  при   размещении  и предоставлении  пакета,  предназначенного для  хранения ГТД
     * 
     * @return list
     */
    public List<AUDGTDIDType> getAUDGTDIDList() {
        return AUDGTDIDList;
    }

    /** 
     * Set the list of 'AUD_GTDID' element items. Регистрационный  номер ГТД заполняется  при   размещении  и предоставлении  пакета,  предназначенного для  хранения ГТД
     * 
     * @param list
     */
    public void setAUDGTDIDList(List<AUDGTDIDType> list) {
        AUDGTDIDList = list;
    }
}
