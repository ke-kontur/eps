
package ru.acs.fts.schemas.album.legalentityinfo;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * Сведения о правопреемстве
 */
public class SuccessionDataType
{
    private String successionCode;
    private String OGRNIP;
    private String INN;
    private List<SuccessionDetailsType> selfSuccessorList = new ArrayList<SuccessionDetailsType>();
    private List<SuccessionDetailsType> ownSuccessorList = new ArrayList<SuccessionDetailsType>();
    private List<CUOrganizationType> farmList = new ArrayList<CUOrganizationType>();
    private RecordDataType recordData;

    /** 
     * Get the 'SuccessionCode' element value. код преемства по справочнику СВПРЮЛ
     * 
     * @return value
     */
    public String getSuccessionCode() {
        return successionCode;
    }

    /** 
     * Set the 'SuccessionCode' element value. код преемства по справочнику СВПРЮЛ
     * 
     * @param successionCode
     */
    public void setSuccessionCode(String successionCode) {
        this.successionCode = successionCode;
    }

    /** 
     * Get the 'OGRNIP' element value. Основной государственный регистрационный номер индивидуального предпринимателя (ОГРНИП)
     * 
     * @return value
     */
    public String getOGRNIP() {
        return OGRNIP;
    }

    /** 
     * Set the 'OGRNIP' element value. Основной государственный регистрационный номер индивидуального предпринимателя (ОГРНИП)
     * 
     * @param OGRNIP
     */
    public void setOGRNIP(String OGRNIP) {
        this.OGRNIP = OGRNIP;
    }

    /** 
     * Get the 'INN' element value. ИНН физического лица
     * 
     * @return value
     */
    public String getINN() {
        return INN;
    }

    /** 
     * Set the 'INN' element value. ИНН физического лица
     * 
     * @param INN
     */
    public void setINN(String INN) {
        this.INN = INN;
    }

    /** 
     * Get the list of 'SelfSuccessor' element items. Сведения о юридическом лице, правопреемником которого являлось юридическое лицо при создании путем реорганизации или при реорганизации в форме присоединения
     * 
     * @return list
     */
    public List<SuccessionDetailsType> getSelfSuccessorList() {
        return selfSuccessorList;
    }

    /** 
     * Set the list of 'SelfSuccessor' element items. Сведения о юридическом лице, правопреемником которого являлось юридическое лицо при создании путем реорганизации или при реорганизации в форме присоединения
     * 
     * @param list
     */
    public void setSelfSuccessorList(List<SuccessionDetailsType> list) {
        selfSuccessorList = list;
    }

    /** 
     * Get the list of 'OwnSuccessor' element items. Сведения о юридическом лице - правопреемнике  при прекращении деятельности в результате реорганизации или при реорганизации в форме выделения
     * 
     * @return list
     */
    public List<SuccessionDetailsType> getOwnSuccessorList() {
        return ownSuccessorList;
    }

    /** 
     * Set the list of 'OwnSuccessor' element items. Сведения о юридическом лице - правопреемнике  при прекращении деятельности в результате реорганизации или при реорганизации в форме выделения
     * 
     * @param list
     */
    public void setOwnSuccessorList(List<SuccessionDetailsType> list) {
        ownSuccessorList = list;
    }

    /** 
     * Get the list of 'Farm' element items. Сведения о крестьянском (фермерском) хозяйстве (КФХ), на базе имущества которого создано юридическое лицо, или о КФХ, сведения о котором внесены в ЕГРИП, при приведении статуса КФХ в соответствие с действующим законодательством
     * 
     * @return list
     */
    public List<CUOrganizationType> getFarmList() {
        return farmList;
    }

    /** 
     * Set the list of 'Farm' element items. Сведения о крестьянском (фермерском) хозяйстве (КФХ), на базе имущества которого создано юридическое лицо, или о КФХ, сведения о котором внесены в ЕГРИП, при приведении статуса КФХ в соответствие с действующим законодательством
     * 
     * @param list
     */
    public void setFarmList(List<CUOrganizationType> list) {
        farmList = list;
    }

    /** 
     * Get the 'RecordData' element value. Сведения о записи
     * 
     * @return value
     */
    public RecordDataType getRecordData() {
        return recordData;
    }

    /** 
     * Set the 'RecordData' element value. Сведения о записи
     * 
     * @param recordData
     */
    public void setRecordData(RecordDataType recordData) {
        this.recordData = recordData;
    }
}
