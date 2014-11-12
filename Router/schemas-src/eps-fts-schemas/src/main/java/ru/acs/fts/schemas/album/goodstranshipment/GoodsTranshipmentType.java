
package ru.acs.fts.schemas.album.goodstranshipment;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Уведомление о необходимости проведения грузовых операций и/или продлении срока транзита
 */
public class GoodsTranshipmentType extends BaseDocType
{
    private String documentDirection;
    private int choiceSelect = -1;
    private static final int TD_CHOICE = 0;
    private static final int TIRID_CHOICE = 1;
    private GTDIDType TD;
    private TIRIDType TIRID;
    private IncidentInfoType incidentInfo;
    private ReloadPlaceType reloadPlace;
    private List<TransportInfoType> transportList = new ArrayList<TransportInfoType>();
    private List<SealType> sealList = new ArrayList<SealType>();
    private CustomsPersonType customsPerson;
    private List<ConsignmentType> consignmentList = new ArrayList<ConsignmentType>();
    private String documentModeID;

    /** 
     * Get the 'DocumentDirection' element value. Признак направления документа: 0 - от участника ВЭД в ТО; 1 - от ТО участнику ВЭД
     * 
     * @return value
     */
    public String getDocumentDirection() {
        return documentDirection;
    }

    /** 
     * Set the 'DocumentDirection' element value. Признак направления документа: 0 - от участника ВЭД в ТО; 1 - от ТО участнику ВЭД
     * 
     * @param documentDirection
     */
    public void setDocumentDirection(String documentDirection) {
        this.documentDirection = documentDirection;
    }

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
     * Check if TD is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifTD() {
        return choiceSelect == TD_CHOICE;
    }

    /** 
     * Get the 'TD' element value. Номер транзитной декларации
     * 
     * @return value
     */
    public GTDIDType getTD() {
        return TD;
    }

    /** 
     * Set the 'TD' element value. Номер транзитной декларации
     * 
     * @param TD
     */
    public void setTD(GTDIDType TD) {
        setChoiceSelect(TD_CHOICE);
        this.TD = TD;
    }

    /** 
     * Check if TIRID is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifTIRID() {
        return choiceSelect == TIRID_CHOICE;
    }

    /** 
     * Get the 'TIRID' element value. Номер книжки МДП
     * 
     * @return value
     */
    public TIRIDType getTIRID() {
        return TIRID;
    }

    /** 
     * Set the 'TIRID' element value. Номер книжки МДП
     * 
     * @param TIRID
     */
    public void setTIRID(TIRIDType TIRID) {
        setChoiceSelect(TIRID_CHOICE);
        this.TIRID = TIRID;
    }

    /** 
     * Get the 'IncidentInfo' element value. Информация о происшествии (об аварии или действии непреодолимой силы во время перевозки)
     * 
     * @return value
     */
    public IncidentInfoType getIncidentInfo() {
        return incidentInfo;
    }

    /** 
     * Set the 'IncidentInfo' element value. Информация о происшествии (об аварии или действии непреодолимой силы во время перевозки)
     * 
     * @param incidentInfo
     */
    public void setIncidentInfo(IncidentInfoType incidentInfo) {
        this.incidentInfo = incidentInfo;
    }

    /** 
     * Get the 'ReloadPlace' element value. Место проведения грузовых и иных операций.
     * 
     * @return value
     */
    public ReloadPlaceType getReloadPlace() {
        return reloadPlace;
    }

    /** 
     * Set the 'ReloadPlace' element value. Место проведения грузовых и иных операций.
     * 
     * @param reloadPlace
     */
    public void setReloadPlace(ReloadPlaceType reloadPlace) {
        this.reloadPlace = reloadPlace;
    }

    /** 
     * Get the list of 'Transport' element items. Сведения о новом составе транспортных средств после проведения грузовых операций
     * 
     * @return list
     */
    public List<TransportInfoType> getTransportList() {
        return transportList;
    }

    /** 
     * Set the list of 'Transport' element items. Сведения о новом составе транспортных средств после проведения грузовых операций
     * 
     * @param list
     */
    public void setTransportList(List<TransportInfoType> list) {
        transportList = list;
    }

    /** 
     * Get the list of 'Seal' element items. Информация о вновь наложенных пломбах, печатях и иных средствах идентификации
     * 
     * @return list
     */
    public List<SealType> getSealList() {
        return sealList;
    }

    /** 
     * Set the list of 'Seal' element items. Информация о вновь наложенных пломбах, печатях и иных средствах идентификации
     * 
     * @param list
     */
    public void setSealList(List<SealType> list) {
        sealList = list;
    }

    /** 
     * Get the 'CustomsPerson' element value. Сведения о должностном лице таможенного органа, оформившем изменения
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. Сведения о должностном лице таможенного органа, оформившем изменения
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the list of 'Consignment' element items. Товаротранспортная накладная
     * 
     * @return list
     */
    public List<ConsignmentType> getConsignmentList() {
        return consignmentList;
    }

    /** 
     * Set the list of 'Consignment' element items. Товаротранспортная накладная
     * 
     * @param list
     */
    public void setConsignmentList(List<ConsignmentType> list) {
        consignmentList = list;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
