
package ru.acs.fts.schemas.album.coordinationrequests;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * Направление на согласование
 */
public class CoordinationRequestsType extends BaseDocType
{
    private LocalDate coordReqDate;
    private String coordReqTime;
    private String docID;
    private String coordReqNumber;
    private String farINN;
    private String farKPP;
    private PersonBaseType createUserNameFIO;
    private GTDIDType GTDID;
    private List<MeasureListType> measureList = new ArrayList<MeasureListType>();
    private List<GoodsInfoType> goodsInfoList = new ArrayList<GoodsInfoType>();
    private String documentModeID;

    /** 
     * Get the 'CoordReqDate' element value. Дата создания Направления
     * 
     * @return value
     */
    public LocalDate getCoordReqDate() {
        return coordReqDate;
    }

    /** 
     * Set the 'CoordReqDate' element value. Дата создания Направления
     * 
     * @param coordReqDate
     */
    public void setCoordReqDate(LocalDate coordReqDate) {
        this.coordReqDate = coordReqDate;
    }

    /** 
     * Get the 'CoordReqTime' element value. Время создания Направления
     * 
     * @return value
     */
    public String getCoordReqTime() {
        return coordReqTime;
    }

    /** 
     * Set the 'CoordReqTime' element value. Время создания Направления
     * 
     * @param coordReqTime
     */
    public void setCoordReqTime(String coordReqTime) {
        this.coordReqTime = coordReqTime;
    }

    /** 
     * Get the 'Doc_ID' element value. Уникальный идентификатор (DocumentID) того состояния ДТ, по которому было создано Направление (после создания 1 направления декларантом может быть прислана измененная ДТ,  для Направления по ней ИД ДТ будет уже другим)
     * 
     * @return value
     */
    public String getDocID() {
        return docID;
    }

    /** 
     * Set the 'Doc_ID' element value. Уникальный идентификатор (DocumentID) того состояния ДТ, по которому было создано Направление (после создания 1 направления декларантом может быть прислана измененная ДТ,  для Направления по ней ИД ДТ будет уже другим)
     * 
     * @param docID
     */
    public void setDocID(String docID) {
        this.docID = docID;
    }

    /** 
     * Get the 'CoordReqNumber' element value. Порядковый номер Направления
     * 
     * @return value
     */
    public String getCoordReqNumber() {
        return coordReqNumber;
    }

    /** 
     * Set the 'CoordReqNumber' element value. Порядковый номер Направления
     * 
     * @param coordReqNumber
     */
    public void setCoordReqNumber(String coordReqNumber) {
        this.coordReqNumber = coordReqNumber;
    }

    /** 
     * Get the 'FarINN' element value. ИНН лица, ответственного за финансовое урегулирование, используется в таможне для печати журнала направление на согласование
     * 
     * @return value
     */
    public String getFarINN() {
        return farINN;
    }

    /** 
     * Set the 'FarINN' element value. ИНН лица, ответственного за финансовое урегулирование, используется в таможне для печати журнала направление на согласование
     * 
     * @param farINN
     */
    public void setFarINN(String farINN) {
        this.farINN = farINN;
    }

    /** 
     * Get the 'FarKPP' element value. КПП лица, ответственного за финансовое урегулирование, используется в таможне для печати журнала направление на согласование
     * 
     * @return value
     */
    public String getFarKPP() {
        return farKPP;
    }

    /** 
     * Set the 'FarKPP' element value. КПП лица, ответственного за финансовое урегулирование, используется в таможне для печати журнала направление на согласование
     * 
     * @param farKPP
     */
    public void setFarKPP(String farKPP) {
        this.farKPP = farKPP;
    }

    /** 
     * Get the 'CreateUserNameFIO' element value. ФИО пользователя, создавшего Направление
     * 
     * @return value
     */
    public PersonBaseType getCreateUserNameFIO() {
        return createUserNameFIO;
    }

    /** 
     * Set the 'CreateUserNameFIO' element value. ФИО пользователя, создавшего Направление
     * 
     * @param createUserNameFIO
     */
    public void setCreateUserNameFIO(PersonBaseType createUserNameFIO) {
        this.createUserNameFIO = createUserNameFIO;
    }

    /** 
     * Get the 'GTDID' element value. Регистрационный номер ДТ
     * 
     * @return value
     */
    public GTDIDType getGTDID() {
        return GTDID;
    }

    /** 
     * Set the 'GTDID' element value. Регистрационный номер ДТ
     * 
     * @param GTDID
     */
    public void setGTDID(GTDIDType GTDID) {
        this.GTDID = GTDID;
    }

    /** 
     * Get the list of 'MeasureList' element items. Меры на основании которых было сформировано направление в функциональные отделы таможен для принятия решений
     * 
     * @return list
     */
    public List<MeasureListType> getMeasureList() {
        return measureList;
    }

    /** 
     * Set the list of 'MeasureList' element items. Меры на основании которых было сформировано направление в функциональные отделы таможен для принятия решений
     * 
     * @param list
     */
    public void setMeasureList(List<MeasureListType> list) {
        measureList = list;
    }

    /** 
     * Get the list of 'GoodsInfo' element items. Информация по товарам, по которым требуется принять решение. Если меры указаны на всю товарную партию в целом, то не подлежит заполнению
     * 
     * @return list
     */
    public List<GoodsInfoType> getGoodsInfoList() {
        return goodsInfoList;
    }

    /** 
     * Set the list of 'GoodsInfo' element items. Информация по товарам, по которым требуется принять решение. Если меры указаны на всю товарную партию в целом, то не подлежит заполнению
     * 
     * @param list
     */
    public void setGoodsInfoList(List<GoodsInfoType> list) {
        goodsInfoList = list;
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
